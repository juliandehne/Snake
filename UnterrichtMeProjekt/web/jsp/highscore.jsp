<%--  
    Document   : highscore
    Created on : 28.11.2013, 22:20:13
    Author     : IceMan

    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    !   Diese Seite stellt lediglich einen Entwurf für eine extra Highscore-Seite dar.     !
    !   Diese JSP-Seite wurden u.a. aus programmiertechnischen Gründen erstellt und stellt !
    !   somit NICHT zwingend einen direkten Teil des Projekts dar!                         !
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

    ArrayList<Integer> hs = new ArrayList<Integer>();   //-Erstellen einer ArrayList "hs" (=highscore) 
    hs.add(999999);                                     //mit Dummy-Daten, die später theoretisch aus der
    hs.add(234555);                                     //Datenbank abgefragt und eingelesen werden
    hs.add(55555);                                      //-ArrayList hat den Vorteil die dem "Array" 
    hs.add(44324);                                      //keine feste Größe geben zu müssen, sondern
    hs.add(5443);                                       //ihn stets erweitern zu können 
    hs.add(666);
    hs.add(333);
    hs.add(144);
    hs.add(23);
    hs.add(1);
    Iterator<Integer> hiterator = hs.iterator();
    
    int size = hs.size();                               //-Festhalten der ArrayList Größe in der Variable "size"
    
    ArrayList<String> name = new ArrayList<String>();
    name.add("Marky");                                         //-identisch zur obigen ArrayList Erstellung
    name.add("Ricky");                                         //wird hier der ebenfalls in der DB gespeicherte
    name.add("Denny");                                         //Name vorläufig angelegt 
    name.add("Terry");                                         //-"<String>" kann manuell
    name.add("Mike");                                          //festgelegt werden, wie oben 
    name.add("Dave");                                         
    name.add("Timmy");
    name.add("Tommy");
    name.add("Joe");
    name.add("Robby");
    Iterator<String> niterator = name.iterator(); 
    
    //Konfiguration für PictureLoad  
    String picturePath = "/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/spiel.png";
    // Hier müsst ihr den Pfad des ROOT Verzeichnis auf euerem Server angeben
    // bei euch zu 99% /var/lib/tomcat6/webapps/ROOT/
    String tomcatRootPath = "/var/lib/tomcat6/webapps/ROOT/";
    File deployStream = new File(tomcatRootPath + picturePath);
    request.setAttribute("Pfad für die Erstellung von Bildern", deployStream.getPath());
    // Hier müsst ihr eure IP eintragen
    String ip = "http://10.25.25.130:8080";
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

<!--Hier beginnt die HTML-Seite-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="width=device-width; charset=UTF-8" name="viewport">        
        <title>Snake Projekt</title>
        <link rel="stylesheet" href="http://www.aavirtual.net/ada/CodeIgniter/style.css" type="text/css">
        <link rel="SHORTCUT ICON" href="${thisSiteAddress}favicon.png" type="image/x-icon">           <!-- Bild im Tab -->
    </head>

    <body>
        <div class="header">
            <div class="headerint"><img src="${thisSiteAddress}jsp/logo_title.png" /></div>
            <a align="right" href="${thisSiteAddress}" onmouseover="Wechselbild1.src='${thisSiteAddress}jsp/zurueck_omo.png';" onmouseout="Wechselbild1.src='${thisSiteAddress}jsp/zurueck.png';">
              <img src="${thisSiteAddress}jsp/zurueck.png" name="Wechselbild1"></a>
        </div> 
        <div class="wrapper">
<%                     
            out.println("<html>");
            out.println("<table style='overflow: hidden; width: 900px; height: 400px; margin-left: auto; margin-right: auto; border: 1px solid #878787; border-bottom-left-radius: 6px; border-bottom-right-radius: 6px; border-top-left-radius: 6px; border-top-right-radius: 6px; background-color: #E16F60; box-shadow: 2px 4px 4px'>");
            out.println("<tr style='border-botton-width: 1px'>");
            out.println("<th><span style='font-family:BankGothic Md BT;font-size:1.7em; text-shadow:black 2px 4px 8px;color: #440000'>Platz</span></th><th><span style='font-family:BankGothic Md BT;font-size:1.7em; text-shadow:black 2px 4px 8px;color: #440000'>Score</span></th><th><span style='font-family:BankGothic Md BT;font-size:1.7em; text-shadow:black 2px 4px 8px;color: #440000'>Name</span></th>");
            out.println("</tr>"); 
                    for (int i = 1; hiterator.hasNext() ; i++){
                        out.println("<tr align='center'><td><span style='font-family:BankGothic Md BT;font-size:1.3em; color: #440000'>" + i + "</span></td><td><span style='font-family:BankGothic Md BT;font-size:1.3em; color: #440000'>" + hiterator.next() + "</span></td><td><span style='font-family:BankGothic Md BT;font-size:1.3em; color: #440000'>" + niterator.next() + "</span></td></tr>");
                    }
            out.println("</table></html>");
%>                                                                      
            <table style="margin-left:auto;margin-right:auto">
            </table>
        </div>
    </body>
    <footer>
        <div class="footer"><img src="${thisSiteAddress}jsp/logo1.png" style="height: 100px" align="bottom"></div> 
    </footer>     
</html>