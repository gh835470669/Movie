(function() {

var zTemp = document.getElementById("search1");
if (zTemp) {
    document.getElementById("search1").onclick = showInput;
}

zTemp = document.getElementById("goSearch");
if (zTemp) {
    document.getElementById("goSearch").onclick = showInput;
}

zTemp = document.getElementById("cancSearch");
if (zTemp) {
    document.getElementById("cancSearch").onclick = showInput;
}

var sId1 = "search1";
var sId2 = "search2";
var menuId = ["homePage", "infoPage", "gamePage", "videoPage"];
var bool = false;
var se = false;
var speed = 1;

function showInput() {
    
    bool = true;
    se = false;
    var target = document.getElementById(sId1);
    target.style.display = "none";
    
    for (var i = 0; i< 4; i++) {
        target = document.getElementById(menuId[i]);
        target.style.display = "none";
    }
    
    target = document.getElementById(sId2);
    target.style.display = "block";
    document.getElementById("input").focus();
    var timer = setInterval(function() {
        if (target.offsetLeft - speed <= 333) {
            target.style.left = "333px";
            speed = 1;
            clearInterval(timer);
        }
        else {
            target.style.left = (target.offsetLeft - speed) +"px";
            speed += 2;
        }
    }, 20);
}

function cancelSearch() {
    if (bool) {
        bool = false;
        var target = document.getElementById(sId1);
        target.style.display = "block";
        
        for (var i = 0; i< 4; i++) {
            target = document.getElementById(menuId[i]);
            target.style.display = "inline";
        }
        
        target = document.getElementById(sId2);
        target.style.display = "none";
        target.style.left = "1063px";
    }
}

function search() {
    se = true;
    cancelSearch();
    window.open("#");
}

zTemp = document.getElementById("input");
if (typeof zTemp !== 'undefined') {
    document.getElementById("input").onblur = function() {
    setTimeout(delay, 200);
    }
}

function delay() {
    if (!se) {
        se = false;
        cancelSearch();
    }
}

})();