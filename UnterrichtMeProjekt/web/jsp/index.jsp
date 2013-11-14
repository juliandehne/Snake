<%-- 
    Document   : snake
    Created on : 24.10.2013, 20:25:00
    Author     : Julian Dehne
--%>
<%@page import="gamelogic.Facing"%>
<!-- JSP Imports  -->
<%@page import="controller.Task"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="picture.CreatePicture"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    //Konfiguration für PictureLoad  
    String picturePath = "/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/spiel.png";
    // Hier müsst ihr den Pfad des ROOT Verzeichnis auf euerem Server angeben
    // bei euch zu 99% /var/lib/tomcat6/webapps/ROOT/
    
    String tomcatRootPath = "/Library/Tomcat/Home/webapps/ROOT/"; //HOME
    //String tomcatRootPath = "/var/lib/tomcat6/webapps/ROOT/"; //SCHOOL
    
    File deployStream = new File(tomcatRootPath + picturePath);
    request.setAttribute("Pfad für die Erstellung von Bildern", deployStream.getPath());
    // Hier müsst ihr eure IP eintragen
    
    String ip = "http://localhost:8080"; //HOME
    //String ip = "http://10.25.25.142:8080"; //SCHOOL
    
    String pictureRootAddress = picturePath;
    String pictureAddress = ip + pictureRootAddress;
    request.setAttribute("Pfad für die Addressierung von Bildern per URl", pictureAddress);
    request.setAttribute("pictureAddress", pictureAddress); //fürs einsetzen in HTML 
    
    // Die Addresse dieser Seite
    String thisSiteRootAddress = "/git/UnterrichtMe/UnterrichtMeProjekt/build/web/";
    String thisSiteAddress = ip + thisSiteRootAddress; 
    request.setAttribute("thisSiteAddress", thisSiteRootAddress);
    
    
    //Bilder laden im Hintergrund aktivieren
    request.getSession().setAttribute("task", new Task(deployStream));
%>

<!DOCTYPE html>
<!--Hier beginnt die HTML-Seite-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Snake Projekt</title>       
        <!-- Javascript imports für Pic-Reload - bitte ignorieren -->
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/javascript.js?id=${pageContext.session.id}" type="text/javascript"></script>
    </head>

    <body>                 
        <table>
            <thead>
                <tr>
                    <td>Spielfläche</td>
                    <td>SpielControls etc.</td>
                </tr>
            </thead>
            <tbody>
                <tr> 
                    <td>
                        <!-- Hier wird das Bild eingefügt: Das reloadingDivnicht anfassen! -->        
                        <div id="reloadingDiv" tabindex="0" width="400" height="400" >    
                            <img id="reloadingPng" src="${pictureAddress}" alt="SpielPicture" ></img>
                        </div>       
                    </td>
                    <td>                        
                        <a href="${thisSiteAddress}?direction=oben">oben</a> <br>
                        <a href="${thisSiteAddress}?direction=left">links</a> 
                        <a href="${thisSiteAddress}?direction=rechts">rechts</a> <br>                         
                        <a href="${thisSiteAddress}?direction=unten">unten</a>
                    </td>
                </tr>
                <tr>
                    <td>
                        <!--Dieses Div gibt einige Daten und kann bei Ende des Projektes gelöscht werden-->
                        <div id="helperdiv">
                            <h2>Hilfestellung</h2>
                            <p>
                                <br>Die aufgerufene JSP Seite hat folgenden Pfad (von Root):</br>
                                <br>
                                <%
                                    String referrer = request.getServletPath();
                                    out.println("[ip]:8080" + referrer);
                                %>
                                </br>                            
                                <br>Folgende Attribute wurden uebergeben:</br>
                                <br>   
                                <%
                                    for (Enumeration<String> enumeration = request.getAttributeNames(); enumeration.hasMoreElements();) {
                                        String attributeName = enumeration.nextElement();
                                        Object attribute = request.getAttribute(attributeName);
                                        out.println(attributeName + ":  " + attribute + "</br>" + "</br>");
                                    }
                                %>
                                </br>                
                            </p>
                        </div>  
                    </td>
                    <td>
                        Sonstiges
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>

<%
// direction nimmt die Werte "links", "rechts", "oben" oder "unten an"                                   
String direction = (String)request.getAttribute("direction");
//Hier könnt ihr die Spiellogik anhängen, je nach dem in welche Richtung die Schlange bewegt werden soll


if (direction != null) {
    if (direction.equals( "oben")) {
        Task.facing = Facing.UP;
    } else if (direction.equals( "links")) {
        Task.facing = Facing.LEFT;
    } else if (direction.equals( "rechts")) {
        Task.facing = Facing.RIGHT;
    } else {
        Task.facing = Facing.DOWN;
    }
}
%>


