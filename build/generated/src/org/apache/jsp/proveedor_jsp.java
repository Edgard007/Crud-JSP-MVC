package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.modelo.DaoProveedor;
import java.util.List;
import com.modelo.Proveedor;

public final class proveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Proveedor </title>\n");
      out.write("        <script lang=\"JavaScript\">\n");
      out.write("            function cargar(codigo,nombre,direccion,telefono)\n");
      out.write("            {\n");
      out.write("                document.frmProveedor.txtCodigoProveedor.value=codigo;\n");
      out.write("                document.frmProveedor.txtNombre.value=nombre;\n");
      out.write("                document.frmProveedor.txtDireccion.value=direccion;\n");
      out.write("                document.frmProveedor.txtTelefono.value=telefono;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");

            if(request.getAttribute("msj")!=null)
            {
         
      out.write("\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("             alert('");
      out.print( request.getAttribute("msj"));
      out.write("');\n");
      out.write("         </script>\n");
      out.write("         ");

             }
          
      out.write("\n");
      out.write("             \n");
      out.write("    </head>\n");
      out.write("    ");


    DaoProveedor daoP= new DaoProveedor();

    
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>CRUD Proveedor</h1>\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <form action=\"procesarProveedor\" name=\"frmProveedor\" method=\"POST\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Codigo: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtCodigoProveedor\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nombre: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtNombre\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Direccion </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtDireccion\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Telefono: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtTelefono\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" name=\"btnInsertar\" value=\"Insertar\">\n");
      out.write("                        <input type=\"submit\" name=\"btnModificar\" value=\"Modificar\" onclick=\"return confirm('Desea Modificar la Informaciòn?')\">\n");
      out.write("                        <input type=\"submit\" name=\"btnEliminar\" value=\"Eliminar\" onclick=\"return confirm('Desea Eliminar la Informaciòn?')\">\n");
      out.write("                         <input type=\"reset\" name=\"btnLimpiar\" value=\"Limpiar\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Codigo Proveedor</th>\n");
      out.write("                    <th>Nombre</th>\n");
      out.write("                    <th>Direccion</th>\n");
      out.write("                    <th>Telefono</th>\n");
      out.write("                    <th>Seleccionar</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead> \n");
      out.write("            <tbody>\n");
      out.write("                ");

                    List<Proveedor> lst=daoP.mostrarProveedor();
                    for(Proveedor prov:lst)
                    {
                
      out.write("    \n");
      out.write("                <tr>\n");
      out.write("                    <td> ");
      out.print( prov.getCodigoProveedor()  );
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( prov.getNombre() );
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print( prov.getDireccion() );
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print(  prov.getTelefono() );
      out.write(" </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"javascript:cargar(");
      out.print( prov.getCodigoProveedor() );
      out.write(',');
      out.write('\'');
      out.print( prov.getNombre() );
      out.write("','");
      out.print( prov.getDireccion() );
      out.write("','");
      out.print( prov.getTelefono() );
      out.write("')\"> Seleecionar </a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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
