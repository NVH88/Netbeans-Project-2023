<%-- 
    Document   : home
    Created on : Oct 5, 2023, 9:32:53 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vi du</h1>
        <h2 style="color: blue">hello world!</h2>
        <h2 style="color: red">
            <%
                String name = "nvh";
                out.println("hello " + name + "</br>");
                out.println("So pi = " + (Math.PI) + "</br>");
                double r = 2;
                ArrayList<Integer> a = new ArrayList<>();
                for (int i = 0; i < 10; ++i) {
                    a.add(i);
                }
                for (int i = 9; i >= 0; --i) {
                    out.print(i + "</br>");
                }
            %>
        </h2>
        <h2 style="color: blue">
            Diện tích là: <%= String.format("%.2f", r * r * Math.PI) %>
        </h2>
    </body>
</html>
