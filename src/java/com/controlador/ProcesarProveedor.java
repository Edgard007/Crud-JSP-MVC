
package com.controlador;

import com.modelo.DaoProveedor;
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
public class ProcesarProveedor extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd=null;
        Proveedor prov=new Proveedor();
        DaoProveedor dao=new DaoProveedor();
        String msj=null;
        try
        {
            prov.setCodigoProveedor(Integer.parseInt(request.getParameter("txtCodigoProveedor")));
            prov.setNombre(request.getParameter("txtNombre"));
            prov.setDireccion(request.getParameter("txtDireccion"));
            prov.setTelefono(request.getParameter("txtTelefono"));
            
                if(request.getParameter("btnInsertar")!=null)
                {
                    dao.insertarProveedor(prov);
                    msj="Datos Insertador Correctamente";
                }
                else if(request.getParameter("btnModificar")!=null)
                {
                    dao.modificarProveedor(prov);
                    msj="Datos Modificados Correctamente";
                }
                else if(request.getParameter("btnEliminar")!=null)
                {
                    dao.eliminarProveedor(prov);
                    msj="Datos Eliminados Correctamente";
                }
                
                rd=request.getRequestDispatcher("proveedor.jsp");
                request.setAttribute("msj", msj);

        } 
        catch (Exception e) 
        {
            request.setAttribute("Error", e.toString());
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
