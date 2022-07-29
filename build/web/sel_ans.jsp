<jsp:useBean class="DataBase.ConnectionClass" id="obj"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%String sid = (String) session.getAttribute("sid");%>
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
    String que_id = request.getParameter("queid");
    if (request.getParameter("submit") != null) {
        String ans1 = request.getParameter("answer1");
        String ans2 = request.getParameter("answer2");
        String ans3 = request.getParameter("answer3");
        String ans4 = request.getParameter("answer4");
        
         String ins = "insert into answer(answer,answer1,answer2,answer3,q_id)values('" + ans1 + "','" + ans2 + "','" + ans3 + "','" + ans4 + "','" + que_id + "')";
        String upq = "update question set q_status='Answer Added' where q_id='"+que_id+"'";
//        '" + username + "',
        boolean b = obj.insert(ins);
        boolean c = obj.insert(upq);
       out.print(ins);
         if(c) {
            
%> 

<script>alert('Answers Added Successfully');
     setTimeout(function () {
        window.location.href = 'create_mcq.jsp'
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
                margin: 0;
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
        <form method="post">

            <h4 id="ans">Correct Answer</h4>
            <textarea id="answer1" name="answer1" rows="2" cols="50">
            </textarea>
            <h4 id="wans1">Wrong Answer1</h4>
            <textarea id="answer2" name="answer2" rows="2" cols="50">
            </textarea>
            <h4 id="wans2">Wrong Answer2 </h4>
            <textarea id="answer3" name="answer3" rows="2" cols="50">
            </textarea>
            <h4 id="wans3">Wrong Answer3 </h4>
            <textarea id="answer4" name="answer4" rows="2" cols="50">
            </textarea>


        </div>

        <button id="submit" name="submit">Submit</button>
    </form>

</div>

</body>
</html>
