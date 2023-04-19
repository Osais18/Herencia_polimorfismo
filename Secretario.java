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
public class Secretario extends Empleado {

    public Secretario() {
    }

    public Secretario( String nombre, String cedula, double salario, String edad) {
        super(nombre, cedula, salario, edad);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalario() {
        return super.getSalario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCedula(String cedula) {
        super.setCedula(cedula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCedula() {
        return super.getCedula(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
