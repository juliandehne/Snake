$(document).ready(function(){
    var interval = setInterval(reloadGameCanvas, 100);
    // jQuery methods go here...

});

function reloadGameCanvas() {
    $("#testdiv").load("../web/index.jsp #testdiv");
}