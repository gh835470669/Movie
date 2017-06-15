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
    <title>视频列表_VR视频_Hi客VR</title>
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

    <nav class="nav nav-class clear-f">
        <ul>
            <li class="font-color-5 iconfont nav-class-li nav-li-cur fl"><a href="javascript:;" name="new" class="font-size-1 classify-btn">最新</a></li>
            <li class="font-color-5 iconfont nav-class-li fl"><a href="javascript:;" name="hot" class="font-size-1 classify-btn">最热</a></li>
            <li class="font-color-5 iconfont nav-class-li fl"><a href="javascript:;" name="classify" class="font-size-1 classify-btn">分类&#xe615;</a></li>
        </ul>
    </nav>

    <section class="video-class">
      <ul class="font-color-5 font-size-13">
            <li name="0" class="vedio-class-btn">体验</li>
            <li name="1" class="vedio-class-btn">时尚</li>
            <li name="2" class="vedio-class-btn">娱乐</li>
            <li name="3" class="vedio-class-btn">风光</li>
            <li name="4" class="vedio-class-btn">科技</li>
            <li name="5" class="vedio-class-btn">生活</li>
            <li name="6" class="vedio-class-btn">社会</li>
      </ul>
    </section>

    <section class="container video-container">
        <ul class="video-class-container roll-load">
            <c:if test="${not empty lateVideos }">
                <c:forEach var="video" items="${lateVideos}">
                    <li>
                        <a href="video/${shipinType[video.type]}/${video.videoId }.html" alt="${video.title }" class="index-video">
                            <img src="${video.preimage }" alt="${video.title }">
                            <div class="video-detail center-between">
                                <div class="font-color-5">
                                    <p class="font-size-9 single-ellipsis">${video.title }</p>
                                    <p class="font-size-10">${video.videoLength }</p>
                                </div>
                                <span class="iconfont font-color-5">&#xe610;</span>
                            </div>
                            <div class="bg-black-gradual"></div>
                        </a>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
        <input type="button" value="点击加载更多" class="wu_load btn">
        <p class="wu_is-end">已经没有了</p>
    </section>
    
    <script src="./scripts/bundle.js"></script>
</body>

</html>
