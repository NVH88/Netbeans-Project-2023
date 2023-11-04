<%-- 
    Document   : search
    Created on : Oct 22, 2023, 1:31:50 AM
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
        <form action="listplayer" method="get">
            Club:
            <select name="cid">
                <option value="-1">All</option>
                <option value="0">MU</option>
                <option value="1">Arsenal</option>
                <option value="2">Liverpool</option>
                <option value="3">MC</option>
                <option value="4">Tot</option>
                <option value="5">Chelsea</option>
            </select>            
            <br/>
            Search by name:<input type="text" name="sbn"/>
            <br/>
            Age: from <input type="text" name="agefrom" style="width: 25px"/> to <input type="text" name="ageto" style="width: 25px"/>
            <br/>
            Transfer: from <input type="text" name="pricefrom" style="width: 25px"/>M to <input type="text" name="priceto" style="width: 25px"/>M
            <br/>
            <input type="submit" value="SEARCH"/>
        </form>       
        <br/>
        <c:forEach items="${requestScope.listPlayer}" var="c">
            Name: ${c.playerName} &nbsp; Number Shirt:${c.numberShirt} &nbsp; Age: ${c.age} &nbsp; Transfer: ${c.transfer}M
            <br/>
        </c:forEach>
    </body>
</html>
