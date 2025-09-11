package app.aaps.plugins.main.profile

import android.net.http.SslError
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.webkit.ConsoleMessage
import android.webkit.SslErrorHandler
import android.webkit.WebChromeClient
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import app.aaps.plugins.main.R
import app.aaps.plugins.main.databinding.FragmentNoteBinding

class NoteFragment : Fragment() {
    private var binding: FragmentNoteBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        val myWebView: WebView = binding!!.webview
        val settings = myWebView.settings
        // 启用SPA必需的基础设置
        settings.javaScriptEnabled = true // 启用JavaScript
        settings.domStorageEnabled = true // 启用DOM存储（SPA依赖）
        settings.databaseEnabled = true   // 启用数据库存储
        settings.allowFileAccess = true   // 允许文件访问
        settings.useWideViewPort = true   // 支持viewport属性
        settings.loadWithOverviewMode = true // 初始加载时显示全页面
        settings.builtInZoomControls = true // 启用缩放控件
        settings.displayZoomControls = false // 隐藏缩放按钮
        settings.cacheMode = WebSettings.LOAD_DEFAULT // 设置缓存模式

        // 关键修复：处理WebView的触摸事件，阻止滑动事件传递到ViewPager2
        myWebView.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN                          -> {
                    // 请求父容器不要拦截触摸事件
                    v.parent.requestDisallowInterceptTouchEvent(true)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    // 恢复父容器的触摸事件拦截
                    v.parent.requestDisallowInterceptTouchEvent(false)
                }
            }
            // 让WebView处理自己的触摸事件
            false
        }

        // 配置WebViewClient处理页面加载和错误
        myWebView.webViewClient = object : WebViewClient() {
            // 处理SSL证书错误（调试环境使用，生产环境建议移除）
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed() // 临时接受所有证书，生产环境需验证证书有效性
            }

            // 处理页面加载错误
            override fun onReceivedError(view: WebView?, request: WebResourceRequest?, error: WebResourceError?) {
                super.onReceivedError(view, request, error)
                Log.e("WebView", "加载错误: ${error?.errorCode} - ${error?.description}")
            }

            // 适配Android 21+的API
            @Suppress("DEPRECATION")
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && request != null) {
                    // 对于Android 21及以上版本，使用request.url
                    view?.loadUrl(request.url.toString())
                    return true
                } else if (request == null && view != null) {
                    // 对于旧版本Android，使用getUrl()方法
                    view.loadUrl(view.url.toString())
                    return true
                }
                return super.shouldOverrideUrlLoading(view, request)
            }
        }

        // 配置WebChromeClient处理JavaScript对话框、console日志等
        myWebView.webChromeClient = object : WebChromeClient() {
            // 捕获JavaScript的console日志（便于调试）
            override fun onConsoleMessage(consoleMessage: ConsoleMessage): Boolean {
                Log.d("WebViewConsole", "${consoleMessage.message()} -- 行号: ${consoleMessage.lineNumber()}")
                return true
            }
        }

        // 加载目标URL
        // myWebView.loadUrl("https://dft-idmstest.omodaglobal.com")
        myWebView.loadUrl("http://121.41.11.76:8080")

        return binding?.root
    }
}