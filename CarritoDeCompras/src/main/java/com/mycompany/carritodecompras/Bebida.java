/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carritodecompras;

/**
 *
 * @author pjdiaz
 */
public class Bebida {
    
    private String Nombre = "";
    private String Marca="";
    private double Capacidad=0;
    

//Crear constructor
    public Bebida(String Nombre, String Marca, double Capacidad){
    this.Nombre=Nombre;
    this.Marca=Marca;
    this.Capacidad=Capacidad;
    
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double Capacidad) {
        this.Capacidad = Capacidad;
    }
    
    
    
}
