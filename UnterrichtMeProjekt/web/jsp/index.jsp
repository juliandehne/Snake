<%-- 
    Document   : snake
    Created on : 24.10.2013, 20:25:00
    Author     : Julian Dehne
--%>
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
    String tomcatRootPath = "/var/lib/tomcat6/webapps/ROOT/";
    File deployStream = new File(tomcatRootPath + picturePath);
    request.setAttribute("Pfad für die Erstellung von Bildern", deployStream.getPath());
    // Hier müsst ihr eure IP eintragen
    String ip = "http://10.25.25.135:8080";
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
        <meta http-equiv="Content-Type" content="width=device-width; charset=UTF-8" name="viewport">        
        <title>Snake Projekt</title>
        <!-- Javascript imports für Pic-Reload - bitte ignorieren -->
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/javascript.js?id=${pageContext.session.id}" type="text/javascript"></script>
        <link rel="stylesheet" href="http://www.aavirtual.net/ada/CodeIgniter/style.css" type="text/css">
    </head>

 <body style="scrolling:none;">
        <div class="header">
            <div class="headerint"><img src="http://www.aavirtual.net/ada/CodeIgniter/logo2.gif" /></div>
        </div>
        <div class="wrapper">
            <table style="overflow:hidden;width:900px;height:400px;margin-left:auto;margin-right:auto;">
                <tr>
                    <td valign="top">
                        <!-- Hier wird das Bild eingefügt: Das reloadingDivnicht anfassen! -->        
                        <div id="reloadingDiv" tabindex="0" width="900" height="400" >    
                            <img id="reloadingPng" src="${pictureAddress}" alt="SpielPicture" style="background:#FFF;border:1px solid #EAEAEA;border-radius:5px;width:900px;height:400px;" ></img>
                        </div>
                    </td>
                </tr>
            </table>
<table style="margin-left:auto;margin-right:auto;">
<tr>
     <td></td><td><a href="${thisSiteAddress}?direction=oben" class="up"/></a></td><td></td>
</tr>
<tr>
<td> <a href="${thisSiteAddress}?direction=links" class="left"/></a></td><td>
           <a href="${thisSiteAddress}?direction=unten" class="down"/></a></td><td>
            <a href="${thisSiteAddress}?direction=rechts" class="right"/></a></td>
</tr>
</table>
        </div>
    </body>
  
  <footer>
        <div class="footer">Ada Erzurumlu | Niklas Koch | Keanu Forthmann<br />[ Berlin, Deutschland ]</div> 
        <!--Dieses Div gibt einige Daten und kann bei Ende des Projektes gelöscht werden-->
                 <!--        <div id="helperdiv" style="width:900px;margin-left:auto;margin-right:auto;visibility:hidden;">
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
                        </div>  --> 
    </footer>
</html>

<%
// direction nimmt die Werte "links", "rechts", "oben" oder "unten an"                                   
String direction = (String)request.getAttribute("direction");
//Hier könnt ihr die Spiellogik anhängen, je nach dem in welche Richtung die Schlange bewegt werden soll
%>


