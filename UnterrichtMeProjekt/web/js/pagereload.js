$(document).ready(function () {
    var interval = setInterval(reloadGameCanvas, 500);
    // jQuery methods go here...
    $("testdiv").keydown(eventData, handleKeyEvent(eventObject));
});

function reloadGameCanvas() {
    $("#testdiv").load("../web/dynamic2d.jsp #testdiv");
}

function handleKeyEvent(eventObject) {
    // wenn nach unten gedrückt wurde
    if (eventObject.keyCode == 40) {

    }
    // wenn nach links gedrückt wurde
    if (eventObject.keyCode == 37) {

    }
    // wenn nach rechts gedrückt wurde
    if (eventObject.keyCode == 39) {

    }
    if (eventObject.keyCode == 38) {

    }
}