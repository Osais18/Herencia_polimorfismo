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
public class Empleado {
    
    
    private String nombre;
    private String cedula;
    private double salario;
    private String edad;

    public Empleado() {
    }

    public Empleado( String nombre, String cedula, double salario, String edad) {
        
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado : " + " Nombre " + nombre + ", cedula " + cedula + ", salario base " + salario + ", edad " + edad + '.';
    }
    
    
}
