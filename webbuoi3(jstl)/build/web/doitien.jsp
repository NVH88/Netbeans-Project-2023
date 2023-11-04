<%-- 
    Document   : doitien
    Created on : Oct 15, 2023, 12:49:24 AM
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
        <form action="doitien2" method="post">
            Số tiền cần đổi(VND): <input type="text" name="inp">
            <br/>
            <input type="checkbox" name="change" value="u"/> đổi sang USD
            <input type="checkbox" name="change" value="y"/> đổi sang Yên
            <br/>
            <input type="submit" value="Đổi"/>
        </form>
        <% 
            if (request.getAttribute("ans") != null) {
                String ans = (String)request.getAttribute("ans");
        %>
        <h3><%= ans %></h3>
        <%
            }
        %>
    </body>
</html>
