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
public class Vehiculo {
    private String marca;
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    public void desplazar(){
        System.out.println("\n Acelera el vehiculo \n");
    }

    @Override
    public String toString() {
        return "Vehiculo : " + "marca " + marca + ", color " + color + '.';
    }
    
    
    
}
