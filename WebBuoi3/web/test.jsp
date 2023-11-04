<%-- 
    Document   : test
    Created on : Oct 12, 2023, 9:58:14 PM
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
        <h1>Test!</h1>
        <form>
            Nhap so thu nhat: <input type="text" name="num1" value="${param.num1}"/>
            <br/>
            Nhap so thu hai: <input type="text" name="num2" value="${param.num2}"/>
            <br/>
            Nhap so thu ba: <input type="text" name="num3" value="${param.num3}"/>
            <br/>
            <input type="submit" value="Tinh"/>
            <br/>
            Tong: ${param.num1 + param.num2 + param.num3}
            <br/>
            TBC: ${(param.num1 + param.num2 + param.num3) / 3}
        </form>
        
        <br/> 
        <%
            String ten = (String)request.getAttribute("name");
        %>
        <%= ten %>
        <br/>
        ${requestScope.name}
        <br/> 
        ${requestScope.sv}
    </body>
</html>
