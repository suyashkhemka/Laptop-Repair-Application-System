package org.apache.jsp.VIEW_005fPROJECT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Accessibility_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/VIEW_PROJECT/Header.html");
    _jspx_dependants.add("/VIEW_PROJECT/Footer.html");
  }

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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Styling.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"8px\" width=\"820px\" height=\"10px\" align=\"center\">\n");
      out.write("            <tr width=\"820\" height=\"200\" align=\"centre\" >\n");
      out.write("                <td></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <div id=\"d\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">HOME</a></li>\n");
      out.write("                            <li><a href=\"Aboutus.jsp\">ABOUT US</a>\n");
      out.write("                                <ul>\n");
      out.write("                                     <li><a href=\"Aboutus.jsp\">ABOUT US</a></li>\n");
      out.write("                                     <li><a href=\"#\">ACCESSIBILITY</a></li>\n");
      out.write("                                     <li><a href=\"#\">CLIENT TESTIMONIALS</a></li>\n");
      out.write("                                     <li><a href=\"#\">NEWS/MEDIA</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">SERVICES</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"Services/online.jsp\">ONLINE SERVICES</a></li>\n");
      out.write("                                    <li><a href=\"#\">DOOR SERVICES</a></li>\n");
      out.write("          \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">PARTNERS</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">HP</a></li>\n");
      out.write("                                    <li><a href=\"#\">HCL</a></li>\n");
      out.write("                                    <li><a href=\"#\">DELL</a></li>\n");
      out.write("                                    <li><a href=\"#\">MACANTOSH</a></li>\n");
      out.write("                                    <li><a href=\"#\">LENOVO</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">SUPPORT</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">CONTACTS</a></li> \n");
      out.write("                                    <li><a href=\"#\">DOWNLOAD DRIVERS</a></li>\n");
      out.write("                                    <li><a href=\"#\">CERTIFICATION</a></li>\n");
      out.write("                                    <li><a href=\"#\">PDFs</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<br><br><br><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form action=\"../CONTROLLER_PROJECT/Accessibility.jsp\">\n");
      out.write("            <b>Brand:</b><br>\n");
      out.write("            <input type=\"radio\" name=\"brand\" value=\"dell\">Dell<br>\n");
      out.write("            <input type=\"radio\" name=\"brand\" value=\"hp\">HP<br>\n");
      out.write("            <input type=\"radio\" name=\"brand\" value=\"asus\">Asus<br>\n");
      out.write("            <input type=\"radio\" name=\"brand\" value=\"compaq\">Compaq<br>\n");
      out.write("            <input type=\"radio\" name=\"brand\" value=\"samsung\">Samsung<br><br>\n");
      out.write("            <input type=\"submit\" value=\"Find Me Service Centers\">\n");
      out.write("        </form>\n");
      out.write("        <br><br><br><br>");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Styling.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend style=\"color:lightgray; font-family: algerian;\">\n");
      out.write("                <b><u>STAY CONNECTED</u></b>\n");
      out.write("            </legend>\n");
      out.write("        <p>\n");
      out.write("           <b><i>\"OVER 10,000 CUSTOMERS WHO RECEIVE THEIR BEST SERVICE EVERY MONTH\"</i></b>\n");
      out.write("        </p>\n");
      out.write("        <br>\n");
      out.write("        <table>\n");
      out.write("           <tr>\n");
      out.write("               <td><input type=\"text\" name=\"Email Id\" value=\"\"/></td>\n");
      out.write("           \n");
      out.write("               <td><b>Sign Up</b></td>\n");
      out.write("           </tr>\n");
      out.write("       </table>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("       <div>\n");
      out.write("           <br>\n");
      out.write("                <a href=\"#\"><img src=\"Images/facebook.png\" alt=\"FACEBOOK\" width=\"35\" height=\"35\" style=\"margin:4px\"/></a> \n");
      out.write("                <a href=\"#\"><img src=\"Images/twitter.png\" alt=\"TWITTER\" width=\"35\" height=\"35\" style=\"margin:4px\"/></a>\n");
      out.write("                <a href=\"#\"><img src=\"Images/linkedin.png\" alt=\"LIINKEDIN\" width=\"35\" height=\"35\" style=\"margin:4px\"/></a>\n");
      out.write("                <a href=\"#\"><img src=\"Images/youtube.png\" alt=\"YOUTUBE\" width=\"35\" height=\"35\" style=\"margin:4px\"/></a>\n");
      out.write("                <a href=\"#\"><img src=\"Images/gmail.png\" alt=\"GMAIL\" width=\"35\" height=\"35\" style=\"margin:4px\"/></a>\n");
      out.write("        </div> \n");
      out.write("        <hr width=80%>\n");
      out.write("            <p style=\"text-align: center\">\n");
      out.write("                <b>LAPOHELP-</b>lapohelp,South-ex 1,near petrol pump,New Delhi  ,\n");
      out.write("            <b>MAP-</b>Main(773) 348 579 ,   <b>SUPPORT-</b>8937983818,7417597168</p>\n");
      out.write("       <hr width=80%>\n");
      out.write("      <p style=\"text-align: center;font-family: magneto\">Copyright @ 2010 Lapohelp Ltd.All Rights Reserved</p><p style=\"text-align: center;font-family: magneto\">Terms of Use // Privacy Policy</p>\n");
      out.write("       \n");
      out.write("   </fieldset>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("       </body>\n");
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
