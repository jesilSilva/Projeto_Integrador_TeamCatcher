package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarEvento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastrar evento</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"form\">\n");
      out.write("        <form method=\"POST\" name=\"form \" action=\"cadastra-exame\">\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                <fieldset style=\"width: 70%;\">\n");
      out.write("                    <legend><h2><font color=\"#38B0DE\"> Cadastro de Exame </font></h2></legend>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <label for=\"nome\">Nome:</label>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"text\" name=\"nome\" size=\"20\" maxlenght=\"90\" placeholder=\"nome\" alt=\"Informe o tipo do exame\" title=\"Informe o tipo do exame\" required name=nome/>\n");
      out.write("                    <br>\n");
      out.write("                    <label for=\"horaInicio\">Hora Inicio:</label><br>\n");
      out.write("                    <input type=\"time\" name=\"horaInicio\" size=\"30\" required name=horaInicio />\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <label for=\"horaFim\">Hora Fim:</label><br>\n");
      out.write("                    <input type=\"time\" name=\"horaFim\" size=\"30\" required name=horaFim />\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label for=\"status\">Status:</label><br>\n");
      out.write("\n");
      out.write("                    <select name=\"status\">\n");
      out.write("                        <option value=\"Feito\">Feito</option> \n");
      out.write("                        <option value=\"Não feito\">Não feito</option> \n");
      out.write("                        <option value=\"Vencido\">Vencido</option> \n");
      out.write("                    </select >\n");
      out.write("                    <br>\n");
      out.write("                   \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Cadastrar\" onclick=\"funcao1()\"/>\n");
      out.write("                    <input type=\"reset\" value =\"Limpar\"/>\n");
      out.write("                   \n");
      out.write("                    <a href=\"Home.jsp\"> <img src=\"img/cancelar.png\" width=\"32\" height=\"32\" alt=\"Clique aqui para cancelar o cadastro\" title=\"Clique aqui para cancelar o cadastro\" align=\"right\"/></a>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("           </div>\n");
      out.write("    </body>\n");
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
