<%-- 
    Document   : profile
    Created on : Oct 25, 2023, 1:32:23 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Username: ${sessionScope.ur.urname}<br/>
        Name: ${sessionScope.ur.name}<br/>
        <h2>Xin chao ${sessionScope.ur.roleName}!</h2>
    </body>
</html>
