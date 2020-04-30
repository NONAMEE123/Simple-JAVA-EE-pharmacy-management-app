package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\" rel=\"stylesheet\">\n");
      out.write("<title>Bootstrap Simple Login Form with Blue Background</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\tbackground: #3598dc;\n");
      out.write("\t\tfont-family: 'Roboto', sans-serif;\n");
      out.write("\t}\n");
      out.write("    .form-control{\n");
      out.write("\t\theight: 41px;\n");
      out.write("\t\tbackground: #f2f2f2;\n");
      out.write("\t\tbox-shadow: none !important;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t}\n");
      out.write("\t.form-control:focus{\n");
      out.write("\t\tbackground: #e2e2e2;\n");
      out.write("\t}\n");
      out.write("    .form-control, .btn{        \n");
      out.write("        border-radius: 3px;\n");
      out.write("    }\n");
      out.write("\t.signup-form{\n");
      out.write("\t\twidth: 390px;\n");
      out.write("\t\tmargin: 30px auto;\n");
      out.write("\t}\n");
      out.write("\t.signup-form form{\n");
      out.write("\t\tcolor: #999;\n");
      out.write("\t\tborder-radius: 3px;\n");
      out.write("    \tmargin-bottom: 15px;\n");
      out.write("        background: #fff;\n");
      out.write("        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("        padding: 30px;\n");
      out.write("    }\n");
      out.write("\t.signup-form h2 {\n");
      out.write("\t\tcolor: #333;\n");
      out.write("\t\tfont-weight: bold;\n");
      out.write("        margin-top: 0;\n");
      out.write("    }\n");
      out.write("    .signup-form hr {\n");
      out.write("        margin: 0 -30px 20px;\n");
      out.write("    }    \n");
      out.write("\t.signup-form .form-group{\n");
      out.write("\t\tmargin-bottom: 20px;\n");
      out.write("\t}\n");
      out.write("\t.signup-form input[type=\"checkbox\"]{\n");
      out.write("\t\tmargin-top: 3px;\n");
      out.write("\t}\n");
      out.write("\t.signup-form .row div:first-child{\n");
      out.write("\t\tpadding-right: 10px;\n");
      out.write("\t}\n");
      out.write("\t.signup-form .row div:last-child{\n");
      out.write("\t\tpadding-left: 10px;\n");
      out.write("\t}\n");
      out.write("    .signup-form .btn{        \n");
      out.write("        font-size: 16px;\n");
      out.write("        font-weight: bold;\n");
      out.write("\t\tbackground: #3598dc;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t\tmin-width: 140px;\n");
      out.write("    }\n");
      out.write("\t.signup-form .btn:hover, .signup-form .btn:focus{\n");
      out.write("\t\tbackground: #2389cd !important;\n");
      out.write("        outline: none;\n");
      out.write("\t}\n");
      out.write("    .signup-form a{\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\ttext-decoration: underline;\n");
      out.write("\t}\n");
      out.write("\t.signup-form a:hover{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t}\n");
      out.write("\t.signup-form form a{\n");
      out.write("\t\tcolor: #3598dc;\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t}\t\n");
      out.write("\t.signup-form form a:hover{\n");
      out.write("\t\ttext-decoration: underline;\n");
      out.write("\t}\n");
      out.write("    .signup-form .hint-text {\n");
      out.write("\t\tpadding-bottom: 15px;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"signup-form\">\n");
      out.write("    <form action=\"ajoute\" method=\"post\">\n");
      out.write("\t\t<h2>Sign Up</h2>\n");
      out.write("\t\t<p>Please fill in this form to create an account!</p>\n");
      out.write("\t\t<hr>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-6\"><input type=\"text\" class=\"form-control\" name=\"nom\" placeholder=\"First Name\" required=\"required\"></div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-6\"><input type=\"text\" class=\"form-control\" name=\"prenom\" placeholder=\"Last Name\" required=\"required\"></div>\n");
      out.write("\t\t\t</div>        \t\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        \t<input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("\t\t     \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("\t\t\t<label class=\"checkbox-inline\"><input type=\"checkbox\" required=\"required\"> I accept the <a href=\"#\">Terms of Use</a> &amp; <a href=\"#\">Privacy Policy</a></label>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-lg\">Sign Up</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\t<div class=\"hint-text\">Already have an account? <a href=\"login.jsp\">Login here</a></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>                            ");
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
