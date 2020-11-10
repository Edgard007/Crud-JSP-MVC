/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import com.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la Clase: DaoProducto
 * Fecha:13/09/2019
 * Copyright: ITCA-FEPADE
 * Version:1.0
 * @author Edgard Palacios
 */

public class DaoProducto extends Conexion
{
    public List<Producto> mostrarProducto() throws Exception
    {
        ResultSet rs;
        List<Producto> lst=new ArrayList();
       try 
        {
            this.conectar();
            String sql="select * from producto";
            PreparedStatement pst=this.getCon().prepareStatement(sql);
            Producto prod;
            rs=pst.executeQuery();
            
            while(rs.next())
            {
                Proveedor prov=new Proveedor();
                prov.setCodigoProveedor(rs.getInt("codigoProveedor"));
                prod=new Producto(rs.getInt("codigoProducto"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),rs.getDouble("precio"),
                    rs.getInt("anioFabricacion"),
                    rs.getInt("anioVencimiento"),prov);
                lst.add(prod);
                
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
    
    
    public void insertarProducto(Producto prod) throws Exception
    {
        try 
        {
            this.conectar();
            String sql="insert into producto values(?,?,?,?,?,?,?)";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            pre.setInt(1, prod.getCodigoProducto());
            pre.setString(2, prod.getNombre());
            pre.setString(3, prod.getCategoria());
            pre.setDouble(4, prod.getPrecio());
            pre.setInt(5, prod.getAnioFabricacion());
            pre.setInt(6, prod.getAnioVencimiento());
            pre.setInt(7, prod.getProveedor().getCodigoProveedor());
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
        
        
        public void modificarProducto(Producto prod) throws Exception
     {
        try 
        {
            this.conectar();
            String sql="update producto set nombre=?, categoria=?, precio=?, anioFabricacion=?, anioVencimiento=?, codigoProveedor=? where codigoProducto=?";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            pre.setString(1, prod.getNombre());
            pre.setString(2, prod.getCategoria());
            pre.setDouble(3, prod.getPrecio());
            pre.setInt(4, prod.getAnioFabricacion());
            pre.setInt(5, prod.getAnioVencimiento());
            pre.setInt(6, prod.getProveedor().getCodigoProveedor());
            pre.setInt(7, prod.getCodigoProducto());
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
    
        
         public void eliminarProducto(Producto prod) throws Exception
     {
        try 
        {
            this.conectar();
            String sql="delete from producto where codigoProducto=?";
            PreparedStatement pre=this.getCon().prepareStatement(sql);
            pre.setInt(1, prod.getCodigoProducto());
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
    
         
         
        public List<Proveedor> listarProveedor() throws Exception
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
    
}
