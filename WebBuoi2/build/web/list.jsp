<%-- 
    Document   : list
    Created on : Oct 11, 2023, 1:12:16 AM
    Author     : DELL
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of students:</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Nam</th>
                <th>Dob</th>
                <th>Gender</th>
            </tr>
            <%
                ArrayList<Student> arr = (ArrayList<Student>) request.getAttribute("data");
                for (Student s : arr) {
            %>
            <tr>
                <td><%= s.getId()%></td>
                <td><%= s.getName()%></td>
                <td><%= s.getDob()%></td>
                <td>                
                    <img <%= (s.isGender()?"src='images/male.png'": "src='images/female.png'") %> 
                    width="40px" height="52px"/>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
