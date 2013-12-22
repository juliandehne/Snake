// will execute once all scripts and images are finished loading
var picturePath;
//var eventData;
//var eventObject;
$(window).ready(function() {
    picturepath = $("#reloadingPng").attr("src");
    setInterval(reloadGameCanvas, 200);      
});



function reloadGameCanvas() {
     var d = new Date();    
     $("#reloadingPng").attr("src", picturepath+ "?"+d.getTime());   
//     $("#reloadingPng").attr("src", "http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/test2.png?"+d.getTime());   
}



//function handleKeyEvent() {
//    
//    var test;
//    // wenn nach unten gedrückt wurde
//    if (eventObject.keyCode === 40) {
//        alert("unten!");
//    }
//    // wenn nach links gedrückt wurde
//    if (eventObject.keyCode === 37) {
//        alert("links!");
//    }
//    // wenn nach rechts gedrückt wurde
//    if (eventObject.keyCode === 39) {
//        alert("rechts!");
//    }
//    if (eventObject.keyCode === 38) {
//        alert("oben!");
//    } else if (eventObject === null) {
//        alert("eventobjekt null");
//    }
//}