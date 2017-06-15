// 立即调用函数
// 启动轮播插件，以及配置轮播插件中的相关组件的位置参数
(function() {
    $(function() {
        // 启动轮播插件
        var unslider = $('.banner').unslider({
            autoplay: true,
            infinite: true,
            arrows: {
                prev: '<a class="unslider-arrow prev iconfont w_arrow">&#xe604;</a>',
                next: '<a class="unslider-arrow next iconfont w_arrow">&#xe603;</a>',
            },

        });

        // 动态改变轮播中图片的大下和位置，使其居中
         var curWinWidth = window.innerWidth,
              wCarouselLi = $('.w_carousel li'),
              wCarouselLiImg = wCarouselLi.children('a').children('img'), // modified by Nicholas 7/26/2016
              wArrow = $('.w_arrow'),
              unsliderNav = $('.unslider-nav'),
              wCarTilte = $('.w_carousel li .w_single-ellipsis'); // 轮播图片的标题

        if (!wCarouselLi || !wCarouselLiImg || !wArrow || !unsliderNav || !wCarTilte) {
            return false;
        }

        var wCarouselLiCount = wCarouselLi.length,
             wCarouselLiImgWidth = parseFloat(wCarouselLiImg.css('width').split('px')[0]),
             wCarouselLiImgMargin = (curWinWidth - wCarouselLiImgWidth) / 2,
             unsliderNavWidth = parseFloat(unsliderNav.css('width').split('px')[0]),
             unsliderNavLeft = (curWinWidth / 2) - (unsliderNavWidth / 2);

        wArrow.css('width', wCarouselLiImgMargin + 'px');
        $('.unslider-nav').css('left', unsliderNavLeft + 'px');

        // 使轮播图中所有图片居中
        for (var i = 0; i < wCarouselLiCount; i++) {
            wCarouselLiImg = wCarouselLi.eq(i).children('a').children('img');
            wCarouselLiImgWidth = parseFloat(wCarouselLiImg.css('width').split('px')[0]);
            wCarouselLiImgMargin = (curWinWidth - wCarouselLiImgWidth) / 2;
            wCarouselLiImg.css('margin-left', wCarouselLiImgMargin - 12 + 'px'); // modified by Nicholas 7/26/2016，微调一下
            wCarouselLiImg.css('margin-right', wCarouselLiImgMargin + 'px');

            // add by Nicholas 7/26/2016
            // 修改轮播标题的位置
            wCarTilte.eq(i).css({
              'left': wCarouselLiImgMargin + 10,
              'width': wCarouselLiImgWidth - 30
            })
        }
    });
})(); // End of 启动轮播插件，以及配置轮播插件中的相关组件的位置参数
