<%-- 
    Document   : newjsp
    Created on : Nov 29, 2013, 5:17:44 PM
    Author     : Ada
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ListIterator" %>
<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="java.util.LinkedList" %>
<%@page import="java.util.HashMap"%>

<%

    ArrayList<Integer> highscore = new ArrayList<Integer>();
    highscore.add(1);
    highscore.add(2);
    highscore.add(3); 
    highscore.add(4);
    highscore.add(5);
    highscore.add(6);
    Iterator<Integer> highpr = highscore.iterator();
    
    int size = highscore.size();
    
    ArrayList<String> name = new ArrayList<String>();
    name.add("Spongebob Squarepants");
    name.add("Patrick Star");
    name.add("Squidward Tentacles");
    name.add("Eugene Krabbs"); 
    name.add("Sandy Cheeks");
    name.add("Mrs Puff");
    Iterator<String> namepr = name.iterator(); 
    
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="width=device-width; charset=UTF-8" name="viewport">        
        <title>Snake Spiele</title>
        <link rel="stylesheet" href="http://www.aavirtual.net/ada/CodeIgniter/style.css" type="text/css">
    </head>
    <body>
        <div class="header">
            <div class="headerint"><img src="http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/build/web/jsp/logo_title.png" /></div>
        </div> 
        <div class="wrapper">
<%                     
            out.println("<table style='overflow: hidden; width: 900px; height: 400px; margin-left: auto; margin-right: auto; border: 1px solid #878787; border-bottom-left-radius: 6px; border-bottom-right-radius: 6px; border-top-left-radius: 6px; border-top-right-radius: 6px; background-color: #E16F60; box-shadow: 2px 4px 4px'>");
            out.println("<tr><td>Place</td><td>Name</td><td>Score</td></tr>");
                    for (int i = 1; highpr.hasNext() ; i++){
                        out.println("<tr align='center'><td>" + i + "</td><td>" + namepr.next() + "</td><td>" + highpr.next() + "</td></tr>");
                    }
            out.println("</table>");
%>                                                                      
        </div>
    </body>
</html>
