<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Thema"%>
<%@page import="java.util.Date"%>
<%@page import="model.Termin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            final List<Thema> themen = new ArrayList<Thema>(2);
            themen.add(new Thema("Goethe"));
            themen.add(new Thema("Schiller"));
            Termin termin = new Termin(themen, new Date());
            pageContext.setAttribute("termin", termin);
        %>
        <h1>${termin.date}</h1>
        <ul>
            <c:forEach items="${termin.themen}" var="item" >
                <li><c:out value="${item.name}" /></li>
            </c:forEach>
        </ul>
    </body>
</html>
