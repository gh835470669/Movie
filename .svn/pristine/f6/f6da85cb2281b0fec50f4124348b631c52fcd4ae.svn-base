var nowCon = 0;
var turnCon = 0;
var now_pos = -1;
var turn_pos = -1;
var bool = false;

var menuId = ["zPublish", "zSelect", "zDelete"];
var conId = ["zPublishContent", "zSelectContent", "zDeleteContent"];
var iconId = ["zPublishIcon", "zNextIcon", "zDeleteIcon", "zUpdateIcon", "zBackIcon"];
var z_hot_pos_id = ["zHomeHotA", "zHomeHotB", "zHomeHotC", "zInfoHotA1", "zInfoHotA2", "zInfoHotA3", "zInfoHotB", "zInfoHotC", "zInfoHotD", "zInfoHotE"];
var z_select_con_id = ["zSelConDet1", "zSelConDet2", "zSelConDet3", "zSelConDet4", "zSelConDet5", "zSelConDet6", "zSelConDet7", "zSelConDet8", "zSelConDet9", "zSelConDet10"]

var zTemp = document.getElementById("zPublish");
if (zTemp) {
    document.getElementById("zPublish").onclick = showPage("zPublish");
}

zTemp = document.getElementById("zSelect");
if (zTemp) {
    document.getElementById("zSelect").onclick = showPage("zSelect");
}

zTemp = document.getElementById("zDelete");
if (zTemp) {
    document.getElementById("zDelete").onclick = showPage("zDelete");
}

// 显示哪一个板块的内容
function showPage(targetId) {
    return function() {
        selectContent(targetId);
    }
}

function selectContent(targetId) {
    for (var i = 0; i < 3; i++) {
        if (targetId == menuId[i]) {
            turnCon = i;
            break;
        }
    }

    if (turnCon != nowCon) {
        var now = document.getElementById(menuId[nowCon]);
        var turn = document.getElementById(menuId[turnCon]);
        now.style.backgroundColor = "#dcdcdc";
        now.style.color = "#000";
        turn.style.backgroundColor = "#707070";
        turn.style.color = "#fff";

        now = document.getElementById(conId[nowCon]);
        turn = document.getElementById(conId[turnCon]);
        now.style.display = "none";
        turn.style.display = "block";

        now = document.getElementById(iconId[nowCon]);
        now.style.display = "none";
        if (turnCon != 1 || bool == true) {
            turn = document.getElementById(iconId[turnCon]);
            turn.style.display = "block";
            if (turnCon != 1) {
                document.getElementById(iconId[3]).style.display = "none";
                document.getElementById(iconId[4]).style.display = "none";
            }
        }
        nowCon = turnCon;
    }
}

zTemp = document.getElementById("zPublishIcon");
if (zTemp) {
    document.getElementById("zPublishIcon").onclick = publishHot;
}

zTemp = document.getElementById("zDeleteIcon");
if (zTemp) {
    document.getElementById("zDeleteIcon").onclick = deleteHot;
}

// 发布头条
function publishHot() {
    var str = "";
    
    var art_list = document.getElementsByClassName("z_backstage-list-p");
    var check_box = new Array();
    var span = new Array();
    
    for (var i = 0; i < art_list.length; i++) {
        var input = art_list[i].getElementsByTagName("input");
        if (input[0].checked) {
            check_box.push(input[0]);
            var span_tem = art_list[i].getElementsByClassName("z_backstage-list-flag");
            span.push(span_tem[0]);
            var title = art_list[i].getElementsByTagName("a");
            str += (title[0].innerText + "\n");
        }
    }

    if (span.length == 0) {
        alert("请至少选中一篇要发布的文章！！！");
    } else {
        if (confirm("确定要发布以下：\n" + str + span.length + "篇文章？")) {
            for (var i = 0; i < span.length; i++) {
                check_box[i].checked = false;
                check_box[i].style.display = "none";
                span[i].style.display = "block";
            }

            alert("成功发布以下：\n" + str + span.length + "篇文章！");
        }    
    }
}

// 删除头条
function deleteHot() {
    var str = "";
    
    var art_list = document.getElementsByClassName("z_backstage-list-d");
    var check_box = new Array();
    var span = new Array();
    
    for (var i = 0; i < art_list.length; i++) {
        var input = art_list[i].getElementsByTagName("input");
        if (input[0].checked) {
            check_box.push(input[0]);
            var span_tem = art_list[i].getElementsByClassName("z_backstage-list-flag");
            span.push(span_tem[0]);
            var title = art_list[i].getElementsByTagName("a");
            str += (title[0].innerText + "\n");
        }
    }

    if (span.length == 0) {
        alert("请至少选中一篇要删除的文章！！！");
    } else {
        if (confirm("确定要删除以下：\n" + str + span.length + "篇文章？")) {
            for (var i = 0; i < span.length; i++) {
                check_box[i].checked = false;
                check_box[i].style.display = "none";
                span[i].style.display = "block";
            }

            alert("成功删除以下：\n" + str + span.length + "篇文章！");
        }    
    }
}

