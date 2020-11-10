
package com.controlador;

import com.modelo.DaoProducto;
import com.modelo.Producto;
import com.modelo.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Nombre del Servlt: ProcesarProveedor
 * Fecha: 20-09-2019
 * Version: 1.0
 * Copyrigth: ITCA-FEPADE
 * @author Edgardo
 */

public class ProcesarProducto extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd=null;
        Producto prod=new Producto();
        Proveedor prov=new Proveedor();
        DaoProducto dao=new DaoProducto();
        String msj=null;
        try 
        {
            prod.setCodigoProducto(Integer.parseInt(request.getParameter("txtCodigoProducto")));
            prod.setNombre(request.getParameter("txtNombre"));
            prod.setCategoria(request.getParameter("txtCategoria"));
            prod.setPrecio(Double.parseDouble(request.getParameter("txtPrecio")));
            prod.setAnioFabricacion(Integer.parseInt(request.getParameter("txtFabricacion")));
            prod.setAnioVencimiento(Integer.parseInt(request.getParameter("txtVencimiento")));
            prov.setCodigoProveedor(Integer.parseInt(request.getParameter("selectProveedor")));
            prod.setProveedor(prov);
            if(request.getParameter("btnInsertar")!=null)
            {
                dao.insertarProducto(prod);
                msj="Informacion Insertada Correctamente";
            }
            else if(request.getParameter("btnModificar")!=null)
            {
                dao.modificarProducto(prod);
                msj="Informacion Modificada Correctamente";
            }
            else if(request.getParameter("btnEliminar")!=null)
            {
                dao.eliminarProducto(prod);
                msj="Informacion Eliminada Correctamente";
            }
            
            
            rd=request.getRequestDispatcher("producto.jsp");
            request.setAttribute("msj", msj);
        } 
        catch (Exception e) 
        {
            request.setAttribute("Error",e.toString());
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
