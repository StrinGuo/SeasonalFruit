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
    $("#main_sub_nav").show()
}, function () {
    // 鼠标移出时移出hover类
    $("#main_sub_nav").hide();

});

$("#main_sub_nav").mouseover(function () {
    $("#main_sub_nav").show()
}).mouseout(function () {
    $("#main_sub_nav").hide();
});