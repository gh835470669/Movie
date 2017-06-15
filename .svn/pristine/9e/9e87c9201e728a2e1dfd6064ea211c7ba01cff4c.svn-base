<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="cn">
<head>
    <base href="<%=path%>/"/>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <title>${video.title }_VR视频_Hi客VR</title>
    <meta name="keywords" content="VR,VR视频,全景视频,体验,时尚,娱乐,风光,科技,生活,社会,美女">
    <meta name="description" content="Hi客VR，让VR走进生活，我们致力于为VR虚拟现实爱好者提供最优质、专业的VR产业资讯、VR产业观察报告、VR视频娱乐、VR游戏资源下载、游戏评测、游戏攻略、互动交流。VR生活，从Hi客开始！">
    <link rel="stylesheet" type="text/css" href="./iconfont/iconfont.css">
    <link rel="stylesheet" href="./styles/pc_style.css">
    <script src="./scripts/jquery-3.1.0.min.js"></script>
    <!-- <link rel="stylesheet" type="text/css" href="./styles/public.css">
    <link rel="stylesheet" type="text/css" href="./styles/home-header.css">
    <link rel="stylesheet" type="text/css" href="./styles/home-footer.css">
    <link rel="stylesheet" type="text/css" href="./styles/video_public.css">
    <link rel="stylesheet" type="text/css" href="./styles/video_play.css"> -->
    <script language="javascript" type="text/javascript" src="./player/UtoVRPlayerGuide.js"></script>
</head>
<body>
    <!-- header -->
    <div class="z_home">
        <div class="z_fix z_home-header">
            <!-- logo -->
            <h1 class="z_home-logo z_fl">
                <a href="/" title="骇客VR,与你共见未来"></a>
            </h1>
            <!-- menu  width:612:px-->
            <ul class="z_home-menu z_fl">
                <li class="z_fl" id="homePage">
                    <a href="/">
                        首页
                    </a>
                </li>
                <li class="z_fl" id="infoPage">
                    <a href="news/">
                        资讯
                    </a>
                </li>
                <li class="z_fl home-ico" id="videoPage">
                    <a href="video/">
                        视频
                    </a>
                </li>
                <li class="z_fl" id="gamePage">
                    <a href="game/">
                        游戏
                    </a>
                </li>
            </ul>
            <div class="z_search-icon z_fr">
                <i class="iconfont z_icon-color-w" id="search1">
                    &#xe600;
                </i>
            </div>
            <div class="z_search" id="search2">
                <input class="z_search-input" id="input" type="text" autofocus="true" placeholder="请输入搜索内容">
                <i class="iconfont z_search-left-ico z_icon-color-g" id="goSearch">&#xe600;</i>
                <i class="iconfont z_search-right-ico z_icon-color-w" id="cancSearch">&#xe601;</i>
            </div>
        </div>
    </div>

    <div class="z_video_play-screen-father" videourl="${video.videoUrl }" videosrc="${video.source }">
        <!-- 
        <div class="z_video_play-screen z_hide" id="pano"></div>
         -->
        <div class="z_video_play-screen z_hide" style="position:relative;width: 1100px;height: 690px; margin:0 auto;" id="pano"></div>
        <div class="item z_fix">
            <embed src="${video.videoUrl }" allowFullScreen="true" quality="high" width="1100" height="690" align="middle" allowScriptAccess="always" type="application/x-shockwave-flash"></embed>
        </div>
    </div>
    <div class="z_fix z_video_play-title">
        <h2>${video.title }</h2>
        <div class="z_video_play-description">
            <span>${video.preinfo }</span>
        </div>
    </div>
    <div class="z_fix">
        <h4 class="z_video_play-relative-header">更多观看</h4>
        <ul class="z_video_play-relative-content">
            <c:if test="${not empty videos }">
                <c:forEach var="video" items="${videos}">
                    <li class="z_video_class-relative-list z_fl z_pr">
                        <a href="video/${shipinType[video.type]}/${video.videoId }.html" target="_blank">
                            <img class="z_video_play-video-img" src="${video.preimage }" alt="${video.title }"> 
                        </a>
                        <div class="z_video_play-video-bg z_pa"></div>
                        <div class="z_video_play-video-time z_pa">${video.videoLength }</div>
                        <a href="video/${shipinType[video.type]}/${video.videoId }.html">
                            <div class="z_video-play-blank1 z_hide">
                                <div class="z_video_play-play-bg z_pa"></div>
                                <img class="z_video_play-play-icon z_pa" src="./images/play.png">
                            </div>
                        </a>
                        <div class="z_video_play-relative-title">
                            <a href="video/${shipinType[video.type]}/${video.videoId }.html" target="_blank">${video.title }</a>
                        </div>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
    </div>
    <div class="z_home-footer z_pr">
        <div class="z_home-footer-content z_fix">
            <div class="z_fl">
                <h2>Hi客VR，让VR走进生活！</h2>
                <h3>haikevr.com</h3>
            </div>
            <div class="z_fr z_home-footer-contact">
                <img class="z_home-footer-img" src="./images/weChat.jpg">
                <p>扫一扫，每日更多新鲜资讯</p>
            </div>
            <div class="z_fr">
                <ul class="z_home-footer-menu">
                    <li class="z_home-dooter-menu-list z_home-footer-pb z_fl">
                        <a class="z_footer-color-w">网站频道</a>
                    </li>
                    <li class="z_home-dooter-menu-list z_home-footer-pb z_fl">
                        <a class="z_footer-color-w">联系我们</a>
                    </li>
                    <li class="z_home-dooter-menu-list z_fl">
                        <a class="z_footer-color-g" href="news/">VR资讯</a>
                    </li>
                    <li class="z_home-dooter-menu-list z_fl">
                        <a class="z_footer-color-g">内部投稿</a>
                    </li>
                    <li class="z_home-dooter-menu-list z_fl">
                        <a class="z_footer-color-g" href="video/">VR视频</a>
                    </li>
                    <li class="z_home-dooter-menu-list z_fl">
                        <a class="z_footer-color-g">意见反馈</a>
                    </li>
                    <li class="z_home-dooter-menu-list z_fl">
                        <a class="z_footer-color-g" href="game/">VR游戏</a>
                    </li>
                </ul>
            </div>
            <div class="z_home-footer-footer-content z_pa">
                <p>Copyright @ 2016 <a href="http://www.haikevr.com">Hi客VR </a>   All Rights Reserved</p>
                <p>
                    <a href="http://www.miitbeian.gov.cn">粤ICP备16030475号-3</a>
                </p>
            </div>
        </div>
        <div class="z_home-footer-footer z_pa"></div>
    </div>
    <!-- <script type="text/javascript" src="./scripts/z_home-header.js"></script>
    <script type="text/javascript" src="./scripts/video_play.js"></script> -->
    <script type="text/javascript" src="./scripts/bundle_pc.js"></script>
