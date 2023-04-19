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
public class Vendedor extends Empleado{
    private double ventas;
    private double comisiones;

    public Vendedor(){
    }

    public Vendedor(double ventas, double comisiones, String nombre, String cedula, double salario, String edad) {
        super(nombre, cedula, salario, edad);
        this.ventas = ventas;
        this.comisiones = comisiones;
    }

    @Override
    public String toString() {
        return super.toString()+" Ventas "+ventas+" Comiciones "+comisiones+"."; //To change body of generated methods, choose Tools | Templates.
        
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
    public String getCedula() {
        return super.getCedula(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
