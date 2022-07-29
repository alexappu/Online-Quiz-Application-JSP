<%-- 
    Document   : reg
    Created on : 13 Jun, 2022, 8:08:53 PM
    Author     : Anju
--%>
<jsp:useBean class="DataBase.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
//    String loginrole = "";
//    String loginid = "";
    if (request.getParameter("submit") != null) {
        String name = request.getParameter("name");
        String dep = request.getParameter("id");
        String role = request.getParameter("id1");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
//        String inss = "insert into user(name,dep_id,email,type_id,password)values('" + name+ "','" + dep+ "','" + email + "','"+role+"','" + password + "','active')";
//        boolean a = obj.insert(inss);
//        if (a) {
//            String ss = "select * from tbl_login where login_mail='" + email + "' and login_password='" + password + "'";
//            ResultSet n = obj.select(ss);
//            if (n.next()) {
//                loginid = n.getString("login_id");
//            }
//        }
        String ins = "insert into user(name,dep_id,email,type_id,password,status)values('" + name + "','" + dep + "','" + email + "', '" + role + "','" + password + "',1)";
//        '" + username + "',
        boolean b = obj.insert(ins);
//        out.print(ins);
        if (b) {
%>   

<script>alert('User Added Successfully');
     setTimeout(function () {
        window.location.href = 'login.jsp'
    }, 40);


</script>

<%
} else {
%>   

<script>alert('Data Not Inserted');</script>
<%
        }
    }
%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link rel="stylesheet" type="text/css" href="reg.css">
        <script src="reg.js"></script>
    </head>
    <body>


        <div class="container">

            <div class="row">
                <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                    <form role="form">
                        <h2>Please Sign Up <small>It's free and always will be.</small></h2>
                        <hr class="colorgraph">
                        <div class="row">
                            <div class="col-xs-12 col-sm-6 col-md-6">
                                <div class="form-group">
                                    <input type="text" name="name" id="name" class="form-control input-lg" placeholder="Name" tabindex="1">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="id">Choose your Department:</label>
                            <select name="id" id="id">
                                <option>Choose Your Department</option>
                                <%
                                    String selq1 = "select *from department where status='Added' ";
                                    ResultSet rs1 = obj.select(selq1);

                                    while (rs1.next()) {
                                        String id = rs1.getString("dep_id");
                                        String name = rs1.getString("name");
                                %>
                                <option value="<%=id%>"><%=name%></option>
                                <%}%>

                            </select>
                            <div class="form-group">
                                <label for="id">Choose your role:</label>

                                <select name="id1" id="id1">
                                    <option>Choose any option</option>
                                    <%
                                        String selq2 = "select *from user_type where type_id != 1";
                                        ResultSet rs2 = obj.select(selq2);

                                        while (rs2.next()) {
                                            String id1 = rs2.getString("type_id");
                                            String name1 = rs2.getString("type_name");
                                    %>
                                    <option value="<%=id1%>"><%=name1%></option>
                                    <%}%>  

                                </select>

                            </div>
                            <div class="form-group">
                                <input type="email" name="email" id="email" class="form-control input-lg" placeholder="Email Address" tabindex="4">
                            </div>
                            <div class="row">
                                <div class="col-xs-12 col-sm-6 col-md-6">
                                    <div class="form-group">
                                        <input type="text" name="password" id="password" class="form-control input-lg" placeholder="Password" tabindex="5">
                                    </div>
                                </div>
                            </div>
                            <hr class="colorgraph">
                            <div class="row">
                                <div class="col-xs-12 col-md-6"><input type="submit" name="submit" id="submit" class="btn btn-primary btn-block btn-lg" tabindex="7">Register</div>
                            </div>
                    </form>
                </div>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="t_and_c_m" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title" id="myModalLabel">Terms & Conditions</h4>
                        </div>
                        <div class="modal-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Similique, itaque, modi, aliquam nostrum at sapiente consequuntur natus odio reiciendis perferendis rem nisi tempore possimus ipsa porro delectus quidem dolorem ad.</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">I Agree</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->
        </div>

    </body>
</html>
