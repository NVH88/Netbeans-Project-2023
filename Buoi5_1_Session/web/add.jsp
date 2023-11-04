<%-- 
    Document   : add
    Created on : Oct 22, 2023, 4:00:31 PM
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
        <h1>Add new player</h1>
        <form action="nhap">
            Enter new player: <input type="text" name="player"/>
            <br/>
            <input type="submit" value="ADD"/>
        </form>
        <h2>List player</h2>
        <h1>${sessionScope.sz}</h1>
        <c:forEach items="${sessionScope.listp}" var="p">
            ${p}
            <br/>
        </c:forEach>
    </body>
</html>
