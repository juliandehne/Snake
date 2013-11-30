<%--  
    Document   : highscore
    Created on : 28.11.2013, 22:20:13
    Author     : IceMan
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

    ArrayList<Integer> hs = new ArrayList<Integer>();
    hs.add(1996);
    hs.add(2013);
    hs.add(666);
    hs.add(112358);
    hs.add(246810);
    hs.add(1357911);
    hs.add(235711);
    hs.add(1);
    hs.add(9999999);
    hs.add(23);
    Iterator it = hs.iterator();
    int size = hs.size();
    
    int id = 0;
    
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
                            while (it.hasNext()){                             
                                it.next();                              
                            } 
                        %>
            <table style="overflow: hidden; width: 900px; height: 470px; margin-left: auto; margin-right: auto; border: 1px solid #878787; border-bottom-left-radius: 10px; border-bottom-right-radius: 10px; border-top-left-radius: 10px; border-top-right-radius: 10px; background-color: #AAE535">
                <tr style="border:1px solid #878787">
                    <th>Platz</th><th>Score</th><th>Name</th>
                </tr>
                <tr align="center" style="border: 1px solid #878787">
                    <td>1</td><td><% out.println(hs.get(0)); %></td><td>Marky</td>
                </tr>
                <tr align="center">
                    <td>2</td><td><% out.println(hs.get(1)); %></td><td>Ricky</td> 
                </tr>
                <tr align="center">
                    <td>3</td><td><% out.println(hs.get(2)); %></td><td>Denny</td> 
                </tr>
                <tr align="center">
                    <td>4</td><td><% out.println(hs.get(3)); %></td><td>Terry</td> 
                </tr>
                <tr align="center">
                    <td>5</td><td><% out.println(hs.get(4)); %></td><td>Mike</td> 
                </tr>
                <tr align="center">
                    <td>6</td><td><% out.println(hs.get(5)); %></td><td>Dave</td> 
                </tr>
                <tr align="center">
                    <td>7</td><td><% out.println(hs.get(6)); %></td><td>Timmy</td> 
                </tr>
                <tr align="center">
                    <td>8</td><td><% out.println(hs.get(7)); %></td><td>Tommy</td> 
                </tr>
                <tr align="center"> 
                    <td>9</td><td><% out.println(hs.get(8)); %></td><td>Joe</td> 
                </tr>
                <tr align="center">
                    <td>10</td><td><% out.println(hs.get(9)); %></td><td>Robby</td> 
                </tr>
            </table>
            <table style="margin-left:auto;margin-right:auto;">
            </table>
        </div>
    </body>
</html>
