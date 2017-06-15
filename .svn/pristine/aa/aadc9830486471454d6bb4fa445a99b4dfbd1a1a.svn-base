(function() {
var osIcon = ["z_pcIcon", "z_androidIcon", "z_iOSIcon"]
var osGame = ["z_pcGame", "z_androidGame", "z_iOSGame"]
var turn = 0;
var now = 0;

var zTemp = document.getElementById("z_pcIcon");
if (zTemp) {
    document.getElementById("z_pcIcon").onclick = showContent("z_pcIcon");
}

zTemp = document.getElementById("z_androidIcon");
if (zTemp) {
    document.getElementById("z_androidIcon").onclick = showContent("z_androidIcon");
}

zTemp = document.getElementById("z_iOSIcon");
if (zTemp) {
    document.getElementById("z_iOSIcon").onclick = showContent('z_iOSIcon');
}

function showContent(targetId) {
    return function() {
        for (var i = 0 ; i < 3; i++) {
            if (osIcon[i] == targetId) {
                turn = i;
                break;
            }
        }

        if (turn != now) {
            var turnIcon = document.getElementById(osIcon[turn]);
            var nowIcon = document.getElementById(osIcon[now]);
            turnIcon.style.borderBottom = "3px solid #1e6fff";
            nowIcon.style.borderBottom = "0px";

            var turnGame = document.getElementById(osGame[turn]);
            var nowGame = document.getElementById(osGame[now]);
            turnGame.style.opacity = "1";
            turnGame.style.display = "block";
            nowGame.style.opacity = "0";
            nowGame.style.display = "none";

            now = turn;
        }
    }
}
})();