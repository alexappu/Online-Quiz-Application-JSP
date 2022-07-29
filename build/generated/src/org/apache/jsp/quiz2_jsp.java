package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class quiz2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      DataBase.ConnectionClass obj = null;
      synchronized (_jspx_page_context) {
        obj = (DataBase.ConnectionClass) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new DataBase.ConnectionClass();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
String sid = (String) session.getAttribute("sid");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");

//    String loginrole = "";
//    String loginid = "";
//    String que_id = request.getParameter("queid");
//    if (request.getParameter("submit") != null) {
//        String ans1 = request.getParameter("answer1");
//        String ans2 = request.getParameter("answer2");
//        String ans3 = request.getParameter("answer3");
//        String ans4 = request.getParameter("answer4");
//        
//         String ins = "insert into answer(answer,answer1,answer2,answer3,q_id,status)values('" + ans1 + "','" + ans2 + "','" + ans3 + "','" + ans4 + "','" + que_id + "','Answer Added Successfully')";
//        String upq = "update question set q_status='Answer Added' where q_id='"+que_id+"'";
////        '" + username + "',
//        boolean b = obj.insert(ins);
//        boolean c = obj.insert(upq);
////        out.print(ins);
//        if (c) {

      out.write("   \n");
      out.write("\n");
      out.write("<!--<script>alert('Answers Added Successfully');\n");
      out.write("     setTimeout(function () {\n");
      out.write("        window.location.href = 'create_mcq.jsp'\n");
      out.write("    }, 40);\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>-->\n");
      out.write("\n");

//} else {

      out.write("   \n");
      out.write("\n");
      out.write("<!--<script>alert('Data Not Inserted');</script>-->\n");

  //      }
  // }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500&display=swap');\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: #b8c6db;\n");
      out.write("                background-image: linear-gradient(315deg, #b8c6db 0%, #f5f7f7 100%);\n");
      out.write("                font-family: 'Poppins', sans-serif;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                height: 100vh;\n");
      out.write("                overflow: hidden;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .quiz-container{\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 0 10px 2px rgba(100, 100, 100, 0.1);\n");
      out.write("                width: 600px;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .quiz-header{\n");
      out.write("                padding: 4rem;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                padding: 1rem;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul{\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            ul li{\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("                margin: 1rem 0;\n");
      out.write("            }\n");
      out.write("            ul li label{\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                background-color: #03cae4;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 1.1rem;\n");
      out.write("                font-family: inherit;\n");
      out.write("                padding: 1.3rem;\n");
      out.write("            }\n");
      out.write("            button:hover{\n");
      out.write("                background-color: #04adc4;\n");
      out.write("            }\n");
      out.write("            button:focus{\n");
      out.write("                outline: none;\n");
      out.write("                background-color: #44b927;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

//        String sub1 = request.getParameter("cid");
//        String Selq1 = "select * from subject where sub_id='"+sub1+"'";
//         ResultSet rs1 = obj.select(Selq1);
//         String subname = rs1.getString("sub_name");
//         out.println(subname);
       
       
       
      out.write("\n");
      out.write("    \n");
      out.write("       \n");
      out.write("  \n");
      out.write("        <form method=\"post\">\n");
      out.write("\n");
      out.write("           ");

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
                                            

                    
      out.write("\n");
      out.write("                    ");
      out.print(i);
      out.write(". \n");
      out.write("                    ");
      out.print(que);
      out.write("\n");
      out.write("                    <p></p>\n");
      out.write("<!--                    <input type=\"radio\" name=\"ans\" id=\"ans\">");
      out.print(name);
      out.write(" &nbsp; <input type=\"radio\" name=\"ans1\" id=\"ans1\">");
      out.print(name1);
      out.write(" <br>\n");
      out.write("                    <input type=\"radio\" name=\"ans2\" id=\"ans2\">");
      out.print(name2);
      out.write(" &nbsp; <input type=\"radio\" name=\"ans3\" id=\"ans3\">");
      out.print(name3);
      out.write(" <br>-->\n");
      out.write("                    <ul class=\"choice\">\n");
      out.write("\t\t\t\t\t   <li><input name=\"choice\" type=\"radio\" value=\"a\" required=\"\">");
      out.print(name+""+i);
      out.write("&nbsp; \n");
      out.write("\t\t\t\t\t   <input name=\"choice1\" type=\"radio\" value=\"b\" required=\"\">");
      out.print(name1+""+i);
      out.write("</li>\n");
      out.write("\t\t\t\t\t   <li><input name=\"choice2\" type=\"radio\" value=\"c\" required=\"\">");
      out.print(name2+""+i);
      out.write("&nbsp;\n");
      out.write("\t\t\t\t\t   <input name=\"choice3\" type=\"radio\" value=\"d\" required=\"\">");
      out.print(name3+""+i);
      out.write("</li>\n");
      out.write("\t\t\t\t\t \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("                    <p class=\"text-xs font-weight-bold mb-0\"></p>\n");
      out.write("                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <button id=\"submit\" name=\"submit\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
