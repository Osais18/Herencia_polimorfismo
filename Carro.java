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
public class Carro extends Vehiculo {

    private String capacidad;

    public Carro() {
    }

    public Carro(String capacidad, String marca_3, String color_3) {
        super(marca_3, color_3);
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return super.toString()+", capacidad=" + capacidad + ".";//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desplazar() {
        super.desplazar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n y se desplaza en 4 ruedas\n");
    }

}
