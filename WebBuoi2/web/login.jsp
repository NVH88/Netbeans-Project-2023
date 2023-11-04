<%-- 
    Document   : login
    Created on : Oct 11, 2023, 3:51:51 PM
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
        <%
            if (request.getAttribute("ms") != null) {
                String ms = (String)request.getAttribute("ms");
        %>
        <h1 style="color:red"><%=ms%></h1>
        <%
            }
        %>
        <h1>Login form</h1>
        <form action="login" method="post">
            Enter username <input type="text" name="user"/>
            <br/>
            Enter password <input type="password" name="pass"/>
            <br/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
