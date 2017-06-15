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
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <title>${video.title }_VR视频_Hi客VR</title>
    <meta name="keywords" content="VR,VR视频,全景视频,体验,时尚,娱乐,风光,科技,生活,社会,美女">
    <meta name="description" content="Hi客VR，让VR走进生活，我们致力于为VR虚拟现实爱好者提供最优质、专业的VR产业资讯、VR产业观察报告、VR视频娱乐、VR游戏资源下载、游戏评测、游戏攻略、互动交流。VR生活，从Hi客开始！">
    <link rel="stylesheet" href="./styles/app.css">
    <link rel="stylesheet" href="./iconfont/my_icon_font.css">
    <script src="./scripts/jquery-3.1.0.min.js"></script>
</head>

<body>
    <header class="logo-header center-center iconfont">
        <a href="/" class="logo"></a>
    </header>

    <section class="video-play">
        <img src="${video.preimage }" alt="${video.title }">
        <div class="video-play-detail font-color-5">
            <h1 class="single-ellipsis font-size-12">${video.title }</h1>
            <p class="font-size-9">${video.preinfo }</p>
            <div class="btn font-size-12">前往PC端观看</div>
        </div>
        <div class="shade"></div>
    </section>

    <section class="video-more">
        <div class="center-center font-size-2 more">
            <hr class="flex-1">
            <span>你还可以</span>
            <hr class="flex-1">
        </div>
        <div class="video-more-read">
            <img src="./images/newsPreimage.jpg" alt="相关图片">
            <a href="news/" class="btn">进入资讯频道</a>
            <div class="shade"></div>
        </div>
        <div class="video-more-read">
            <img src="./images/gamePreimage.jpg" alt="相关图片">
            <a href="game/" class="btn">进入游戏频道</a>
            <div class="shade"></div>
        </div>
    </section>
    
    <script src="./scripts/bundle.js"></script>
</body>

</html>
