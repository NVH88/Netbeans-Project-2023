<%-- 
    Document   : listshipper
    Created on : Oct 21, 2023, 12:34:31 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(id) {
                if(confirm("Bạn có thực sự muốn xóa shipper " + id)) {
                    window.location = "delete?id=" + id;
                }
            }
        </script>
    </head>
    <body>
        <center>
            <h1>List of shippers</h1>
            <h3><a href="add.jsp">Add new</a></h3>
            <table border="1px" width="40%">
                <tr>
                    <th>ID</th>
                    <th>Ten</th>
                    <th>Tuoi</th>
                    <th>Sua</th>
                </tr>
                <c:forEach items="${requestScope.listShipper}" var="c">
                    <c:set var="id" value="${c.id}"/>
                    <tr>
                        <td>${id}</td>
                        <td>${c.ten}</td>
                        <td>${c.tuoi}</td>
                        <td>
                            <a href="update?id=${id}">Update</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <a href="#" onclick="doDelete('${id}')">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </center>
    </body>
</html>
