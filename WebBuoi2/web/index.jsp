<%-- 
    Document   : index.jsp
    Created on : Oct 11, 2023, 1:20:20 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <div id="menu_tab">
            <%@include file="menu.jsp" %>
        </div>
        <div class="clr"></div>
        <div>
            <h1>Hello world!</h1>
        </div>
        <div class="clr"></div>
        <div class="footer">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
