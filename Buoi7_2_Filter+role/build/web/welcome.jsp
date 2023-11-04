<%-- 
    Document   : home
    Created on : Oct 24, 2023, 10:10:22 PM
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
        <a href="mua.jsp">Người mua</a>
        ||
        <a href="ban.jsp">Người bán</a>
        ||
        <a href="profile.jsp">Xem thông tin</a>
        ||
        <a href="home.jsp">Đăng xuất</a>
        <br/>
        <h2>Xin chào ${sessionScope.ur.name}!</h2>
    </body>
</html>
