
package com.modelo;

/**
 * Nombre de la Clase: Proveedor
 * Fecha:13/09/2019
 * Copyright: ITCA-FEPADE
 * Version:1.0
 * @author Edgard Palacios
 */

public class Proveedor 
{
 private int codigoProveedor;
 private String nombre;
 private String direccion;
 private String telefono;

    public Proveedor() {
    }

    public Proveedor(int codigoProveedor, String nombre, String direccion, String telefono) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
         
}
