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
    <title>Hi客VR,让VR走进生活_VR_VR资源_VR视频_VR游戏_VR眼镜</title>
    <meta name="keywords" content="VR,VR资讯,VR视频,,VR游戏,Oculus,HTCvive,PSVR,VR产业,VR技术,VR新闻,VR眼镜,虚拟现实">
    <meta name="description" content="Hi客VR，让VR走进生活，我们致力于为VR虚拟现实爱好者提供最优质、专业的VR产业资讯、VR产业观察报告、VR视频娱乐、VR游戏资源下载、游戏评测、游戏攻略、互动交流。VR生活，从Hi客开始！">
    <link rel="stylesheet" href="./styles/app.css">
    <link rel="stylesheet" href="./iconfont/my_icon_font.css">
    <script src="./scripts/jquery-3.1.0.min.js"></script>
    <link rel="stylesheet" href="./styles/unslider.css">
    <script src="./scripts/unslider-min.js"></script>
</head>

<body>
    <header class="logo-header center-center iconfont">
        <a href="/" class="logo"></a>
    </header>

    <nav class="nav">
        <ul class="center-center shrink">
            <li class="nav-li font-size-1 font-color-5"><a href="video/" name="vedio" class="index-scroll">视频</a></li>
            <li class="nav-li font-size-1 font-color-5"><a href="news/" name="information" class="index-scroll">资讯</a></li>
            <li class="nav-li font-size-1 font-color-5"><a href="game/" name="game" class="index-scroll">游戏</a></li>
        </ul>
    </nav>

    <section class="w_carousel_container">
        <div class="banner">
            <ul class="w_carousel">
                <c:if test="${not empty shouyeToutiaos }">
                    <c:forEach var="toutiao" items="${shouyeToutiaos}">
                        <li>
                            <a href="news/${zixunType[toutiao.type]}/${toutiao.articleId}.html">
                                <img src="${toutiao.preimage }" alt="${toutiao.title }">
                                <p class="single-ellipsis font-color-5">${toutiao.title }</p>
                            </a>
                            <div class="shade"></div>
                        </li>
                    </c:forEach>
                </c:if>
            </ul>
        </div>
    </section>

    <section class="container index-container">
        <div id="information" class="center-between font-color-3 index-title">
            <h2 class="font-size-7">最新资讯</h2>
            <a href="news/" class="font-size-8">进入资讯频道</a>
        </div>
        <ul>
            <c:if test="${not empty articles }">
                <c:forEach var="article" items="${articles}">
                    <li class="listbox">
                        <a href="news/${zixunType[article.type]}/${article.articleId}.html" class="_image">
                            <img src="${article.preimage }" alt="${article.title }">
                        </a>
                        <div class="_text flex-1">
                            <a href="news/${zixunType[article.type]}/${article.articleId}.html" class="multi-ellipsis font-color-3">
                                <h2>${article.title }</h2>
                            </a>
                            <div>
                                <a class="tag">
                                    <c:if test="${1 == article.type }">时讯</c:if>
                                    <c:if test="${2 == article.type }">观察</c:if>
                                    <c:if test="${3 == article.type }">游戏</c:if>
                                    <c:if test="${4 == article.type }">影视</c:if>
                                </a>
                                <span class="font-size-2 font-color-4">
                                    <fmt:formatDate value="${article.createTime }" type="both" pattern="yyyy-MM-dd"/>
                                </span>
                            </div>
                        </div>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
    </section>

    <section class="container t-border b-border">
        <div id="vedio" class="center-between font-color-3 index-title">
            <h2 class="font-size-7">视频</h2>
            <a href="video/" class="font-size-8">进入视频频道</a>
        </div>
        <ul>
            <c:if test="${not empty shipinToutiaos }">
                <c:forEach var="video" items="${shipinToutiaos}">
                    <li>
                        <a href="video/${shipinType[video.type]}/${video.videoId }.html" alt="${video.title }" class="index-video">
                            <img src="${video.preimage }" alt="${video.title }">
                            <div class="video-detail center-between">
                                <div class="font-color-5">
                                    <p class="font-size-9 single-ellipsis">${video.preinfo }</p>
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
    </section>

    <section class="container">
        <div id="game" class="center-between font-color-3 index-title">
            <h2 class="font-size-7">游戏</h2>
            <a href="game/" class="font-size-8">进入游戏频道</a>
        </div>
        <ul>
            <c:if test="${not empty lateGames }">
                <c:forEach var="game" items="${lateGames}">
                    <li>
                        <a href="game/${youxiMap[game.type]}/${game.gameId}.html" alt="${game.title }" class="index-game">
                            <img src="${game.preimage }" alt="${game.title }">
                            <div class="index-game-detail center-between">
                                <div class="font-color-5">
                                    <h2 class="font-size-9 single-ellipsis">${game.title }</h2>
                                    <p class="font-size-10 single-ellipsis">${game.preinfo }</p>
                                </div>
                                <p class="iconfont font-color-5"><em class="font-size-7">&#xe60d;</em>
                                <span class="font-size-9">${game.downloadNum}</span></p>
                            </div>
                            <div class="shade"></div>
                        </a>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
    </section>
    
    <script src="./scripts/bundle.js"></script>
</body>

</html>