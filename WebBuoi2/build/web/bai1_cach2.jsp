<%-- 
    Document   : bai1_cach2
    Created on : Oct 6, 2023, 12:39:06 PM
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
        <h1>Bài 1 cách 2:</h1>
        <form action="bai1cach2" method="post">
            Nhập bán kính:
            <input type="text" name="r"/>
            </br>
            <input type="submit" value="Tính diện tích"/>
        </form>
        
        <%
            if (request.getAttribute("ans") != null) {
                String s = (String)request.getAttribute("ans");
                out.print(s);
            }
        %>
    </body>
</html>
