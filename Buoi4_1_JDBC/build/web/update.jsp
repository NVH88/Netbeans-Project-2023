<%-- 
    Document   : update
    Created on : Oct 21, 2023, 2:36:03 PM
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
        <h1>Update Information</h1>
        <c:set var="c" value="${requestScope.shipper}"/>
        <form action="update" method="post">
            ID<input type="text" readonly name="id" value="${c.id}"/></br>
            Nhap ten<input type="text" name="ten" value="${c.ten}"/></br>
            Nhap tuoi<input type="text" name="tuoi" value="${c.tuoi}"/></br>
            <input type="submit" value="update"/>
        </form>
    </body>
</html>
