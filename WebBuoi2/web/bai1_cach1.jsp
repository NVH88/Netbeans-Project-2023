<%-- 
    Document   : bai1_cach1
    Created on : Oct 6, 2023, 12:02:06 PM
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
        <h1>Bài 1 cách 1:</h1>
        <form>
            Nhập bán kính:
            <input type="text" name="r"/>
            </br>
            <input type="submit" value="Tính diện tích"/>
        </form>
        <%
            if (request.getParameter("r") != null) {
                try {
                    double bk = Double.parseDouble(request.getParameter("r"));
                    double s = bk * bk * Math.PI;
                    out.print(s);
        %>
        <h3><%=s%></h3>
        <%
                } catch (Exception e) {
                    out.print(e);
                }
            }
        %>
    </body>
</html>
