/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-04-18 04:44:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Sign_Up_Page</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .container{\r\n");
      out.write("            width: 100;\r\n");
      out.write("            height: 100vh;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("            align-content: center;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        .sign_up{\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 500px;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding-top: auto;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=submit]{\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            background-color: #fb641b;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            box-shadow: 0 1px 2px 0 rgb(0 0 0 / 20%);\r\n");
      out.write("        }\r\n");
      out.write("        .existing_user .btn{\r\n");
      out.write("            width: 420px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border: 1px solid white;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            color: #2874f0;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            box-shadow: 0 2px 4px 0 rgb(0 0 0 / 20%);\r\n");
      out.write("        }\r\n");
      out.write("        .content{\r\n");
      out.write("            padding: 40px;\r\n");
      out.write("        }\r\n");
      out.write("        .content input{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 12px 20px;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-bottom: 2px solid lightgrey;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("        <div class=\"sign_up\">\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <form action=\"adduser.jsp\" method=\"post\">\r\n");
      out.write("                    <input type=\"text\" name=\"userName\" placeholder=\"User Name\">\r\n");
      out.write("                    <input type=\"text\" name=\"mobileNumber\" placeholder=\"Mobile number\">\r\n");
      out.write("                    <input type=\"password\" name=\"password\" placeholder=\"Set password\">\r\n");
      out.write("                    <input type=\"password\" name=\"confirmPassword\" placeholder=\"Confirm password\">\r\n");
      out.write("                    <p style=\"text-align: left;\">By continuing, you agree to Flipkart's <a href=\"#\"> Terms of Use </a> and <a href=\"#\">Privacy Policy</a>.</p>\r\n");
      out.write("                    <input type=\"submit\" value=\"submit\">\r\n");
      out.write("                </form>\r\n");
      out.write("               \r\n");
      out.write("                <br><br>\r\n");
      out.write("                <a href=\"login.jsp\" class=\"existing_user\"><button class=\"btn\">Existing User? Log in</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
