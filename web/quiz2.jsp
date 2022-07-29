<%-- 
    Document   : quiz2
    Created on : 20 Jul, 2022, 9:56:03 PM
    Author     : Anju
--%>

<jsp:useBean class="DataBase.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%String sid = (String) session.getAttribute("sid");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String sl_id2 = request.getParameter("cid");
    String namee = "jjkd";
    int score = 0;
    String Slq = "select * from answer a inner join question b on a.q_id=b.q_id where sub_id='"+sl_id2+"' ";
    ResultSet rs1 = obj.select(Slq);

                                        while (rs1.next()) {
                                            String id = rs1.getString("ans_id");
                                            String ans = rs1.getString("answer");
    
if(ans.substring(0,3 ).equals(namee))
{
    score = score + 1 ;
    
    
}else{
    score=3;
}}
%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
//    String loginrole = "";
//    String loginid = "";
  
   String sl_id1 = request.getParameter("cid");
   String sub = request.getParameter("name");
    
    if (request.getParameter("submit") != null) {
//        String ans1 = request.getParameter("answer1");
//        String ans2 = request.getParameter("answer2");
//        String ans3 = request.getParameter("answer3");
//        String ans4 = request.getParameter("answer4");
//        
         String ins = "insert into score(score,sub_id,user_id)values('" + score + "','" + sl_id1 + "','" + sid + "')";
         out.print(ins);
//        String upq = "update question set q_status='Answer Added' where q_id='"+que_id+"'";
////        '" + username + "',
        boolean b = obj.insert(ins);
//       boolean c = obj.insert(upq);
////        out.print(ins);
        if (b) {
%>   

<script>alert('Thank You for Attempting Quiz');
     setTimeout(function () {
        window.location.href = 'student1.jsp'
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
        <style>


            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500&display=swap');

            *{
                box-sizing: border-box;
            }
            body{
                background-color: #b8c6db;
                background-image: linear-gradient(315deg, #b8c6db 0%, #f5f7f7 100%);
                font-family: 'Poppins', sans-serif;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                overflow: hidden;
                margin: 0;
            }
            .quiz-container{
                background-color: #fff;
                border-radius: 10px;
                box-shadow: 0 0 10px 2px rgba(100, 100, 100, 0.1);
                width: 600px;
                overflow: hidden;
            }
            .quiz-header{
                padding: 4rem;
            }
            h2{
                padding: 1rem;
                text-align: center;
                margin: 0
            }
             h1{
                
                text-align: center;
                margin: 0
            }

            ul{
                list-style-type: none;
                padding: 0;
            }
            ul li{
                font-size: 1.2rem;
                margin: 1rem 0;
            }
            ul li label{
                cursor: pointer;
            }
            button{
                background-color: #03cae4;
                color: #fff;
                border: none;
                display: block;
                width: 100%;
                cursor: pointer;
                font-size: 1.1rem;
                font-family: inherit;
                padding: 1.3rem;
            }
            button:hover{
                background-color: #04adc4;
            }
            button:focus{
                outline: none;
                background-color: #44b927;
            }

        </style>
    </head>
    <body>
       <%
//        String sub1 = request.getParameter("cid");
//        String Selq1 = "select * from subject where sub_id='"+sub1+"'";
//         ResultSet rs1 = obj.select(Selq1);
//         String subname = rs1.getString("sub_name");
//         out.println(subname);
       
       
       %>
    
       
  
        <form method="post">
            <h1>WELCOME TO THE QUIZ</h1>
           <%
//                                        String sld1 = request.getParameter("sid");
                                        String sl_id = request.getParameter("cid");
                                        String Selq = "SELECT *FROM question a INNER JOIN answer b ON a.q_id = b.q_id where sub_id='"+sl_id+"'";
                                        ResultSet rs = obj.select(Selq);
                                        int i=0;

                                        while (rs.next()) {
                                            i++;
                                            String id = rs.getString("q_id");
                                            String que = rs.getString("que_name");
                                            String name = rs.getString("answer");
                                            String name1 = rs.getString("answer1");
                                            String name2 = rs.getString("answer2");
                                            String name3 = rs.getString("answer3");
                                            

                    %>
                    <%=i%>. 
                    <%=que%>
                    <p></p>
<!--                    <input type="radio" name="ans" id="ans"><%=name%> &nbsp; <input type="radio" name="ans1" id="ans1"><%=name1%> <br>
                    <input type="radio" name="ans2" id="ans2"><%=name2%> &nbsp; <input type="radio" name="ans3" id="ans3"><%=name3%> <br>-->
                    <ul class="choice">
                        <li><input name="<%=id%>" type="radio" value="<%=name%>" required=""><%=name%>&nbsp; 
					   <input name="<%=id%>" type="radio" value="<%=name1%>" required=""><%=name1%></li>
					   <li><input name="<%=id%>" type="radio" value="<%=name2%>" required=""><%=name2%>&nbsp;
					   <input name="<%=id%>" type="radio" value="<%=name3%>" required=""><%=name3%></li>
                                           
                                           
					 
					</ul>
                                        
                                         <p class="text-xs font-weight-bold mb-0"></p>

                    
                    <%}%>


        </div>

        <button id="submit" name="submit">Submit</button>
    </form>
</div>

</body>
</html>
