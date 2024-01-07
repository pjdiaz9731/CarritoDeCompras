/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritodecompras;

/**
 *
 * @author pjdiaz
 */
public class Comida {
    
    
    private String Nombre="";
    private double cantidad = 0;
     
    public Comida(String Nombre,double Cantidad){
    this.Nombre=Nombre;
    this.cantidad=Cantidad;
    
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
  
    
}
