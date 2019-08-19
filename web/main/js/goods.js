function ajax_test() {
    $.ajax({
        url: "../js/good.json", //json文件位置
        type: "GET", //请求方式为get
        dataType: "json", //返回数据格式为json
        async: false,
        success: function (data) { //请求成功完成后要执行的方法
            let mainRightIndex = 0;//控制添加第几个商品栏（如：超级果盒下的每个商品）
            let goodsShowNavUlIndex = 0;//添加第几个ul中的li类栏名称（如：超级果盒）
            const $goodsAllShow = $(".goods_all_show");//全局大div
            $.each(data, function (k, v) {//所有goods_show的kv对(如专利分格：value)
                $.each(v, function (i, item) {//每一个goods_show的遍历
                    //添加每个goods_show中只有一次的数据
                    $goodsAllShow.append('<div class="goods_show">\n' +
                        '                            <div class="goods_show_nav">\n' +
                        '                                <img src="' + item.icon_img + '" class="goods_show_nav_img1"></img>\n' +
                        '                                <span class="goods_show_nav_img2">》' + item.name + '</span>\n' +
                        '                                <ul class="goods_show_nav_ul">\n' +
                        '                                </ul>\n' +
                        '                            </div>\n' +
                        '                            <div class="goods_show_frame">\n' +
                        '                                <div class="main_left">\n' +
                        '                                    <img class="main_left_img" src="' + item.img + '"/>\n' +
                        '                                    <div class="main_left_div">\n' +
                        '                                        <button class="main_left_div_button">立即查看</button>\n' +
                        '                                    </div>\n' +
                        '                                </div>\n' +
                        '                            </div>\n' +
                        '</div>\n');
                    const $goodsShowNavUl = $(".goods_show_nav_ul").eq(goodsShowNavUlIndex);//每一个goods_show中导航对象
                    let rightIndex = 0;//控制每一个goods_show中第一个导航对应商品默认不隐藏
                    $.each(item.classify[0], function (j, goodsShowNavItem) {//遍历所有商品类导航
                        //添加并控制分类商品栏是否隐藏
                        const $goodsShowFrame = $(".goods_show_frame").eq(goodsShowNavUlIndex);
                        if (rightIndex == 0) {
                            $goodsShowNavUl.append('<li class="goods_show_nav_ul_li" style="background-color:#e51e13;"><a href="#">' + j + '</a></li><li>|</li>');//添加商品导航
                            $goodsShowNavUl.children(".goods_show_nav_ul_li").children("a").css("color", "white");
                            $goodsShowFrame.append('<div class="main_right" style="display: block;"></div>');
                        } else {
                            $goodsShowNavUl.append('<li class="goods_show_nav_ul_li" ><a href="#">' + j + '</a></li><li>|</li>');//添加商品导航
                            $goodsShowFrame.append('<div class="main_right" style="display: none;"></div>');
                        }
                        rightIndex = rightIndex + 1;
                        $.each(goodsShowNavItem, function (n, mainRightItem) {//遍历商品栏
                            //添加商品
                            const $mainRight = $('.main_right').eq(mainRightIndex);
                            $mainRight.append('<a href="#" class="goods">\n' +
                                '                                    <img src="' + mainRightItem.src + '"/>\n' +
                                '                                    <span class="goods_info">' + mainRightItem.goods_info + '</span>\n' +
                                '                                    <span class="goods_price">' + mainRightItem.goods_price + '</span>\n' +
                                '                                </a>')
                        });
                        mainRightIndex = mainRightIndex + 1;//每轮商品添加结束需要换到下一个分类商品添加
                    });
                    goodsShowNavUlIndex = goodsShowNavUlIndex + 1;//每轮goods_show添加结束需要转到下一个goods_show的导航对象
                });
            });
        }
    });
}

ajax_test(); //执行函数