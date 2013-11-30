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
    hs.add(1996);                                       //mit Dummy-Daten, die später theoretisch aus der
    hs.add(2013);                                       //Datenbank abgefragt und eingelesen werden
    hs.add(666);                                        //-ArrayList hat den Vorteil die dem "Array" 
    hs.add(112358);                                     //keine feste Größe geben zu müssen, sondern
    hs.add(246810);                                     //ihn stets erweitern zu können 
    hs.add(1357911);
    hs.add(235711);
    hs.add(1);
    hs.add(9999999);
    hs.add(23);
    
    Iterator<Integer> iterator = hs.iterator();
    
    int size = hs.size();                               //-Festhalten der ArrayList Größe in der Variable "size"
    
    ArrayList<Integer> id = new ArrayList<Integer>();
    id.add(23);                                         //-identisch zur obigen ArrayList Erstellung
    id.add(24);                                         //wird hier die ebenfalls in der DB gespeicherte
    id.add(25);                                         //ID vorläufig angelegt 
    id.add(26);                                         //-"<Integer>" kann in beiden Fällen manuell
    id.add(27);                                         //festgelegt werden da andere Datentypen zu dieser 
    id.add(28);                                         //Variable nicht erlaubt sind
    id.add(29);
    id.add(30);
    id.add(31);
    id.add(32);
    
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
                        <table style="overflow: hidden; width: 900px; height: 470px; margin-left: auto; margin-right: auto; border: 1px solid #878787; border-bottom-left-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-top-right-radius: 10px; background-color: #AAE535">
                <tr style="border:1px solid #878787">
                    <th>Platz</th><th>Score</th><th>Name</th>
                </tr>
                <tr align="center" style="border: 1px solid #878787">                       
                    <td>1</td><td><% out.println(iterator.next()); %></td><td>Marky</td>   
                </tr>                                                                      
                <tr align="center">                                                        
                    <td>2</td><td><% out.println(iterator.next()); %></td><td>Ricky</td>          
                </tr>                                                                       
                <tr align="center">                                                         
                    <td>3</td><td><% out.println(iterator.next()); %></td><td>Denny</td>    
                </tr>
                <tr align="center">
                    <td>4</td><td><% out.println(iterator.next()); %></td><td>Terry</td> 
                </tr>
                <tr align="center">
                    <td>5</td><td><% out.println(iterator.next()); %></td><td>Mike</td> 
                </tr>
                <tr align="center">
                    <td>6</td><td><% out.println(iterator.next()); %></td><td>Dave</td> 
                </tr>
                <tr align="center">
                    <td>7</td><td><% out.println(iterator.next()); %></td><td>Timmy</td> 
                </tr>
                <tr align="center">
                    <td>8</td><td><% out.println(iterator.next()); %></td><td>Tommy</td> 
                </tr>
                <tr align="center"> 
                    <td>9</td><td><% out.println(iterator.next()); %></td><td>Joe</td> 
                </tr>
                <tr align="center">
                    <td>10</td><td><% out.println(iterator.next()); %></td><td>Robby</td> 
                </tr>
            </table>

<%-- 
            <%
                out.println("<html><b>Scores</b></html>");
                for ( int i = 0 ; iterator.hasNext(); i++ ){            //Alternatives Ausgeben der Elemente durch iterieren mit for-Schleife 
                    out.println("<html><br></html>");
                    out.println(i + "." + iterator.next());
                }                            
            %>        
--%>
            <table style="margin-left:auto;margin-right:auto;">
            </table>
        </div>
    </body>
</html>
