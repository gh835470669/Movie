(function() {
    var videos = document.getElementsByClassName("z_home-video-img");
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
