<%-- 
    Document   : changepassword
    Created on : Oct 23, 2023, 12:06:51 AM
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
        <h2>Change password</h2>
        <form action="changepassword">
            Enter password: <input type="password" name="oldpass"/><br/>
            New password: <input type="password" name="newpass"/><br/>
            Confirm password: <input type="password" name="conpass"/><br/>
            <br/>
            ${requestScope.changeMess}
            <br/>
            <input type="submit" value="Change"/>
        </form>
    </body>
</html>
