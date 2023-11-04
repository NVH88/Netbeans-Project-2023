<%-- 
    Document   : editprofile
    Created on : Oct 22, 2023, 11:06:36 PM
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
        <h2>Edit profile</h2>
        <form action="editprofile">
            Full name: <input type="text" name="fullname" value="${ur.fullname}"/><br/>
            Full name: <input type="text" name="phonenum" value="${ur.phonenum}"/><br/>
            ${editMess}
            <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
