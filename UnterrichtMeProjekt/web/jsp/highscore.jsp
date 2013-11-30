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
    name.add("Mike");                                          //festgelegt werden wie oben 
    name.add("Dave");                                         
    name.add("Timmy");
    name.add("Tommy");
    name.add("Joe");
    name.add("Robby");
    Iterator<String> niterator = name.iterator(); 
    
%>

<!--Hier beginnt die HTML-Seite-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="width=device-width; charset=UTF-8" name="viewport">        
        <title>Snake Projekt</title>
        <link rel="stylesheet" href="http://www.aavirtual.net/ada/CodeIgniter/style.css" type="text/css">
        <link rel="SHORTCUT ICON" href="http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/favicon.png" type="image/x-icon">
    </head>

    <body style="scrolling:none;">
        <div class="header">
            <div class="headerint"><img src="http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/logo1.png" /></div>
            <a align="right" href="http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/" onmouseover="Wechselbild1.src='http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/zurueck_omo.png';" onmouseout="Wechselbild1.src='http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/zurueck.png';">
              <img src="http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/zurueck.png" name="Wechselbild1"></a>
        </div> 
        <div class="wrapper">
<%                     
            out.println("<html>");
            out.println("<table style='overflow: hidden; width: 900px; height: 470px; margin-left: auto; margin-right: auto; border: 1px solid #878787; border-bottom-left-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-top-right-radius: 10px; background-color: #AAE535'>");
            out.println("<tr style='border:1px solid #878787'>");
            out.println("<th>Platz</th><th>Score</th><th>Name</th>");
            out.println("</tr>"); 
                    for (int i = 1; hiterator.hasNext() ; i++){
                        out.println("<tr align='center'><td>" + i + "</td><td>" + hiterator.next() + "</td><td>" + niterator.next() + "</td></tr>");
                    }
            out.println("</table></html>");
%>                                                                      
            <table style="margin-left:auto;margin-right:auto;">
            </table>
        </div>
    </body>
</html>
