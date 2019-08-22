$(".header_nav a").hover(function () {
    var temp = $(this).attr("name");
    $(this).attr("name", $(this).html());
    $(this).html(temp);

}, function () {
    var temp = $(this).attr("name");
    $(this).attr("name", $(this).html());
    $(this).html(temp);
});
$("#main_sub_nav").mouseover(function () {
    $("#main_sub_nav").show();
}).mouseout(function () {
    $("#main_sub_nav").hide();
});