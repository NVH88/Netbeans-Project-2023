<%-- 
    Document   : test
    Created on : Oct 11, 2023, 10:50:03 AM
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
        <h1>Danh sach sinh vien:</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Gender</th>
            </tr>
            <%
                ArrayList<Student> arr = (ArrayList<Student>) request.getAttribute("listStudent");
                for (Student s : arr) {
            %>
                    <tr>
                        <td><%= s.getId()%></td>
                        <td><%= s.getName()%></td>
                        <td><%= s.getDob()%></td>
                        <td><img <%=(s.isGender()?"src = 'images/male.png'":"src = 'images/female.png'")%>width="30px" height="30px"></td>
                    </tr>
            
            <%
                }
            %>
        </table>
    </body>
</html>