var nowStr = "";

zTemp = document.getElementById("zHomeHotA");
if (zTemp) {
    document.getElementById("zHomeHotA").onclick = getPos("zHomeHotA");
}

zTemp = document.getElementById("zHomeHotB");
if (zTemp) {
    document.getElementById("zHomeHotB").onclick = getPos("zHomeHotB");
}

zTemp = document.getElementById("zHomeHotC");
if (zTemp) {
    document.getElementById("zHomeHotC").onclick = getPos("zHomeHotC");
}

zTemp = document.getElementById("zInfoHotA1");
if (zTemp) {
    document.getElementById("zInfoHotA1").onclick = getPos("zInfoHotA1");
}

zTemp = document.getElementById("zInfoHotA2");
if (typeof zTemp !== 'undefined') {
    document.getElementById("zInfoHotA2").onclick = getPos("zInfoHotA2");
}

zTemp = document.getElementById("zInfoHotA3");
if (zTemp) {
    document.getElementById("zInfoHotA3").onclick = getPos("zInfoHotA3");
}

zTemp = document.getElementById("zInfoHotB");
if (zTemp) {
    document.getElementById("zInfoHotB").onclick = getPos("zInfoHotB");
}

zTemp = document.getElementById("zInfoHotC");
if (zTemp) {
    document.getElementById("zInfoHotC").onclick = getPos("zInfoHotC");
}

zTemp = document.getElementById("zInfoHotD");
if (zTemp) {
    document.getElementById("zInfoHotD").onclick = getPos("zInfoHotD");
}

zTemp = document.getElementById("zInfoHotE");
if (typeof zTemp !== 'undefined') {
    document.getElementById("zInfoHotE").onclick = getPos("zInfoHotE");
}

zTemp = document.getElementById("zNextIcon");
if (zTemp) {
    document.getElementById("zNextIcon").onclick = zNextSelect;
}

zTemp = document.getElementById("zBackIcon");
if (zTemp) {
    document.getElementById("zBackIcon").onclick = zBackSelect;
}

zTemp = document.getElementById("zUpdateIcon");
if (zTemp) {
    document.getElementById("zUpdateIcon").onclick = zUpdateHot;
}

function getPos(target_id) {
    return function() {
        selectPos(target_id);
    }
}

function selectPos(target_id) {
    bool = true;
    for (var i = 0; i < 10; i++) {
        if (target_id == z_hot_pos_id[i]) {
            turn_pos = i;
            break;
        }
    }

    if (turn_pos != now_pos) {
        if ( now_pos != -1) {
            var now = document.getElementById(z_hot_pos_id[now_pos]);
            now.style.backgroundColor = "#fff";
            now.style.color = "#000";
            now = document.getElementById(z_select_con_id[now_pos]);
            now.style.display = "none";
        }
        
        var turn = document.getElementById(z_hot_pos_id[turn_pos]);
        turn.style.backgroundColor = "#707070";
        turn.style.color = "#fff";
        turn = document.getElementById(z_select_con_id[turn_pos]);
        turn.style.display = "block";
        nowStr = turn.getElementsByTagName("h2")[0].innerText;
        nowStr = nowStr.replace("：", "");

        document.getElementById("zNextIcon").style.display = "block";

        now_pos = turn_pos;
    }
}

function zNextSelect() {
    document.getElementById("zNextIcon").style.display = "none";
    document.getElementById("zBackIcon").style.display = "block";
    document.getElementById("zUpdateIcon").style.display = "block";

    document.getElementById("zSelectContent1").style.display = "none";
    document.getElementById("zSelectContent2").style.display = "block";
}

function zBackSelect() {
    document.getElementById("zNextIcon").style.display = "block";
    document.getElementById("zBackIcon").style.display = "none";
    document.getElementById("zUpdateIcon").style.display = "none";

    document.getElementById("zSelectContent1").style.display = "block";
    document.getElementById("zSelectContent2").style.display = "none";
}

function zUpdateHot() {
    var art_list = document.getElementsByClassName("z_backstage-list1");

    var found = false;
    var target = null;
    var input;

    for (var i = 0; i < art_list.length; i++) {
        input = art_list[i].getElementsByTagName("input")[0];
        if (input.checked) {
            target = art_list[i];
            found = true;
            break;
        }
    }

    if (!found) {
        alert("请选择一篇文章替换当前选中的头条");
    } else {
        if (confirm("确定把选中的头条替换" + nowStr + "？")) {
            var title = target.getElementsByTagName("a")[0].innerText;
            var date = target.getElementsByTagName("span")[0].innerText;
            var detail = target.getElementsByTagName("p")[0].innerText;

            var info = document.getElementById(z_select_con_id[now_pos]);
            info.getElementsByTagName("h3")[0].innerText = title;
            var temp = info.getElementsByTagName("span");
            temp[0].innerText = date;
            temp[1].innerText = detail;

            alert("更新成功");
            zBackSelect();
        }
    }

    input.checked = false;
}
