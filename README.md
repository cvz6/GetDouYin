原Java版废弃，改为python脚本实现
===============
代码是摘抄自github[某位大佬](https://github.com/loadchange/amemv-crawler)，并稍作修改。
# 注意事项：

- 需要nodejs和python3环境，自行安装nodejs和python3
- 目前只支持下载指定抖音用户的全部视频(含收藏)，也可以下载指定主题(挑战)或音乐下的全部视频。
- 空闲时间我会改为自动爬取全部用户信息，并自动爬取所有视频
- 有时间的朋友们，可以fork代码修改后提交pull request。

## 怎么样方便地讨论交流
### 直接[创建issues](https://github.com/liupeng328/GetDouYin/issues/new)


## 环境安装

#### 程序猿和程序媛见这里


配置好你的Python、node环境,然后`pip install requirements.txt `.

或者

```bash
$ git clone https://github.com/liupeng328/GetDouYin.git 
$ cd amemv-crawler
$ pip install -r requirements.txt
$ python amemv-video-ripper.py

```

大功告成,直接跳到下一节配置和运行.

## 配置和运行

有两种方式来指定你要下载的抖音号分享链接,一是编辑`share-url.txt`,二是指定命令行参数.

### 第一种方法:编辑share-url.txt文件

找到一个文字编辑器,然后打开文件`share-url.txt`,把你想要下载的抖音号分享链接编辑进去,以逗号/空格/tab/表格鍵/回车符分隔,可以多行.例如, 这个文件看起来是这样的:

```
https://www.douyin.com/share/user/85860189461?share_type=link&tt_from=weixin&utm_source=weixin&utm_medium=aweme_ios&utm_campaign=client_share&uid=97193379950&did=30337873848,

https://www.iesdouyin.com/share/challenge/1593608573838339?utm_campaign=clien,

https://www.iesdouyin.com/share/music/6536362398318922509?utm_campaign=client_share&app=aweme&utm_medium=ios&iid=30337873848&utm_source=copy
```

### 获取用户分享链接的方法（挑战、音乐 类似）
直接在抖音分享，然后复制连接发送到qq或微信或者自己粘贴出来即可。

<img src="https://raw.githubusercontent.com/loadchange/amemv-crawler/master/picture/step1.jpg" width="320">
<img src="https://raw.githubusercontent.com/loadchange/amemv-crawler/master/picture/step2.jpg" width="320">


然后保存文件,双击运行`amemv-video-ripper.py`或者在终端(terminal)里面
运行`python amemv-video-ripper.py`

### 第二种方法:使用命令行参数(仅针对会使用操作系统终端的用户)

如果你对Windows或者Unix系统的命令行很熟悉,你可以通过指定运行时的命令行参数来指定要下载的站点:

某些平台下注意给URL增加引号

```bash
python amemv-video-ripper.py URL1,URL2
```

分享链接以逗号分隔,不要有空格.

### 视频的下载与保存

程序运行后,会默认在当前路径下面生成一个跟抖音ID名字相同的文件夹,
视频都会放在这个文件夹下面.

运行这个脚本,不会重复下载已经下载过的视频,所以不用担心重复下载的问题.同时,多次运行可以
帮你找回丢失的或者删除的视频.

然后重新运行下载命令.
<p align="center"><img src="https://raw.githubusercontent.com/loadchange/amemv-crawler/master/picture/end-of-run.jpg" width="800"></p>

## 高级应用

如果你想下载整个挑战主题，请在 share-url.txt 文件中添加 挑战的分享URL

如果你想下载按音乐去下载，请在 share-url.txt 文件中添加 音乐的分享URL

如下: 既为抖音号、挑战主题和音乐的三种爬虫方式，需要注意的是，爬虫只对搜索结果第一的结果进行下载，所以请尽量完整的写出你的 主题或音乐名称。

```
https://www.douyin.com/share/user/85860189461?share_type=link&tt_from=weixin&utm_source=weixin&utm_medium=aweme_ios&utm_campaign=client_share&uid=97193379950&did=30337873848,

https://www.iesdouyin.com/share/challenge/1593608573838339?utm_campaign=clien,

https://www.iesdouyin.com/share/music/6536362398318922509?utm_campaign=client_share&app=aweme&utm_medium=ios&iid=30337873848&utm_source=copy
```

> 短地址的情况

```
http://v.douyin.com/cDo2P/,

http://v.douyin.com/cFuAN/,

http://v.douyin.com/cMdjU/
```

### 关于签名破解
```
node fuck-byted-acrawler.js 这里是参数：用户id/视频id
```
## 加群讨论
QQ群：967073790
点击链接加入群聊【开发者交流群】：https://jq.qq.com/?_wv=1027&k=5l6VTXa

