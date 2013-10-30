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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    </head>
    <body>

        <%--Hier wird das wieder ladende Div erstellt. Nur anfassen,
        wenn ihr wisst, was ihr tut.--%>
        <div id="reloadingDiv" width="400" height="400" border="black"> 
            <!-- Hier könnt ihr html einfügen, das regelmäßig reloaded wird -->
            <div>           
                <%                    
                    File deployStream = new File("/var/lib/tomcat6/webapps/ROOT/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/test2.png");
                    CreatePicture instance = new CreatePicture();
                    instance.paintPicture(deployStream);                    
                %>

                <!--                Hier müsst ihr die richtige Addresse Eintragen (eure IP)-->
                <img src="http://10.25.25.155:8080/git/UnterrichtMe/UnterrichtMeProjekt/web/pics/test2.png" alt="SpielPicture"></img>
            </div>
        </div>        
    </body>
</html>
