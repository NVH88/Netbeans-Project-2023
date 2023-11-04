<%-- 
    Document   : test
    Created on : Oct 14, 2023, 1:45:47 PM
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
        <h1>Vi du jstl</h1>
        <%--<c:set var="s" value="${requestScope.sv}"/>--%>
        <!--<h2>Hello ${s.name}</h2>-->
        <%--<c:if test="${s.gpa >= 1}">--%>
            <!--<h3>pass</h3>-->
        <%--</c:if>--%>
        <%--<c:if test="${s.gpa < 1}">--%>
            <!--<h3>fail</h3>-->
        <%--</c:if>--%>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
            </tr>
            <c:forEach items="${requestScope.list}" var="i">
                <tr>
                    <td>${i.id}</td>
                    <td>${i.name}</td>
                    <td>${i.gender}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
