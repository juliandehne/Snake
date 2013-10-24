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
    </head>
    <body>
        <h1>Hello World!</h1>
        <div id="testdiv" tabindex="0" onkeydown="alert('hallo');" >
            <twod:canvas id="polygon" width="200" height="200" alt="A polygon">                
                var color1 = new java.awt.Color(0xC80021); 
                // create red gradient paint 
                var color1 = new java.awt.Color(0xC80021); 
                var color2 = new java.awt.Color(0x711928); 
                var x1 = 20; 
                var y1 = 0; 
                var x2 = 20; 
                var y2 = 190; 
                var grad = new java.awt.GradientPaint(x1,y1,color1,x2,y2,color2); // create pentagon 
                var xPoints = [101,180,150, 52, 20];
                var yPoints = [24 , 81,177,177, 81]; 
                var numPoints = xPoints.length;
                var pentagon = new java.awt.Polygon(xPoints,yPoints,numPoints); // create stroke with rounded corners        
                var endCap = java.awt.BasicStroke.CAP_ROUND; 
                var join = java.awt.BasicStroke.JOIN_ROUND;
                var stroke = new java.awt.BasicStroke(20,endCap,join); // draw polygon on the current graphics context (g)
                g.setPaint(grad);
                g.fill(pentagon);
                g.setStroke(stroke);
                g.draw(pentagon);                 
            </twod:canvas>
        </div>
    </body>
</html>
