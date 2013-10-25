$(document).ready(function() {
    var interval = setInterval(reloadGameCanvas, 5000);
    // jQuery methods go here...
    //$("testdiv").keydown(eventData, handleKeyEvent(eventObject));    
});

function reloadGameCanvas() {
    $("#testdiv").load("../web/dynamic2d.jsp #testdiv");
    $("#testdiv2").load("../web/dynamic2d.jsp #testdiv2", paintHTML5);
    
   
}

function paintHTML5() {
     //paint second canvas
    var c = document.getElementById("myCanvas");
    var ctx = c.getContext("2d");
    ctx.fillStyle = "#FF0000";
    ctx.fillRect(0, 0, 150, 75); 
    ctx.moveTo(0,0);
    ctx.lineTo(100,200);
    ctx.stroke();
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