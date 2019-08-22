$(function () {
    // showAD();
    setInterval("showAD()", 4000);
});
var t = 1;

function showAD() {
    if (t == 1) {
        $("#img4").hide();
        $("#img1").show();
        t += 1;
        return;
    }
    if (t == 2) {
        $("#img1").hide();
        $("#img2").show();
        t += 1;
        return;
    }
    if (t == 3) {
        $("#img2").hide();
        $("#img3").show();
        t += 1;
        return;
    }
    if (t == 4) {
        $("#img3").hide();
        $("#img4").show();
        t = 1;
        return;
    }

}

var f = 1;
$('#main_nav_goods_nav').hover(function () {
    // 鼠标移入时添加hover类
    $("#main_sub_nav").show();
}, function () {
    // 鼠标移出时移出hover类
    $("#main_sub_nav").hide();

});



$(".goods_show_nav_ul_li").hover(function () {
    $(this).parent().children(".goods_show_nav_ul_li").css("background-color", "white");
    $(this).parent().children(".goods_show_nav_ul_li").children("a").css("color", "#666");
    $(this).css("background-color", "#e51e13");
    $(this).children("a").css("color", "white");
    const $goodShowNavUlLi = $(this);
    let num;//对应第几个div
    $(this).parent().children(".goods_show_nav_ul_li").each(function (i) {
        if ($(this).index() === $goodShowNavUlLi.index()) {//遍历判断找到和当前元素一样的标签来确定div是第几个
            num = i;
        }
    });
    const $father = $(this).parent().parent();
    const $children = $father.next().children(".main_right");//找到nav对应的所有的div
    $children.each(function (i) {
        if (i == num) {//如果div等于nav对应的值就显示div
            $(this).css("display", "block");
        } else {//将不是对应的div全部隐藏
            $(this).css("display", "none");
        }
    });
});