<%-- 
    Document   : proveedor
    Created on : 09-13-2019, 09:09:48 AM
    Author     : Edgard Palacios
--%>

<%@page import="com.modelo.DaoProveedor"%>
<%@page import="java.util.List"%>
<%@page import="com.modelo.Proveedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proveedor </title>
        <script lang="JavaScript">
            function cargar(codigo,nombre,direccion,telefono)
            {
                document.frmProveedor.txtCodigoProveedor.value=codigo;
                document.frmProveedor.txtNombre.value=nombre;
                document.frmProveedor.txtDireccion.value=direccion;
                document.frmProveedor.txtTelefono.value=telefono;
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

    DaoProveedor daoP= new DaoProveedor();

    %>    
    
    
    <body>
    <center>
        <h1>CRUD Proveedor</h1>
        <table border="2">
            <form action="procesarProveedor" name="frmProveedor" method="POST">
                <tr>
                    <td>Codigo: </td> 
                    <td><input type="text" name="txtCodigoProveedor"> </td> 
                </tr>
                <tr>
                    <td>Nombre: </td> 
                    <td><input type="text" name="txtNombre"> </td> 
                </tr>
                <tr>
                    <td>Direccion </td> 
                    <td><input type="text" name="txtDireccion"> </td> 
                </tr>
                <tr>
                    <td>Telefono: </td> 
                    <td><input type="text" name="txtTelefono"> </td> 
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
        <table border="2">
            <thead>
                <tr>
                    <th>Codigo Proveedor</th>
                    <th>Nombre</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Seleccionar</th>
                </tr>
            </thead> 
            <tbody>
                <%
                    List<Proveedor> lst=daoP.mostrarProveedor();
                    for(Proveedor prov:lst)
                    {
                %>    
                <tr>
                    <td> <%= prov.getCodigoProveedor()  %> </td>
                    <td> <%= prov.getNombre() %> </td>
                    <td> <%= prov.getDireccion() %> </td>
                    <td> <%=  prov.getTelefono() %> </td>
                    <td>
                        <a href="javascript:cargar(<%= prov.getCodigoProveedor() %>,'<%= prov.getNombre() %>','<%= prov.getDireccion() %>','<%= prov.getTelefono() %>')"> Seleecionar </a>
                    </td>
                </tr>
                
                <%
                    }
                %>
            </tbody>
        </table>
    </center>
    </body>
</html>
