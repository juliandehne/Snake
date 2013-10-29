<%-- 
    Document   : dynamic2d
    Created on : 25.10.2013, 13:06:30
    Author     : Julian
--%>

<%@page import="picture.CreatePicture"%>
<%@page import="java.io.File"%>
<%@page import="geometry.Rectangle"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="twod" uri="http://ditchnet.org/jsp-2d-taglib" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>        
        <div id="reloadingDiv" width="400" height="400" border="black"> 
            <!-- Hier könnt ihr html einfügen, das regelmäßig reloaded wird -->
            <div>           
                <%
                    File outputStream = new File("C:/Program Files/"
                            + "Apache Software Foundation/Tomcat 6.0/webapps/"
                            + "ROOT/GIT/UnterrichtMe/UnterrichtMeProjekt/web/pics/"
                            + "tmp.png");
                    File deployStream = new File("C:/Program Files/"
                            + "Apache Software Foundation/Tomcat 6.0/webapps/"
                            + "ROOT/GIT/UnterrichtMe/UnterrichtMeProjekt/web/pics/"
                            + "test.png");
                    CreatePicture instance = new CreatePicture();
                    instance.paintPicture(deployStream);                    
                %>

                <!--                Hier müsst ihr die richtige Addresse Eintragen (eure IP)-->
                <img src="http://localhost:8080/GIT/UnterrichtMe/UnterrichtMeProjekt/web/pics/test.png" alt="SpielPicture"></img>                
            </div>
        </div>        
    </body>
</html>
