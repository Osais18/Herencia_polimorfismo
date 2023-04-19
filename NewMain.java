/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udes.Herencia_Polimorfismo_vehiculos;

import java.util.Scanner;

/**
 *
 * @author Osais
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cant1, cant2, cant3;
        System.out.println("\n se crearan 3 clases, vehiculo, moto y carro, digite la cantidad total de  veces que se instanciara las clase ,recuerde que esta cantidad sera para vehiculo, carro y moto:   \n");
        cant1 = leer.nextInt();
//        System.out.println("\nIngrese la cantidad a crear de cubos de diamante\n");
//        cant2 = leer.nextInt();
//        System.out.println("\nIngrese la cantidad a crear de cubos de carbon\n");
//        cant3 = leer.nextInt();

        Vehiculo[] cantidadTotal = new Vehiculo[cant1];
        Vehiculo[] array_Cubo = new Vehiculo[cant1];
        Moto[] array_diamante = new Moto[cant1];
        Carro[] array_carbon = new Carro[cant1];
        // poliforfismo, la forma en la que se comporta un objecto apartir de sus hijas 
        Vehiculo objDiamante = new Moto();

        String marca, marca_2, marca_3;
        String color, color_2, color_3;

        for (int i = 0; i <= array_Cubo.length - 1; i++) {
            System.out.println("\n_________Ingrese del vehiculo : _________\n");
            System.out.println("\nColor del vehiculo\n");
            color = leer.next();
            System.out.println("\nMarca\n");
            marca = leer.next();
            array_Cubo[i] = new Vehiculo(marca, color);

            System.out.println("\n_________Ingrese de la moto : _________\n");
            System.out.println("\nColor de la moto\n");
            color_2 = leer.next();
            System.out.println("\nMarca\n");
            marca_2 = leer.next();

            array_diamante[i] = new Moto("Maximo 2 personas", marca_2, color_2);

            System.out.println("\n_________Ingrese del carro: _________\n");
            System.out.println("\nColor del carro\n");
            color_3 = leer.next();
            System.out.println("\nMarca\n");
            marca_3 = leer.next();

            array_carbon[i] = new Carro("Maximo 5 personas", marca_3, color_3);

        }
        for (int i = 0; i <= array_Cubo.length - 1; i++) {
            System.out.println("\n_______________________\n");
            System.out.println(array_Cubo[i].toString());
            array_Cubo[i].desplazar();
            System.out.println("\n_______________________\n");
            System.out.println(array_diamante[i].toString());
            array_diamante[i].desplazar();
            System.out.println("\n_______________________\n");
            System.out.println(array_carbon[i].toString());
            array_carbon[i].desplazar();
        }

    }

}
