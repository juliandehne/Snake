$(document).ready(function() {
    var interval = setInterval(reloadGameCanvas, 1000);
    // jQuery methods go here...
    //$("testdiv").keydown(eventData, handleKeyEvent(eventObject));    
});

function reloadGameCanvas() {
    $("#reloadingDiv").load("../web/dynamic2d.jsp #reloadingDiv");          
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