<%-- 
    Document   : listclub
    Created on : Oct 22, 2023, 12:12:32 AM
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
        <a href="listplayer?cid=-1" style="color:black">All</a>
        <br/>
        <c:forEach items="${requestScope.listClub}" var="c">
            <a href="listplayer?cid=${c.clubId}" style="color:black">${c.clubName}</a>
            <br/>
        </c:forEach>
        <br/>
        <c:forEach items="${requestScope.listPlayer}" var="c">
            ${c.playerName} &nbsp; ${c.numberShirt} &nbsp; 
            <br/>
        </c:forEach>
    </body>
</html>
