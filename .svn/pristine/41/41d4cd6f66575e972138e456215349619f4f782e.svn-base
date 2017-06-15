(function() {

	var shipinType = [
            "experience", "entertainment", "entertainment", "entertainment", "entertainment", 
            "entertainment", "life", "life", "life", "life", 
            "life", "technology", "technology", "technology", "fashion", 
            "scenery", "scenery", "scenery", "society", "society", 
            "entertainment", "entertainment", "entertainment", "entertainment", "entertainment", 
            "entertainment", "entertainment", "society", "technology", "technology", 
            "entertainment", "entertainment", "life", "technology", "scenery", 
            "fashion", "experience", "society", "life", "life", 
            "experience", "experience", "experience"];
    var more = document.getElementsByClassName('z_video_class-more')[0];
    var moring = document.getElementsByClassName('z_video_class-more1')[0];
    var end = document.getElementsByClassName('z_video_class-more1')[1];
    var request;

    more.onclick = function() {
        var nowNum = document.getElementsByClassName('z_video_class-content-list').length;
        var type = document.getElementsByClassName('z_video-class-father')[0].getAttribute('type');
        var father = document.getElementsByClassName('z_video_class-content')[0];
        request = new XMLHttpRequest();
        // var str = 'http://' + location.host + '/hackvr/json/video.do?index=' + nowNum + '&num=8&type=' + type;
        var str = 'http://' + location.host + '/json/video.do?index=' + nowNum + '&num=8&type=' + type;
        more.style.display = 'none';
        moring.style.display = 'block'
        end.style.display = 'none';
        request.open('Get', str, true);
        request.onreadystatechange = function() {
            if (request.readyState == 4 && request.status == 200) {
                // alert(request.responseText);
                var temp = eval('(' + request.responseText + ')');

                if (temp.isEnd == 'true') {
                    end.style.display = 'block';
                    moring.style.display = 'none';
                    more.style.display = 'none';
                } else {
                    for (var i = 0; i < temp.dataList.length; i++) {
                        // var newEle = document.createElement('li');
                        // newEle.setAttribute('class', 'z_video_class-content-list z_fl z_pr');
                        // var newA = document.createElement('a');
                        // newA.setAttribute('href', 'load/videoplay.do?id=' + temp.videos[i].videoId + ''); // -----------------
                        // var newImg = document.createElement('img');
                        // newImg.setAttribute('class', 'z_video-img');
                        // newImg.setAttribute('src', temp.videos[i].preimage); // ----------------------------
                        // newA.appendChild(newImg);
                        // newEle.appendChild(newA);
                        
                        // var newDiv = document.createElement('div');
                        // newDiv.setAttribute('class', 'z_video_class-video-bg z_pa');
                        // newEle.appendChild(newDiv);

                        // newDiv = document.createElement('div');
                        // newDiv.setAttribute('class', 'z_video_class-video-time z_pa');
                        // newDiv.innerText = temp.videos[i].videoLength; // -------------------------
                        // newEle.appendChild(newDiv);

                        // newA = document.createElement('a');
                        // newA.setAttribute('href', 'load/videoplay.do?id=' + temp.videos[i].videoId); // -------------------
                        // newDiv =document.createElement('div');
                        // newDiv.setAttribute('class', 'z_video_class-play-bg z_pa z_hide');
                        // newImg = document.createElement('img');
                        // newImg.setAttribute('class', 'z_video_class-play-icon z_pa z_hide');
                        // newImg.setAttribute('src', './images/play.png');
                        // // var temp_ = document.createElement("div");
                        // // temp_.setAttribute('class', 'z_video-play z_hide');
                        // newA.appendChild(newDiv);
                        // newA.appendChild(newImg);
                        // // newA.appendChild(temp_);
                        // newEle.appendChild(newA);

                        // newDiv = document.createElement('div');
                        // newDiv.setAttribute('class', 'z_video_class-video-title');
                        // newA = document.createElement('a');
                        // newA.setAttribute('href', 'load/videoplay.do?id=' + temp.videos[i].videoId); // -----------------------------
                        // newA.innerText = temp.videos[i].title;
                        // newDiv.appendChild(newA);
                        // newEle.appendChild(newDiv);

                        // newDiv = document.createElement('div');
                        // newDiv.setAttribute('class', 'z_video_class-count');
                        // newImg = document.createElement('img');
                        // newImg.setAttribute('class', 'z_fl');
                        // newImg.setAttribute('src', './images/played.png');
                        // var newSpan = document.createElement('span');
                        // newSpan.setAttribute('class', 'z_fl');
                        // newSpan.innerText = temp.videos[i].clickNum; // --------------------------
                        // newDiv.appendChild(newImg);
                        // newDiv.appendChild(newSpan);
                        // newEle.appendChild(newDiv);

                        var li = document.createElement('li');
                        li.setAttribute('class', 'z_video_class-content-list z_fl z_pr');
                        li.innerHTML = '<a href="video/'+shipinType[temp.dataList[i].type] + '/' + temp.dataList[i].videoId + '.html"><img class="z_video-img" src="' + temp.dataList[i].preimage + '"></a><div class="z_video_class-video-bg z_pa"></div><div class="z_video_class-video-time z_pa">' + temp.dataList[i].videoLength + '</div><a href="video/'+shipinType[temp.dataList[i].type] + '/' + temp.dataList[i].videoId + '.html"><div class="z_video-play z_hide"><div class="z_video_class-play-bg z_pa"></div><img class="z_video_class-play-icon z_pa" src="./images/play.png"></div></a><div class="z_video_class-video-title"><a href="video/'+shipinType[temp.dataList[i].type] + '/' + temp.dataList[i].videoId + '.html">' + temp.dataList[i].title + '</a></div><div class="z_video_class-count"><img class="z_fl" src="./images/played.png"><span class="z_fl">' + temp.dataList[i].clickNum + '</span></div>';
                        father.appendChild(li);
                    }
                    videoClassAmination();
                    more.style.display = 'block';
                    moring.style.display = 'none';
                    end.style.display = 'none';
                }
            }
        }
        request.send();
    }
})();

var videoClassAmination = function() {
    var videos = document.getElementsByClassName("z_video-img");
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
}

videoClassAmination();
