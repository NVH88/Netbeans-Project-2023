<%-- 
    Document   : calc
    Created on : Oct 12, 2023, 10:19:02 AM
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
        <h1>Tinh toan:</h1>
        <form>
            So thu nhat: <input type="text" name="num1"/>
            <br/>
            So thu hai <input type="text" name="num2"/>
            <br/>
            <select name="op">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>
            <br/>
            <input type="submit" value="Tinh"/>
            <br>
        </form>
        <jsp:useBean id="calc" class="model.Calculator"/>
        <jsp:setProperty name="calc" property="*"/>
        <h1><jsp:getProperty name="calc" property="result"/></h1>
    </body>
</html>
