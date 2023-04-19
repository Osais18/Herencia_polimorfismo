/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.trabajo;

/**
 *
 * @author Osais
 */
public class JefeArea extends Empleado {
    private double pagoCargoAlto;

    public JefeArea() {
    }

    public JefeArea(double pagoCargoAlto, String nombre, String cedula, double salario, String edad) {
        super(nombre, cedula, salario, edad);
        this.pagoCargoAlto = pagoCargoAlto;
    }

    @Override
    public String toString() {
        return super.toString()+", Pago de cargo "+pagoCargoAlto; 
    }
    
    
}
