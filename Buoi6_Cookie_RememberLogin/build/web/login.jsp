<%-- 
    Document   : login
    Created on : Oct 23, 2023, 4:12:46 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="cookie" value="${pageContext.request.cookies}"/>
        <form action="login">
            Username: <input type="text" name="urname" value="${cookie.username.value}"/><br/>
            Password: <input type="password" name="pass" value="${cookie.password.value}"/><br/>
            <input type="checkbox" ${(cookie.rem!=null?'checked':'')} name="remember" value="on"/>Remember<br/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>