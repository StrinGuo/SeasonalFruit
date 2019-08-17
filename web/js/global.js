function check(obj) {
    var temp = obj.innerText;
    obj.innerText = obj.title;
    obj.title = temp;
}