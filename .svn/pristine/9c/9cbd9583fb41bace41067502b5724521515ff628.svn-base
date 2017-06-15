(function() {
    var grandfather = document.getElementsByClassName('z_fixed-left')[0];
    var grandfather1 = document.getElementsByClassName('z_td-code')[0];
    var father = document.getElementsByClassName('z_left-weChat');
    var icon = document.getElementsByClassName('z_left-icon');

    father[0].onmouseover = function() {
        mouseover(0);
    }
    father[1].onmouseover = function() {
        mouseover(1);
    }

    father[0].onmouseout = function() {
        mouseout(0);
    }

    father[1].onmouseout = function() {
        mouseout(1);
    }

    function mouseover(id) {
        if (id == 0) {
            father[0].style.backgroundColor = '#02b300'; 
            icon[0].style.backgroundColor = '#02b300';
            icon[id].style.color = '#fff';
            grandfather1.style.display = 'block';
        } else if (id == 1) {
            father[1].style.backgroundColor = '#313131';
            icon[1].style.backgroundColor = '#313131';
            icon[1].style.color = '#fff';
        }
    }

    function mouseout(id) {
        icon[id].style.color = '#bcbcbc';
        icon[id].style.backgroundColor = '#f7f7f7';
        father[id].style.backgroundColor = '#f7f7f7';
        if (id == 0) {
            grandfather1.style.display = 'none';
        }
    }

    window.onscroll = function() {
        grandfather.style.top = document.body.scrollTop + 50 + 'px';
        grandfather1.style.top = document.body.scrollTop - 65 + 'px';
    }
})();