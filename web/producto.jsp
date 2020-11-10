<%-- 
    Document   : producto
    Created on : 09-20-2019, 10:53:34 AM
    Author     : Administrador
--%>

<%@page import="com.modelo.Producto"%>
<%@page import="java.util.List"%>
<%@page import="com.modelo.Proveedor"%>
<%@page import="com.modelo.DaoProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto</title>
        <script lang="JavaScript">
            function cargar(codigo,nombre,categoria,precio,anioFa,anioVen,proveedor)
            {
                document.frmProducto.txtCodigoProducto.value=codigo;
                document.frmProducto.txtNombre.value=nombre;
                document.frmProducto.txtCategoria.value=categoria;
                document.frmProducto.txtPrecio.value=precio;
                document.frmProducto.txtFabricacion.value=anioFa;
                document.frmProducto.txtVencimiento.value=anioVen;
                document.frmProducto.selectProveedor.value=proveedor;
            }
        </script>
        <%
            if(request.getAttribute("msj")!=null)
            {
         %>
         <script type="text/javascript">
             alert('<%= request.getAttribute("msj")%>');
         </script>
         <%
             }
          %>
    </head>
            <%

            DaoProducto dao= new DaoProducto();

            %>    
    <body>
        <center>
        <h1>CRUD Producto</h1>
        <table border="2">
            <form action="procesarProducto" name="frmProducto" method="POST">
                <tr>
                    <td>Codigo: </td> 
                    <td><input type="text" name="txtCodigoProducto"> </td> 
                </tr>
                <tr>
                    <td>Nombre: </td> 
                    <td><input type="text" name="txtNombre"> </td> 
                </tr>
                <tr>
                    <td>Categoria </td> 
                    <td><input type="text" name="txtCategoria"> </td> 
                </tr>
                <tr>
                    <td>Precio: </td> 
                    <td><input type="text" name="txtPrecio"> </td> 
                </tr>
                <tr>
                    <td>Año de Fabricacion: </td> 
                    <td><input type="text" name="txtFabricacion"> </td> 
                </tr>
                <tr>
                    <td>Año de Vencimiento: </td> 
                    <td><input type="text" name="txtVencimiento"> </td> 
                </tr>
                <tr>
                    <td>Proveedor: </td> 
                            <td><select name="selectProveedor">
                                    <%
                                       List<Proveedor> lstPv=dao.listarProveedor();
                                       for(Proveedor p:lstPv)
                                       {
                                          
                                    %>       
                                         
                                    <option value="<%= p.getCodigoProveedor() %>" > <%= p.getNombre() %> </option>
                                    
                                    <%       
                                           
                                       }

                                    %>    
                        </select>
                            </td> 
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="btnInsertar" value="Insertar">
                        <input type="submit" name="btnModificar" value="Modificar" onclick="return confirm('Desea Modificar la Informaciòn?')">
                        <input type="submit" name="btnEliminar" value="Eliminar" onclick="return confirm('Desea Eliminar la Informaciòn?')">
                         <input type="reset" name="btnLimpiar" value="Limpiar">
                    </td>
                </tr>
            </form>
        </table>
                        <br>
                        <br>
                        <br>
                        <hr>
                        <table border="2">
                            <thead>
                                <tr>
                                    <th>Codigo Producto</th>
                                    <th>Nombre</th>
                                    <th>Categoria</th>
                                    <th>Precio</th>
                                    <th>Año de Fabricacion</th>
                                    <th>Año de Vencimiento</th>
                                    <th>Proveedor</th>
                                    <th>Seleccionar</th>   
                                </tr>
                            </thead>
                       
                        <tbody>
                            <%
                                List<Producto> lst=dao.mostrarProducto();
                                for(Producto prod:lst)
                                {
                             %>
                             
                             <tr>
                                 <td> <%= prod.getCodigoProducto() %>  </td>
                                 <td> <%= prod.getNombre() %>  </td>
                                 <td> <%= prod.getCategoria() %>  </td>
                                 <td> <%= prod.getPrecio()%>  </td>
                                 <td> <%= prod.getAnioFabricacion()%>  </td>
                                 <td> <%= prod.getAnioVencimiento()%>  </td>
                                 <td> <%= prod.getProveedor().getCodigoProveedor() %>  </td>
                             
                                 <td> <a href="javascript:cargar(<%= prod.getCodigoProducto() %>,
                                         '<%= prod.getNombre()%>','<%= prod.getCategoria() %>',
                                         ' <%= prod.getPrecio()%>','<%= prod.getAnioFabricacion()%>',
                                         '<%= prod.getAnioVencimiento()%>',
                                         '<%= prod.getProveedor().getCodigoProveedor() %>')">Seleccionar</a></td>
                             </tr>
                             <%
                                }
                            %>
                        </tbody>
        </table>
        </center>             
    </body>
</html>
