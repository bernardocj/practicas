package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pago_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Formulario de Pago</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"PagoController\" method=\"post\">\n");
      out.write("            <fieldset> \n");
      out.write("                <legend> Registro de Pago </legend>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"idConcepto\">ID Concepto: </label>\n");
      out.write("                    <input type=\"text\" name=\"idConcepto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pago.idConcepto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"ID Concepto\"  readonly=\"readonly\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"descripcion\">Descripcion: </label>\n");
      out.write("                    <input type=\"text\" name=\"descricpion\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pago.descripcion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Descripcion\" >\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"nombre\">Activo: </label>\n");
      out.write("                    <input type=\"text\" name=\"activo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pago.activo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Activo\" >\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"universidad\">Universidad: </label>\n");
      out.write("                    <input type=\"text\" name=\"universidad\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pago.universidad}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Universisad\" >\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("                    <input type=\"submit\" value=\"guardar\">\n");
      out.write("                </div>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
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
