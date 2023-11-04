<%-- 
    Document   : login
    Created on : Oct 24, 2023, 10:14:24 PM
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
        <h3 style="color: red">${requestScope.ErrorMess}</h3>
        <c:set var="cookie" value="${pageContext.request.cookies}"/>
        <form action="login" method="post">
            Tên đăng nhập: <input type="text" name="username" value="${cookie.username.value}"/><br/>
            Mật khẩu: <input type="password" name="password" value="${cookie.password.value}"/><br/>
            <input type="checkbox" name="remember" value="on" ${cookie.remember!=null?'checked':''}/> Ghi nhớ đăng nhập<br/>
            <input type="submit" value="Đăng nhập"/>           
        </form>
    </body>
</html>
