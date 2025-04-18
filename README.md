##如何支持此项目？
软件遵循GPL V3协议，是完全开源免费的，但开发者写代码、维护需要投入大量时间精力.
大家的支持是项目得以延续的动力。
支持码农哥加的功能，请点击以下链接(申办方)或者扫码。


https://afdian.com/a/manong

<一个href="/Documentation/commission.jpg"><IMGsrc="/Documentation/commission.jpg？raw=true" alt="捐赠" 宽度="300"></一个>

##如何构建
## 如何编译

###如果您熟悉Android开发：
*将此存储库分叉。
*取代`keystore/demokeystore.jks`用你自己的密钥存储文件。
*在中添加以下机密`操作密码和变量`存储库的设置。  
<一个href="/Documentation/screen1.png"><IMGsrc="/Documentation/screen1.png？raw=true" alt="操作机密屏幕截图" 宽度="800"></一个>  
  `key_ALIAS`：密钥存储文件的密钥alais。
  `key_PASSWORD`：密钥存储文件的密钥密码。
  `store_FILE`：存储库中密钥存储文件的路径。
  `store_PASSWORD`：存储密钥存储文件的密码。
**在Github操作中触发生成
**下载“artifacts”中的“aaps.zip”文件`aaps.zip` file in `Artifacts`

### 如果你熟悉安卓开发：
**克隆此代码仓库到你自己的GitHub账号
**用你自己的安卓签名文件替换你克隆的仓库中的‘keystore/demokeystore.jks'`keystore/demokeystore.jks`
**在你克隆的仓库设置中的‘操作密码和变量'选项中添加如下秘密环境变量：`Actions secrets and variables` 选项中添加如下秘密环境变量：  
<<a href="/Documentation/screen1.png"><img src="/Documentation/screen1.png？raw=true"alt="操作秘密截图"width="800"></a>href="/Documentation/screen1.png"><img src="/Documentation/screen1.png?raw=true" alt="Screenshot of Actions secrets" width="800"></a>  
'Key_ALIAS'：你的安卓签名文件的密钥别名。`KEY_ALIAS`:  你的安卓签名文件的key alias。
'Key_PASSWORD'：你的安卓签名文件的key密码.`KEY_PASSWORD`: 你的安卓签名文件的key密码。
'store_FILE'：你的安卓签名文件的路径。`STORE_FILE`: 你的安卓签名文件的路径。
'store_PASSWORD'：你的安卓签名文件的store密码.`STORE_PASSWORD`: 你的安卓签名文件的store密码。
**在GitHub操作中触发编译
**下载‘工件‘中的编译产物‘aaps.zip'`Artifacts`中的编译产物`aaps.zip` 

### If your are NOT familiar with Android development:
您需要获取密钥存储文件的secerts以对应用程序进行签名。出于安全原因，所有密码都不在此存储库中。
**It's really recommanded that you can sign your apk file with your own key store file after learning some Android knowledge.**
请按照以下步骤操作：
**分叉此存储库。
**扫描以下二维码，订阅“一型码农龙”微信频道。  
<<a href="/Documentation/chicat_qr.png"><img src="/Documentation/chicat_qr.png？raw=true"alt="微信频道二维码"width="340"></a>href="/Documentation/wechat_qr.png"><img src="/Documentation/wechat_qr.png?raw=true" alt="WeChat Channel QR code" width="340"></a>  
**加入微信群，询问秘密(从“”中间菜单获取微信群二维码一型码农Lex"微信频道，扫描加入)
**在存储库的“操作密码和变量”设置中添加以下密码。`Actions secrets and variables` settings of your repository.  
<<a href="/Documentation/screen1.png"><img src="/Documentation/screen1.png？raw=true"alt="操作秘密截图"width="800"></a>href="/Documentation/screen1.png"><img src="/Documentation/screen1.png?raw=true" alt="Screenshot of Actions secrets" width="800"></a>  
'Key_ALIAS'、'KEY_PASSWORD'、'STORE_FILE'、'STORE_PASSWORD'。`KEY_ALIAS`, `KEY_PASSWORD`, `STORE_FILE`, `STORE_PASSWORD`. 
**在Github操作中触发生成
**下载“artifacts”中的“aaps.zip”文件`aaps.zip` file in `Artifacts`

### 如果你不熟悉安卓开发：
你需要获取安卓签名文件的密码等信息，因安全原因，这些敏感信息不能公开发布于此。
**强烈建议学习相关知识，编译完APK后，用你自己的签名文件签名。**
请按如下步骤操作:
**克隆此代码仓库到你自己的GitHub账号
**扫描下方二维码关注"一型码农Lex"微信公众号。扫描以下二维码并订阅"一型码农莱克斯"微信频道。  
<<a href="/Documentation/chicat_qr.png"><img src="/Documentation/chicat_qr.png？raw=true"alt="微信频道二维码"width="340"></a>href="/Documentation/wechat_qr.png"><img src="/Documentation/wechat_qr.png?raw=true" alt="WeChat Channel QR code" width="340"></a>  
**点击"一型码农Lex"微信公众号的中间菜单，获取入群二维码.进去索要签名文件的密码。
**在你克隆的仓库设置中的‘操作密码和变量'选项中添加如下秘密环境变量：`Actions secrets and variables` 选项中添加如下秘密环境变量：  
<<a href="/Documentation/screen1.png"><img src="/Documentation/screen1.png？raw=true"alt="操作秘密截图"width="800"></a>href="/Documentation/screen1.png"><img src="/Documentation/screen1.png?raw=true" alt="Screenshot of Actions secrets" width="800"></a>  
'Key_ALIAS'，'KEY_PASSWORD'，'STORE_FILE'，'STORE_PASSWORD'，这些变量的值都在群中。`KEY_ALIAS`, `KEY_PASSWORD`, `STORE_FILE`, `STORE_PASSWORD`，这些变量的值都在群中。
**在GitHub操作中触发编译
**下载‘工件‘中的编译产物‘aaps.zip'`Artifacts`中的编译产物`aaps.zip`
