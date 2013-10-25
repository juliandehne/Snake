<%-- 
    Document   : snake
    Created on : 24.10.2013, 20:25:00
    Author     : Julian
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="twod" uri="http://ditchnet.org/jsp-2d-taglib" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>        
        <script src="./js/jquery.js" type="text/javascript"></script>
        <script src="./js/pagereload.js" type="text/javascript"></script>      
    </head>

    <body>        
        <!-- Hier wird das Bild eingefügt: Das Testdiv-Tag nicht anfassen! -->
        <!--In der Datei dynamic2d.jsp kann das Bild programmiert werden-->
        <div id="testdiv" tabindex="0" onkeydown="alert('hallo');" >             
        </div>
    </body>
</html>
