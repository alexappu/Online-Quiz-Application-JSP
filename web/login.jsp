<jsp:useBean class="DataBase.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%
    String un = request.getParameter("email");
    String ps = request.getParameter("password");
    if (request.getParameter("submit") != null) {

        String sQ1 = "select *from user a inner join user_type b on a.type_id = b.type_id Where ( email = '" + un + "'  and password = '" + ps + "' ) and ( b.type_name = 'Admin' And status='1')";
        String sQ2 = "select *from user a inner join user_type b on a.type_id = b.type_id Where ( email = '" + un + "'  and password = '" + ps + "' ) and ( b.type_name = 'Teacher' And status='1')";
        String sQ3 = "select *from user a inner join user_type b on a.type_id = b.type_id Where ( email = '" + un + "'  and password = '" + ps + "' ) and ( b.type_name = 'Student' And status='1')";
        ResultSet rs1 = obj.select(sQ1);
        ResultSet rs2 = obj.select(sQ2);
        ResultSet rs3 = obj.select(sQ3);

        if (rs1.next()) {

            String user_id = rs1.getString("user_id");
            session.setAttribute("sid", user_id);
            response.sendRedirect("Admin/pages/virtual-reality.html");
        }
        if (rs2.next()) {
            String user_id = rs2.getString("user_id");
            session.setAttribute("sid", user_id);
            response.sendRedirect("index_teacher.jsp");
        }
        if (rs3.next()) {
            String adid = rs3.getString("user_id");
            session.setAttribute("sid", adid);
            response.sendRedirect("index_student.jsp");
        }

    }

%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->



<html>
    <head>
        <title>Login Page</title>


        <!--Bootsrap 4 CDN-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <!--Fontawesome CDN-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <!--Custom styles-->
        <link rel="stylesheet" type="text/css" href="login.css">
    </head>
    <body>
        <div class="container">
            <div class="d-flex justify-content-center h-100">
                <div class="card">
                    <div class="card-header">
                        <h3>Sign In</h3>
                        <div class="d-flex justify-content-end social_icon">
                            <span><i class="fab fa-facebook-square"></i></span>
                            <span><i class="fab fa-google-plus-square"></i></span>
                            <span><i class="fab fa-twitter-square"></i></span>
                        </div>
                    </div>
                    <div class="card-body">
                        <form method="post">
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" class="form-control" placeholder="username" name="email">

                            </div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" class="form-control" placeholder="password" name="password">
                            </div>
                            <div class="row align-items-center remember">
                                <input type="checkbox">Remember Me
                            </div>
                            <div class="form-group">
                                <input type="submit" name="submit" id="submit" class="btn float-right login_btn">
                            </div>
                            <div class="row align-items-center remember">
                                <a href="index.jsp"> Home </a>
                            </div>

                        </form>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            Don't have an account?<a href="reg.jsp">Sign Up</a>
                        </div>
                        <div class="d-flex justify-content-center">
                            <a href="#">Forgot your password?</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>