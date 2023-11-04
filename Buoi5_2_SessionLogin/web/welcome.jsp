<%-- 
    Document   : welcome
    Created on : Oct 22, 2023, 10:37:17 PM
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
        <h2>Hello</h2>
        <h3>Username: ${ur.urname}</h3>
        <h3>Full name: ${ur.fullname}</h3>
        <h3>Phone number: ${ur.phonenum}</h3>
        <h3>
            <a href="editprofile.jsp" style="color: brown">Edit profile</a> &nbsp; &nbsp;
            <a href="changepassword.jsp" style="color: brown">Change password</a>
        </h3>
    </body>
</html>
