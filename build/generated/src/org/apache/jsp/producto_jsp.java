package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.modelo.Producto;
import java.util.List;
import com.modelo.Proveedor;
import com.modelo.DaoProducto;

public final class producto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Producto</title>\n");
      out.write("        <script lang=\"JavaScript\">\n");
      out.write("            function cargar(codigo,nombre,categoria,precio,anioFa,anioVen,proveedor)\n");
      out.write("            {\n");
      out.write("                document.frmProducto.txtCodigoProducto.value=codigo;\n");
      out.write("                document.frmProducto.txtNombre.value=nombre;\n");
      out.write("                document.frmProducto.txtCategoria.value=categoria;\n");
      out.write("                document.frmProducto.txtPrecio.value=precio;\n");
      out.write("                document.frmProducto.txtFabricacion.value=anioFa;\n");
      out.write("                document.frmProducto.txtVencimiento.value=anioVen;\n");
      out.write("                document.frmProducto.selectProveedor.value=proveedor;\n");
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
      out.write("    </head>\n");
      out.write("            ");


            DaoProducto dao= new DaoProducto();

            
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        <h1>CRUD Producto</h1>\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <form action=\"procesarProducto\" name=\"frmProducto\" method=\"POST\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Codigo: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtCodigoProducto\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nombre: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtNombre\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Categoria </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtCategoria\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Precio: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtPrecio\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Año de Fabricacion: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtFabricacion\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Año de Vencimiento: </td> \n");
      out.write("                    <td><input type=\"text\" name=\"txtVencimiento\"> </td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Proveedor: </td> \n");
      out.write("                            <td><select name=\"selectProveedor\">\n");
      out.write("                                    ");

                                       List<Proveedor> lstPv=dao.listarProveedor();
                                       for(Proveedor p:lstPv)
                                       {
                                          
                                    
      out.write("       \n");
      out.write("                                         \n");
      out.write("                                    <option value=\"");
      out.print( p.getCodigoProveedor() );
      out.write("\" > ");
      out.print( p.getNombre() );
      out.write(" </option>\n");
      out.write("                                    \n");
      out.write("                                    ");
       
                                           
                                       }

                                    
      out.write("    \n");
      out.write("                        </select>\n");
      out.write("                            </td> \n");
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
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <hr>\n");
      out.write("                        <table border=\"2\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Codigo Producto</th>\n");
      out.write("                                    <th>Nombre</th>\n");
      out.write("                                    <th>Categoria</th>\n");
      out.write("                                    <th>Precio</th>\n");
      out.write("                                    <th>Año de Fabricacion</th>\n");
      out.write("                                    <th>Año de Vencimiento</th>\n");
      out.write("                                    <th>Proveedor</th>\n");
      out.write("                                    <th>Seleccionar</th>   \n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                       \n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                List<Producto> lst=dao.mostrarProducto();
                                for(Producto prod:lst)
                                {
                             
      out.write("\n");
      out.write("                             \n");
      out.write("                             <tr>\n");
      out.write("                                 <td> ");
      out.print( prod.getCodigoProducto() );
      out.write("  </td>\n");
      out.write("                                 <td> ");
      out.print( prod.getNombre() );
      out.write("  </td>\n");
      out.write("                                 <td> ");
      out.print( prod.getCategoria() );
      out.write("  </td>\n");
      out.write("                                 <td> ");
      out.print( prod.getPrecio());
      out.write("  </td>\n");
      out.write("                                 <td> ");
      out.print( prod.getAnioFabricacion());
      out.write("  </td>\n");
      out.write("                                 <td> ");
      out.print( prod.getAnioVencimiento());
      out.write("  </td>\n");
      out.write("                                 <td> ");
      out.print( prod.getProveedor().getCodigoProveedor() );
      out.write("  </td>\n");
      out.write("                             \n");
      out.write("                                 <td> <a href=\"javascript:cargar(");
      out.print( prod.getCodigoProducto() );
      out.write(",\n");
      out.write("                                         '");
      out.print( prod.getNombre());
      out.write("','");
      out.print( prod.getCategoria() );
      out.write("',\n");
      out.write("                                         ' ");
      out.print( prod.getPrecio());
      out.write("','");
      out.print( prod.getAnioFabricacion());
      out.write("',\n");
      out.write("                                         '");
      out.print( prod.getAnioVencimiento());
      out.write("',\n");
      out.write("                                         '");
      out.print( prod.getProveedor().getCodigoProveedor() );
      out.write("')\">Seleccionar</a></td>\n");
      out.write("                             </tr>\n");
      out.write("                             ");

                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("        </table>\n");
      out.write("        </center>             \n");
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
