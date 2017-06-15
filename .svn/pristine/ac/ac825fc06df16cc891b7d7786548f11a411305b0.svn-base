(function() {
    var hot = true;
    var news = false;

    var icon = document.getElementsByClassName('z_video-hot-menu-list');
    icon[0].onclick = function() {
        showContent(0, icon);
    }
    icon[1].onclick = function() {
        showContent(1, icon);
    }

    function showContent(id, icon) {
        var content = document.getElementsByClassName('z_video-hot-body');
        if (id == 0) {
            hot = true;
            news = false;
            icon[0].style.color = '#fff';
            icon[0].style.backgroundColor = '#3893ff';
            icon[1].style.color = '#dcdcdc';
            icon[1].style.backgroundColor = '#fff';
            content[0].style.display = 'block';
            content[1].style.display = 'none';
        } else {
            hot = false;
            news = true;
            icon[0].style.color = '#dcdcdc';
            icon[0].style.backgroundColor = '#fff';
            icon[1].style.color = '#fff';
            icon[1].style.backgroundColor = '#3893ff';
            content[0].style.display = 'none';
            content[1].style.display = 'block';
        }
    }


    var zTemp = document.getElementById('zLeftIcon');
    if (zTemp) {
        zTemp.onclick = function() {
            move('zLeftIcon');
        };
    }
    zTemp = document.getElementById('zRightIcon');
    if (zTemp) {
        zTemp.onclick = function() {
            move('zRightIcon');
        };
    }

    var bool = false;
    function move(targetId) {
        if (bool) return;

        var father;
        if (hot) {
            father = document.getElementsByClassName('z_video-hot-body')[0];
        } else {
            father = document.getElementsByClassName('z_video-hot-body')[1];
        }

        var eleList = father.getElementsByClassName('z_video-hot-list');
        var count = eleList.length;
        var hideNum = (0 - father.offsetLeft) / 377;
        hideNum =  Math.ceil(hideNum);
        
        if (count <= 3) return;
        bool = true;

        if (targetId == 'zLeftIcon') {
            // 过右边
            var terminal;
            if (father.offsetLeft == 0) {
                if (count - 3 > 0) {
                    terminal = 1131 - count * 377;
                }
                var timer = setInterval(function() {
                    if (father.offsetLeft - 20 <= terminal) {
                        father.style.left = terminal + 'px';
                        bool = false;
                        clearInterval(timer);
                    } else {
                        father.style.left = father.offsetLeft - 20 + 'px';
                    }
                }, 3);
                return;
            }

            if (hideNum >= 3) {
                terminal = father.offsetLeft + 1131;
            } else {
                terminal = 0;
            }
            var timer = setInterval(function() {
                if (father.offsetLeft + 20 >= terminal) {
                    father.style.left = terminal + 'px';
                    bool = false;
                    clearInterval(timer);
                } else {
                    father.style.left = father.offsetLeft + 20 + 'px';
                }
            }, 5);
        } else {
            count = count - 3 - hideNum;
            var terminal;
            if (count <= 0) {
                terminal = 0;
                var timer = setInterval(function() {
                    if (father.offsetLeft + 20 >= terminal) {
                        father.style.left = terminal + 'px';
                        bool = false;
                        clearInterval(timer);
                    } else {
                        father.style.left = father.offsetLeft + 20 + 'px';
                    }
                }, 3)
                return; 
            }

            if (count >= 3) {
                terminal = father.offsetLeft - 1131;
            } else {
                terminal = father.offsetLeft - count * 377;
            }

            var timer = setInterval(function() {
                if (father.offsetLeft - 20 <= terminal) {
                    father.style.left = terminal + 'px';
                    bool = false;
                    clearInterval(timer);
                } else {
                    father.style.left = father.offsetLeft - 20 + 'px';
                }
            }, 5);
        }
    }

})();

(function() {

    var now = 0;
    var turn = 0;
    var menuList = document.getElementsByClassName('z_video-class-icon');
    var contentList = document.getElementsByClassName('z_video-class-title');
    var target = document.getElementsByClassName('z_video-class-father')[0];
    menuList[0].onclick = scroll(0);
    menuList[1].onclick = scroll(1);
    menuList[2].onclick = scroll(2);
    menuList[3].onclick = scroll(3);
    menuList[4].onclick = scroll(4);
    menuList[5].onclick = scroll(5);
    menuList[6].onclick = scroll(6);

    var nowPos = 0;
    var temp = 780;
    var target = document.getElementsByClassName('z_video-class-father')[0];
    window.onscroll = function() {
        nowPos = document.body.scrollTop;

        if (nowPos >= 780 && nowPos <= 1000) {
            target.style.paddingTop = '5px';
            target.style.paddingBottom = '5px';
            target.style.position = 'fixed';
            target.style.top = '0px';
        } else if (nowPos < 820 && nowPos >= 500) {
            target.style.paddingTop = '37px';
            target.style.paddingBottom = '37px';
            target.style.position = 'relative';
        }
    }

    function scroll(to) {
        return function() {
            target.style.position = 'fixed';
            target.style.top = '0px';
            target.style.paddingTop = '5px';
            target.style.paddingBottom = '5px';
            turn = to;
            if (now != turn) {
                menuList[now].style.backgroundColor = '#fff';
                menuList[now].style.color = '#dcdcdc';
                menuList[to].style.backgroundColor = '#3893ff';
                menuList[to].style.color = '#fff';
                now = turn;
                // temp = nowPos;
            }
            scrollTo(to);
        }
    }

    function scrollTo(to) {
        contentList[to].scrollIntoView(true);
        window.scrollBy(0, -90);
    }
})();

(function() {
    var videos = document.getElementsByClassName("z_video-class-video-img");
    var playIcon = document.getElementsByClassName('z_video-play1');
    for (var i = 0; i < videos.length; i++) {
        (function(i) {
            videos[i].onmouseover = function() {
                showPlayIcon(i);
            }
            videos[i].onmouseout = function() {
                disaPlayIcon(i);
            }
        })(i);

        (function(i) {
            playIcon[i].onmouseover = function() {
                showPlayIcon(i);
            }
        })(i);
    }

    function showPlayIcon(id) {
        playIcon[id].style.display = 'block';
    }

    function disaPlayIcon(id) {
        playIcon[id].style.display = 'none';
    }
})();

(function() {
    var videos = document.getElementsByClassName("z_video-hot-video-img");
    var playIcon = document.getElementsByClassName('z_video-play');
    for (var i = 0; i < videos.length; i++) {
        (function(i) {
            videos[i].onmouseover = function() {
                showPlayIcon(i);
            }
            videos[i].onmouseout = function() {
                disaPlayIcon(i);
            }
        })(i);

        (function(i) {
            playIcon[i].onmouseover = function() {
                showPlayIcon(i);
            }
        })(i);
    }

    function showPlayIcon(id) {
        playIcon[id].style.display = 'block';
    }

    function disaPlayIcon(id) {
        playIcon[id].style.display = 'none';
    }
})();
