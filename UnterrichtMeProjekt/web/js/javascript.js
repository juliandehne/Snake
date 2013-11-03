// will execute once all scripts and images are finished loading
$(window).ready(function() {
    setInterval(reloadGameCanvas, 2000);      
});
// jQuery methods go here...
//$("testdiv").keydown(eventData, handleKeyEvent(eventObject));    

function reloadGameCanvas() {
     var d = new Date();
     $("#reloadingPng").attr("src", "http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/test2.png?"+d.getTime());   
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