<%-- 
    Document   : test
    Created on : 23.10.2013, 20:12:45
    Author     : Julian
--%>
<%@page import="java.util.Date"%>
<%@page import="model.Termin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
        Date date = new Date();
        long time = date.getTime();
        pageContext.setAttribute("time", time);
        %>
        <br>
            ${time}
        </br>
    </body>
</html>
