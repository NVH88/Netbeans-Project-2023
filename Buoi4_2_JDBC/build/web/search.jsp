<%-- 
    Document   : search
    Created on : Oct 22, 2023, 1:31:50 AM
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
        <form>
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
            <input type="submit" value="SEARCH"/>
        </form>
    </body>
</html>
