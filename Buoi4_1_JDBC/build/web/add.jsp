<%-- 
    Document   : add
    Created on : Oct 21, 2023, 12:48:56 PM
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
        <h1>Add new a shipper</h1>
        <h2 style="color:red">${requestScope.error}</h2>
        <form action="add" method="get">
            Nhap id:<input type="text" name="id"/><br/>
            Nhap ten:<input type="text" name="ten"/><br/>
            Nhap tuoi:<input type="text" name="tuoi"/><br/>
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>
