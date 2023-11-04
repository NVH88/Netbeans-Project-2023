<%-- 
    Document   : article
    Created on : Nov 4, 2023, 12:21:38 AM
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
        <form action="articleservlet" method="post">
            Name: <input type="text" name="name"/><br/>
            Image: <input type="text" name="image"/><br/>
            Content:<br/>
            <textarea name="content" rows="4" cols="50"></textarea><br/>
            <input type="submit" value="sub"/>
        </form>
    </body>
</html>
