
<%@page import="database.Datenbankzugriffe"%>
<%@page import="database.IdNamePair"%>
<%@page import="database.VereinfachtesResultSet"%>
<%@page import="database.MysqlConnect"%>
<%--
    Document : highscore
    Created on : 28.11.2013, 22:20:13
    Author : IceMan

    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    ! Diese Seite stellt lediglich einen Entwurf für eine extra Highscore-Seite dar. !
    ! Diese JSP-Seite wurden u.a. aus programmiertechnischen Gründen erstellt und stellt !
    ! somit NICHT zwingend einen direkten Teil des Projekts dar! !
    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
--%>
<%@page import="java.util.Iterator"%>
<%@page import="controller.Task"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="java.util.LinkedList" %>
<%@page import="java.util.ListIterator" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

    //Konfiguration für PictureLoad
    String picturePath = "/image/spiel.png";
    // Hier müsst ihr den Pfad des ROOT Verzeichnis auf euerem Server angeben
    // bei euch zu 99% /var/lib/tomcat6/webapps/ROOT/
    String tomcatRootPath = "/var/lib/tomcat6/webapps/ROOT/";
    File deployStream = new File(tomcatRootPath + picturePath);
    request.setAttribute("Pfad für die Erstellung von Bildern", deployStream.getPath());
    // Hier müsst ihr eure IP eintragen
//    String ip = "http://10.25.25.135:8080";
    String ip = "http://localhost:8080";
    String pictureRootAddress = picturePath;
    String pictureAddress = ip + pictureRootAddress;
    request.setAttribute("Pfad für die Addressierung von Bildern per URl", pictureAddress);
    request.setAttribute("pictureAddress", pictureAddress); //fürs einsetzen in HTML

    // Die Addresse dieser Seite
    String thisSiteRootAddress = "/git/UnterrichtMe/UnterrichtMeProjekt/web/";
    String thisSiteAddress = ip + thisSiteRootAddress;
    request.setAttribute("thisSiteAddress", thisSiteRootAddress);

%>

<!--Hier beginnt die HTML-Seite-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="width=device-width; charset=UTF-8" name="viewport">
        <title>Snake Projekt</title>
        <link rel="stylesheet" href="http://www.aavirtual.net/ada/CodeIgniter/style.css" type="text/css">
        <link rel="SHORTCUT ICON" href="${thisSiteAddress}jsp/favicon.png" type="image/x-icon"> <!-- Bild im Tab -->
    </head>

    <body style="background-image: url('${thisSiteAddress}jsp/bgimage.png')">
        <div class="header">
            <div class="headerint" align="center">
                <img name="Wechselbild1" onmouseover="Wechselbild1.src = '${thisSiteAddress}jsp/logo_titlebunt.png';" onmouseout="Wechselbild1.src = '${thisSiteAddress}jsp/logo_title.png';" src="${thisSiteAddress}jsp/logo_title.png" />
            </div>
            <a align="right" href="${thisSiteAddress}?scorevisited=true" onmouseover="Wechselbild2.src = '${thisSiteAddress}jsp/zurueck_omobunt.png';" onmouseout="Wechselbild2.src = '${thisSiteAddress}jsp/zurueck.png';">
                <img src="${thisSiteAddress}jsp/zurueck.png" name="Wechselbild2"></a>
        </div>
        <div class="wrapper" left: 300px;" style="color: #B00101">
            Highscore ist: <br>
            <label>
            <%
                Datenbankzugriffe d = new Datenbankzugriffe();
                int highscore = d.getHigscoreForPlayerID(1);
                out.println(highscore);
            %>            
            </label>
        </div>
    </body>
    <footer>
        <div class="footer"><img src="${thisSiteAddress}jsp/logo1.png" style="height: 120px" align="bottom"></div>
    </footer>
</html>


