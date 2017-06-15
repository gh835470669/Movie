var zTemp = document.getElementById("zLogin");
if (zTemp) {
    document.getElementById("zLogin").onclick = login;
}

function login() {
    // alert("haha");
    var name = document.getElementById("zUserName").value;
    var pw = document.getElementById("zPassword").value;
    if (name != "" && pw != "") {
        window.location.href = "#";
    }
    else {
        alert("账户和密码不能为空");
    }
}

document.onkeydown = function() {
    var e = event || window.evnet || argument.callee.caller.arguments[0];
    if (e && (e.keyCode == 13)) {
        login();
    }
}
