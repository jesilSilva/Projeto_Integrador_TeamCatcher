package org.apache.jsp;

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
      out.write("        <link  rel=\"stylesheet\" type=\"text/css\" href=\"css/formularioCadastro.css\"/>\n");
      out.write("        <link  rel=\"stylesheet\" type=\"text/css\" href=\"css/menuu.css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("            <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("                <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"#\">Categorias</a>\n");
      out.write("               \n");
      out.write("                <a href=\"#\">Meus eventos</a>\n");
      out.write("                <a href=\"#\">Conta</a>\n");
      out.write("                <a href=\"#\">Configuração</a>\n");
      out.write("                <br><br><br><br><br><br>\n");
      out.write("                 <a href=\"#\">Sair</a>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <div id=\"main\">\n");
      out.write("\n");
      out.write("                <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776; </span>\n");
      out.write("\n");
      out.write("                <script src=\"js/menu.js\" type=\"text/javascript\"></script></script>\n");
      out.write("                <form method=\"POST\" name=\"form \" action=\"cadastra-exame\" >\n");
      out.write("\n");
      out.write("                    <br><br><br>\n");
      out.write("                    <fieldset style=\"width: 60%; margin: 0px auto;\">\n");
      out.write("\n");
      out.write("                        <legend><h2 ><font color=\"blue\" > Cadastro de Evento </font></h2></legend>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <br><br>\n");
      out.write("                        <label for=\"nome\">Nome:</label>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" name=\"nome\" size=\"20\" maxlenght=\"90\" placeholder=\"nome\" alt=\"Informe o tipo do exame\" title=\"Informe o tipo do exame\" required name=nome/>\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"horaInicio\">Hora Inicio:</label><br>\n");
      out.write("                        <input type=\"time\" name=\"horaInicio\" size=\"30\"  />\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <label for=\"horaFim\">Hora Fim:</label><br>\n");
      out.write("                        <input type=\"time\" name=\"horaFim\" size=\"30\" required name=horaFim />\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"dataInicio\">Data de inicio:</label><br>\n");
      out.write("                        <input type=\"date\" name=\"dataInicio\" size=\"30\" required name=dataInicio />\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"dataFim\">Data Fim:</label><br>\n");
      out.write("                        <input type=\"date\" name=\"dataFim\" size=\"30\" required name=dataFim />\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"custo\">Custo R$:</label><br>\n");
      out.write("                        <input type=\"text\" name=\"custo\" size=\"20\" required name=custo />\n");
      out.write("                        <br>\n");
      out.write("                        <label for=\"capacidade\">Capacidade:</label><br>\n");
      out.write("                        <input type=\"number\" name=\"capacidade\" size=\"30\" required name=capacidade />\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"Cadastrar\" onclick=\"funcao1()\"  />\n");
      out.write("\n");
      out.write("                        <input type=\"reset\" value =\"Limpar\"/>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("            \n");
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