</body>

<script language="javascript" type="text/javascript">
    var url = ''
    /*播放器参数配置*/
    var params = {
        container: document.getElementById("pano"),
        name: "SceneViewer",
        dragDirectionMode: true,
        dragMode: true,
        width: 1100,              //固定视口width
        height: 690,             //固定视口height
        scenesArr: [
            //todo:注意修改视频路径，需要保证播放页面与视频属于同一域名下
            {
                sceneId: "v1",
                sceneName: "赛车",
                sceneFilePath: "${video.videoUrl }",
                sceneType: "Video",
             
            }
        ],
        //播放器不支持全景播放回调
        errorCallBack: function (e) {
            console.log("错误状态：" + e);
        },
        //浏览器不支持全屏回调
        fsCallBack: function (status, playObj) {
            alert("浏览器不支持全屏！");
        }
    };
    /*初始化开始*/
    window.onload = function () {
        var which = document.getElementsByClassName('z_video_play-screen-father')[0];
        var src = which.getAttribute('videosrc');
        url = '"' + which.getAttribute('videourl') + '"';
        if (src == '优酷VR') {
            // alert(url);
            var youku = document.getElementsByTagName('embed')[0];
            youku.setAttribute('src', url);
            // alert(youku.getAttribute('src'));
        } else if (src == 'vrideo') {
            var temp = document.getElementsByClassName('item')[0];
            temp.style.display = 'none';
            temp = document.getElementById('pano');
            temp.style.display = 'block';
            initLoad(params);
        }
    };
</script>
</html>