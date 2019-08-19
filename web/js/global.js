$(".header_nav a").hover(function () {
    var temp = $(this).attr("abj");
    $(this).attr("abj", $(this).html());
    $(this).html(temp);

},function () {
    var temp = $(this).attr("abj");
    $(this).attr("abj", $(this).html());
    $(this).html(temp);
});