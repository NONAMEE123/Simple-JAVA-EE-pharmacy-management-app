package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t<title>Inventory Management System</title>\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\" integrity=\"sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write(" \t<link rel=\"stylesheet\" type=\"text/css\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write(" \t<link rel=\"stylesheet\" type=\"text/css\" href=\"./includes/style.css\">\n");
      out.write(" \t<script type=\"text/javascript\" rel=\"stylesheet\" src=\"./js/main.js\"></script>\n");
      out.write(" </head>\n");
      out.write("<body>\n");
      out.write("<div class=\"overlay\"><div class=\"loader\"></div></div>\n");
      out.write("\t<br/><br/>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\n");
      out.write("\t\t\t\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-label=\"Close\">\n");
      out.write("\t\t\t\t\t    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("\t\t\t\t\t  </button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"card mx-auto\" style=\"width: 20rem;\">\n");
      out.write("\t\t  <img class=\"card-img-top mx-auto\" style=\"width:60%;\" src=\"./images/login.png\" alt=\"Login Icon\">\n");
      out.write("\t\t  <div class=\"card-body\">\n");
      out.write("\t\t    <form id=\"form_login\" onsubmit=\"return false\">\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("\t\t\t    <input type=\"email\" class=\"form-control\" name=\"log_email\" id=\"log_email\" placeholder=\"Enter email\">\n");
      out.write("\t\t\t    <small id=\"e_error\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("\t\t\t    <input type=\"password\" class=\"form-control\" name=\"log_password\" id=\"log_password\" placeholder=\"Password\">\n");
      out.write("\t\t\t  \t<small id=\"p_error\" class=\"form-text text-muted\"></small>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t  <button type=\"submit\" class=\"btn btn-primary\"><i class=\"fa fa-lock\">&nbsp;</i>Login</button>\n");
      out.write("\t\t\t  <span><a href=\"register.php\">Register</a></span>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t    \n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  <div class=\"card-footer\"><a href=\"#\">Forget Password ?</a></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
