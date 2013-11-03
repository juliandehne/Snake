<%-- 
    Document   : snake
    Created on : 24.10.2013, 20:25:00
    Author     : Julian
--%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.io.File"%>
<%@page import="picture.CreatePicture"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>JSP Page</title>        
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/javascript.js?id=${pageContext.session.id}" type="text/javascript"></script>
    </head>

    <body>                 
        <!-- Hier wird das Bild eingefügt: Das Testdiv-Tag nicht anfassen! -->
        <!-- In der Datei dynamic2d.jsp wird das Bild erstellt -->
        <div id="reloadingDiv" tabindex="0" width="400" height="400">    
            <img id="reloadingPng" src="http://localhost:8080/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/test2.png" alt="SpielPicture"></img>
        </div>       

        <div id="helperdiv">
            <h2>Hilfestellung</h2>
            <p>
                <br>Die aufgerufene JSP Seite hat folgenden Pfad (von Root):</br>
                <br>
                <%
                    String referrer = request.getServletPath();
                    out.println("[ip]:8080"+referrer);
                %>
                </br>                            
                <br>Folgende Attribute wurden uebergeben:</br>
                <br>   
                <%
                    for (Enumeration<String> enumeration = request.getAttributeNames(); enumeration.hasMoreElements();) {
                        String attributeName = enumeration.nextElement();
                        Object attribute = request.getAttribute(attributeName);
                        out.println(attributeName + " -> " + attribute.getClass().getName() + ":" + attribute.toString() + "</br>" +"</br>");
                    }
                %>
                </br>
            </p>
        </div>                
    </body>
</html>

<%
// response.setIntHeader("Refresh", 5);        
//    Thread t = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            while (true) {
//                File deployStream = new File("C:/Program Files/Apache Software Foundation/Tomcat 6.0/webapps/ROOT/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/test2.png");
//                CreatePicture instance = new CreatePicture();
//                instance.paintPicture(deployStream);
//            }
//        }
//    });
//    t.start();
%>

