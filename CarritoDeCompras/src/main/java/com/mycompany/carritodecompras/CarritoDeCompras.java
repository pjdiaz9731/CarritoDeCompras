/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.carritodecompras;

/**
 *
 * @author pjdiaz
 */
public class CarritoDeCompras {

    public static void main(String[] args) {
        Bebida bebida1 = new Bebida("Gaseosa", "Pepsi", 1.5);
        Bebida bebida2 = new Bebida ("Natural","Tropical",250);

        Comida comida1 = new Comida("Pasta", 350);
         Comida comida2 = new Comida("Corte de Carne", 350);
          Comida comida3 = new Comida("Pizza", 10);
          
    

        System.out.println(bebida1.getNombre() + " de la marca " + bebida1.getMarca() + " de " + bebida1.getCapacidad() + " Litros ");
         System.out.println(bebida2.getNombre() + " de la marca " + bebida2.getMarca() + " de " + bebida2.getCapacidad() + " Mililitros ");
        System.out.println(comida1.getNombre() + comida1.getCantidad()+ "  gramos ");
        System.out.println(comida2.getNombre() +  comida2.getCantidad()+ "  gramos ");
        System.out.println(comida3.getNombre() +  comida3.getCantidad()+ "  Slides ");
    }
}
