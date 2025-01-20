#AAPS
*查看Wiki:https://wiki.aaps.app
*所有使用过AAPS的人都需要在循环3天后填写表格https://docs.google.com/forms/d/14KcMjlINPMJHVt28MDRupa4sz4DDIooI4SrW0P3HSN8/viewform?c=0&w=1

[![支持服务器](https://img.shields.io/discord/629952586895851530.svg?label=Discord&logo=Discord&colorB=7289da&style=for-the-badge)](https://discord.gg/4fQUWHZ4Mw)

[![CircleCI](https://circleci.com/gh/nightscout/AndroidAPS/tree/master.svg?style=svg)](https://circleci.com/gh/nightscout/AndroidAPS/tree/master)
[![克劳丁](https://d322cqt584bo4o.cloudfront.net/androidaps/localized.svg)](https://translations.aaps.app/project/androidaps)
[![文件状态](https://readthedocs.org/projects/androidaps/badge/?version=latest)](https://wiki.aaps.app/en/latest/?badge=latest)
[![CodeCov](https://codecov.io/gh/nightscout/AndroidAPS/branch/master/graph/badge.svg?token=EmklfIV6bH)](https://codecov.io/gh/nightscout/AndroidAPS)

dev：
[![CircleCI](https://circleci.com/gh/nightscout/AndroidAPS/tree/dev.svg?style=svg)](https://circleci.com/gh/nightscout/AndroidAPS/tree/dev)
[![CodeCov](https://codecov.io/gh/nightscout/AndroidAPS/branch/dev/graph/badge.svg?token=EmklfIV6bH)](https://codecov.io/gh/nightscout/AndroidAPS/tree/dev)

<IMGsrc="https://cdn.iconscout.com/icon/free/png-256/bitcoin-384-920569.png" srcset="https://cdn.iconscout.com/icon/free/png-512/bitcoin-384-920569.png2x" alt="比特币图标" 宽度="100">

3KawK8aQe48478s6fxJ8Ms6VTWkwjgr9f2

##如何支持此项目？
软件遵循GPL V3协议，是完全开源免费的，但开发者写代码、维护需要投入大量时间精力.
大家的支持是项目得以延续的动力。
支持原版请从上方英文链接捐助。
支持码农哥加的功能，请点击以下链接或者扫码。

<一个href="/Documentation/commission.jpg"><IMGsrc="/Documentation/commission.jpg？raw=true" alt="捐赠" 宽度="300"></一个>

https://afdian.net/a/manong
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
*Github操作中的触发器生成
*下载`aaps.zip`文件在`人工制品`

###如果你熟悉安卓开发：
*克隆此代码仓库到你自己的GitHub账号
* 用你自己的安卓签名文件替换你克隆的仓库中的`keystore/demokeystore.jks`
* 在你克隆的仓库设置中的  `操作密码和变量`选项中添加如下秘密环境变量：  
<一个href="/Documentation/screen1.png"><IMGsrc="/Documentation/screen1.png？raw=true" alt="操作机密屏幕截图" 宽度="800"></一个>  
  `key_ALIAS`：你的安卓签名文件的密钥别名。
  `key_PASSWORD`：你的安卓签名文件的key密码.
  `store_FILE`: 你的安卓签名文件的路径。
  `store_PASSWORD`：你的安卓签名文件的store密码.
*在GitHub操作中触发编译
* 下载`人工制品`中的编译产物`aaps.zip` 

###如果您不熟悉Android开发：
您需要获取密钥存储文件的secerts来对应用程序进行签名。出于安全原因，所有密码都不在此存储库中。
**它真的是建议你可以签署你的apk文件与您自己的密钥存储文件后，学习一些Android知识。**
请按照以下步骤操作：
*将此存储库分叉。
*扫描以下二维码，订阅“一型码农龙”微信频道。  
<一个href="/documentation/chicat_qr.png"><IMGsrc="/Documentation/chadicle_qr.png？raw=true" alt="微信频道二维码" 宽度="340"></一个>  
*加入微信群，询问秘密(从“”中间菜单获取微信群二维码一型码农Lex"微信频道，扫描加入)
*在中添加以下机密`操作密码和变量`存储库的设置。  
<一个href="/Documentation/screen1.png"><IMGsrc="/Documentation/screen1.png？raw=true" alt="操作机密屏幕截图" 宽度="800"></一个>  
  `key_ALIAS`,`key_PASSWORD`,`store_FILE`,`store_PASSWORD`.
*Github操作中的触发器生成
*下载`aaps.zip`文件在`人工制品`

###如果你不熟悉安卓开发：
你需要获取安卓签名文件的密码等信息，因安全原因，这些敏感信息不能公开发布于此。
**强烈建议学习相关知识，编译完APK后，用你自己的签名文件签名。**
请按如下步骤操作:
*克隆此代码仓库到你自己的GitHub账号
*扫描下方二维码关注"一型码农Lex"微信公众号.扫描下面的QR码并subscribe"一型码农莱克斯"微信频道。  
<一个href="/documentation/chicat_qr.png"><IMGsrc="/Documentation/chadicle_qr.png？raw=true" alt="微信频道二维码" 宽度="340"></一个>  
*点击"一型码农Lex"微信公众号的中间菜单，获取入群二维码.进去索要签名文件的密码。
* 在你克隆的仓库设置中的  `操作密码和变量`选项中添加如下秘密环境变量：  
<一个href="/Documentation/screen1.png"><IMGsrc="/Documentation/screen1.png？raw=true" alt="操作机密屏幕截图" 宽度="800"></一个>  
  `key_ALIAS`,`key_PASSWORD`,`store_FILE`,`store_PASSWORD`，这些变量的值都在群中。
*在GitHub操作中触发编译
* 下载`人工制品`中的编译产物`aaps.zip`
