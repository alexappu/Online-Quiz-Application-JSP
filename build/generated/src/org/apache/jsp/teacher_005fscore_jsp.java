package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.*;
import java.util.*;
import java.io.*;

public final class teacher_005fscore_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
String sid = (String) session.getAttribute("sid");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.png\">\n");
      out.write("        <title>\n");
      out.write("            Quiz Application \n");
      out.write("        </title>\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900|Roboto+Slab:400,700\" />\n");
      out.write("        <!-- Nucleo Icons -->\n");
      out.write("        <link href=\"Admin/assets/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"Admin/assets/css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/42d5adcbca.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Material Icons -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons+Round\" rel=\"stylesheet\">\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link id=\"pagestyle\" href=\"Admin/assets/css/material-dashboard.css?v=3.0.3\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <aside class=\"sidenav navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-3   bg-gradient-dark\" id=\"sidenav-main\">\n");
      out.write("        <div class=\"sidenav-header\">\n");
      out.write("            <i class=\"fas fa-times p-3 cursor-pointer text-white opacity-5 position-absolute end-0 top-0 d-none d-xl-none\" aria-hidden=\"true\" id=\"iconSidenav\"></i>\n");
      out.write("            <a class=\"navbar-brand m-0\" href=\" https://demos.creative-tim.com/material-dashboard/pages/dashboard \" target=\"_blank\">\n");
      out.write("                <img src=\"Admin/assets/img/logo-ct.png\" class=\"navbar-brand-img h-100\" alt=\"main_logo\">\n");
      out.write("                <span class=\"ms-1 font-weight-bold text-white\">User</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <hr class=\"horizontal light mt-0 mb-2\">\n");
      out.write("        <div class=\"collapse navbar-collapse  w-auto \" id=\"sidenav-collapse-main\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link text-white \" href=\"\">\n");
      out.write("                        <div class=\"text-white text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                            <i class=\"material-icons opacity-10\">dashboard</i>\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"nav-link-text ms-1\">User Dashboard</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("<!--                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link text-white \" href=\"add_dep.jsp\">\n");
      out.write("                        <div class=\"text-white text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                            <i class=\"material-icons opacity-10\">table_view</i>\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"nav-link-text ms-1\">Add Department</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>-->\n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidenav-footer position-absolute w-100 bottom-0 \">\n");
      out.write("            <div class=\"mx-3\">\n");
      out.write("                <a class=\"btn bg-gradient-primary mt-4 w-100\" href=\"index_teacher.jsp\" type=\"button\">Go Back</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </aside>\n");
      out.write("    <div class=\"main-content position-relative max-height-vh-100 h-100\">\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <nav class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl\" id=\"navbarBlur\" data-scroll=\"true\">\n");
      out.write("            <div class=\"container-fluid py-1 px-3\">\n");
      out.write("                <nav aria-label=\"breadcrumb\">\n");
      out.write("                    <ol class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\n");
      out.write("                        <li class=\"breadcrumb-item text-sm\"><a class=\"opacity-5 text-dark\" href=\"javascript:;\">User</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item text-sm text-dark active\" aria-current=\"page\">Home</li>\n");
      out.write("                    </ol>\n");
      out.write("                    <h6 class=\"font-weight-bolder mb-0\">Add User</h6>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"collapse navbar-collapse mt-sm-0 mt-2 me-md-0 me-sm-4\" id=\"navbar\">\n");
      out.write("                    <div class=\"ms-md-auto pe-md-3 d-flex align-items-center\">\n");
      out.write("                        <div class=\"input-group input-group-outline\">\n");
      out.write("                            <label class=\"form-label\">Type here...</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"navbar-nav  justify-content-end\">\n");
      out.write("                        <li class=\"nav-item d-flex align-items-center\">\n");
      out.write("                            <a href=\"Admin/pages/sign-in.html\" class=\"nav-link text-body font-weight-bold px-0\">\n");
      out.write("                                <i class=\"fa fa-user me-sm-1\"></i>\n");
      out.write("                                <span class=\"d-sm-inline d-none\">Sign In</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item d-xl-none ps-3 d-flex align-items-center\">\n");
      out.write("                            <a href=\"javascript:;\" class=\"nav-link text-body p-0\" id=\"iconNavbarSidenav\">\n");
      out.write("                                <div class=\"sidenav-toggler-inner\">\n");
      out.write("                                    <i class=\"sidenav-toggler-line\"></i>\n");
      out.write("                                    <i class=\"sidenav-toggler-line\"></i>\n");
      out.write("                                    <i class=\"sidenav-toggler-line\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item px-3 d-flex align-items-center\">\n");
      out.write("                            <a href=\"javascript:;\" class=\"nav-link text-body p-0\">\n");
      out.write("                                <i class=\"fa fa-cog fixed-plugin-button-nav cursor-pointer\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown pe-2 d-flex align-items-center\">\n");
      out.write("                            <a href=\"javascript:;\" class=\"nav-link text-body p-0\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fa fa-bell cursor-pointer\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu  dropdown-menu-end  px-2 py-3 me-sm-n4\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                                <li class=\"mb-2\">\n");
      out.write("                                    <a class=\"dropdown-item border-radius-md\" href=\"javascript:;\">\n");
      out.write("                                        <div class=\"d-flex py-1\">\n");
      out.write("                                            <div class=\"my-auto\">\n");
      out.write("                                                <img src=\"Admin/assets/img/team-2.jpg\" class=\"avatar avatar-sm  me-3 \">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"d-flex flex-column justify-content-center\">\n");
      out.write("                                                <h6 class=\"text-sm font-weight-normal mb-1\">\n");
      out.write("                                                    <span class=\"font-weight-bold\">New message</span> from Laur\n");
      out.write("                                                </h6>\n");
      out.write("                                                <p class=\"text-xs text-secondary mb-0\">\n");
      out.write("                                                    <i class=\"fa fa-clock me-1\"></i>\n");
      out.write("                                                    13 minutes ago\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"mb-2\">\n");
      out.write("                                    <a class=\"dropdown-item border-radius-md\" href=\"javascript:;\">\n");
      out.write("                                        <div class=\"d-flex py-1\">\n");
      out.write("                                            <div class=\"my-auto\">\n");
      out.write("                                                <img src=\"../assets/img/small-logos/logo-spotify.svg\" class=\"avatar avatar-sm bg-gradient-dark  me-3 \">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"d-flex flex-column justify-content-center\">\n");
      out.write("                                                <h6 class=\"text-sm font-weight-normal mb-1\">\n");
      out.write("                                                    <span class=\"font-weight-bold\">New album</span> by Travis Scott\n");
      out.write("                                                </h6>\n");
      out.write("                                                <p class=\"text-xs text-secondary mb-0\">\n");
      out.write("                                                    <i class=\"fa fa-clock me-1\"></i>\n");
      out.write("                                                    1 day\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a class=\"dropdown-item border-radius-md\" href=\"javascript:;\">\n");
      out.write("                                        <div class=\"d-flex py-1\">\n");
      out.write("                                            <div class=\"avatar avatar-sm bg-gradient-secondary  me-3  my-auto\">\n");
      out.write("                                                <svg width=\"12px\" height=\"12px\" viewBox=\"0 0 43 36\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n");
      out.write("                                                <title>credit-card</title>\n");
      out.write("                                                <g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\">\n");
      out.write("                                                <g transform=\"translate(-2169.000000, -745.000000)\" fill=\"#FFFFFF\" fill-rule=\"nonzero\">\n");
      out.write("                                                <g transform=\"translate(1716.000000, 291.000000)\">\n");
      out.write("                                                <g transform=\"translate(453.000000, 454.000000)\">\n");
      out.write("                                                <path class=\"color-background\" d=\"M43,10.7482083 L43,3.58333333 C43,1.60354167 41.3964583,0 39.4166667,0 L3.58333333,0 C1.60354167,0 0,1.60354167 0,3.58333333 L0,10.7482083 L43,10.7482083 Z\" opacity=\"0.593633743\"></path>\n");
      out.write("                                                <path class=\"color-background\" d=\"M0,16.125 L0,32.25 C0,34.2297917 1.60354167,35.8333333 3.58333333,35.8333333 L39.4166667,35.8333333 C41.3964583,35.8333333 43,34.2297917 43,32.25 L43,16.125 L0,16.125 Z M19.7083333,26.875 L7.16666667,26.875 L7.16666667,23.2916667 L19.7083333,23.2916667 L19.7083333,26.875 Z M35.8333333,26.875 L28.6666667,26.875 L28.6666667,23.2916667 L35.8333333,23.2916667 L35.8333333,26.875 Z\"></path>\n");
      out.write("                                                </g>\n");
      out.write("                                                </g>\n");
      out.write("                                                </g>\n");
      out.write("                                                </g>\n");
      out.write("                                                </svg>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"d-flex flex-column justify-content-center\">\n");
      out.write("                                                <h6 class=\"text-sm font-weight-normal mb-1\">\n");
      out.write("                                                    Payment successfully completed\n");
      out.write("                                                </h6>\n");
      out.write("                                                <p class=\"text-xs text-secondary mb-0\">\n");
      out.write("                                                    <i class=\"fa fa-clock me-1\"></i>\n");
      out.write("                                                    2 days\n");
      out.write("                                                </p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container-fluid px-2 px-md-4\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"page-header min-height-300 border-radius-xl mt-4\" style=\"background-image: url('https://images.unsplash.com/photo-1531512073830-ba890ca4eba2?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1920&q=80');\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"card my-4\">\n");
      out.write("                    <div class=\"card-header p-0 position-relative mt-n4 mx-3 z-index-2\">\n");
      out.write("                        <div class=\"bg-gradient-primary shadow-primary border-radius-lg pt-4 pb-3\">\n");
      out.write("                            <h6 class=\"text-white text-capitalize ps-3\">Subject List</h6>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body px-0 pb-2\">\n");
      out.write("                        <div class=\"table-responsive p-0\">\n");
      out.write("                            <table class=\"table align-items-center mb-0\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th class=\"text-uppercase text-secondary text-xxs font-weight-bolder opacity-7\"> No</th>\n");
      out.write("                                        <th class=\"text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2\">Student Name</th>\n");
      out.write("                                        <th class=\"text-uppercase text-uppercase text-secondary text-xxs font-weight-bolder opacity-7\">Score</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        String Selq = "SELECT *FROM score a INNER JOIN user b ON a.user_id = b.user_id" ;
                                                
                                        ResultSet rs = obj.select(Selq);

                                        while (rs.next()) {
                                            String id = rs.getString("user_id");
                                            String name = rs.getString("name");
                                             String name1 = rs.getString("score");
                                            

                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <p class=\"text-xs font-weight-bold mb-0\">");
      out.print(id);
      out.write("</p>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <p class=\"text-xs font-weight-bold mb-0\" >");
      out.print(name);
      out.write("</p>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <p class=\"text-xs font-weight-bold mb-0\" >");
      out.print(name1);
      out.write("</p>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"align-middle\">\n");
      out.write("<!--                                            <a href=\"add_user.jsp?edid=");
      out.print(id);
      out.write("\" class=\"btn btn-sm btn-warning\">Edit</a><p></p>-->\n");
      out.write("<!--                                            <a href=\"quiz2.jsp?cid=");
      out.print(id);
      out.write("\" class=\"btn btn-sm btn-danger\">Attempt Quiz</a>-->\n");
      out.write("\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"Admin/assets/js/core/popper.min.js\"></script>\n");
      out.write("    <script src=\"Admin/assets/js/core/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"Admin/assets/js/plugins/perfect-scrollbar.min.js\"></script>\n");
      out.write("    <script src=\"Admin/assets/js/plugins/smooth-scrollbar.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("    var win = navigator.platform.indexOf('Win') > -1;\n");
      out.write("    if (win && document.querySelector('#sidenav-scrollbar')) {\n");
      out.write("        var options = {\n");
      out.write("            damping: '0.5'\n");
      out.write("        }\n");
      out.write("        Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    <!-- Github buttons -->\n");
      out.write("    <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
      out.write("    <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("    <script src=\"Admin/assets/js/material-dashboard.min.js?v=3.0.3\"></script>      \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
