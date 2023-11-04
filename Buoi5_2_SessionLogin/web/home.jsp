<%-- 
    Document   : home
    Created on : Oct 22, 2023, 5:10:45 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .login-container {
                width: 300px; /* Điều chỉnh kích thước của khung */
                margin: 0 auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
                background-color: #f9f9f9;
                box-shadow: 0px 0px 5px #888888;
            }

            .login-container h2 {
                text-align: center;
            }

            .login-container form {
                display: flex;
                flex-direction: column;
            }

            .login-container label {
                margin-bottom: 10px;
            }

            .login-container input {
                padding: 5px;
                margin-bottom: 10px;
            }

            .login-container button {
                background-color: #007BFF;
                color: #fff;
                border: none;
                padding: 10px;
                cursor: pointer;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="login-container">
            <h2>NVH Web</h2>
            <h3 style="text-align: center"><a href="login.jsp" style="color: brown">Login</a> &nbsp; &nbsp;
                <a href="signup.jsp" style="color: brown">Sign up</a>
            </h3>
        </div>
    </body>
</html>
