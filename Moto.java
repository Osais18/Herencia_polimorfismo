/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.Herencia_Polimorfismo_vehiculos;

/**
 *
 * @author Osais
 */
public class Moto extends Vehiculo {
    
    private String capacidad;

    public Moto() {
    }

    public Moto(String capacidad, String marca, String color) {
        super(marca, color);
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+", Capacidad = " + capacidad+'.'; //To change body of generated methods, choose Tools | Templates.
    }

   
        
    

    @Override
    public void desplazar() {
        super.desplazar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" y se desplaza en dos ruedas ");
    }

  
    
}
