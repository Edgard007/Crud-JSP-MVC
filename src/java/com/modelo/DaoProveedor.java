
package com.modelo;

import com.controlador.*;
import com.conexion.Conexion;
import com.modelo.Proveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la Clase: DaoProveedor
 * Fecha:13/09/2019
 * Copyright: ITCA-FEPADE
 * Version:1.0
 * @author Edgard Palacios
 */
public class DaoProveedor extends Conexion
{
 
    public List<Proveedor> mostrarProveedor() throws Exception
    {
        ResultSet rs;
        List<Proveedor> lst=new ArrayList();
        
        try 
        {
            this.conectar();
            String sql="select * from proveedor";
            PreparedStatement pst=this.getCon().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next())
            {
                Proveedor prov=new Proveedor();
                prov.setCodigoProveedor(rs.getInt("codigoProveedor"));
                prov.setNombre(rs.getString("nombre"));
                prov.setDireccion(rs.getString("direccion"));
                prov.setTelefono(rs.getString("telefono"));
                lst.add(prov);
                
            }
            
        }
        catch (Exception e) 
        {
            throw e;
        }
        finally
        {
            this.desconectar();
        }
        return lst;
    }
    
    
    public void insertarProveedor(Proveedor pro) throws Exception
    {
        try 
        {
            this.conectar();
            String sql="insert into proveedor values(?,?,?,?)";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
           pre.setInt(1, pro.getCodigoProveedor());
            pre.setString(2,pro.getNombre());
            pre.setString(3,pro.getDireccion());
            pre.setString(4,pro.getTelefono());
            pre.executeUpdate();
        }
        catch (Exception e) 
        {
            throw e;
        }
        finally
        {
            this.desconectar();
        }
    }
    
    
    
    public void modificarProveedor(Proveedor pro) throws Exception
    {
        try 
        {
         this.conectar();
        String sql="update proveedor set nombre=?,direccion=?,telefono=? where codigoProveedor=?";
        PreparedStatement pre=this.getCon().prepareStatement(sql);
        pre.setString(1, pro.getNombre());
        pre.setString(2, pro.getDireccion());
        pre.setString(3, pro.getTelefono());
        pre.setInt(4, pro.getCodigoProveedor());
        pre.executeUpdate();
        
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            this.desconectar();
        }
    }
    
    
 public void eliminarProveedor(Proveedor pro) throws Exception
 {
     try 
     {
         this.conectar();
      String sql="delete from proveedor where codigoProveedor=?";
     PreparedStatement pre=this.getCon().prepareStatement(sql);
     pre.setInt(1,pro.getCodigoProveedor());
     pre.executeUpdate();
     } 
     catch (Exception e) 
     {
         throw e;
     }
     finally
     {
         this.desconectar();
     }

 }
}
