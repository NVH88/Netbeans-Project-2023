<%-- 
    Document   : p2
    Created on : Oct 13, 2023, 1:05:39 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test jstl</h1>
        <c:set var="s" value="${requestScope.sv}"/>
        <h2>Hello ${s.name}</h2>
    </body>
</html>
