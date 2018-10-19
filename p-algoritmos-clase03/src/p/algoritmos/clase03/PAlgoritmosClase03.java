/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.algoritmos.clase03;

import java.util.Scanner;

/**
 *
 * @author isral
 */
public class PAlgoritmosClase03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        double[] sueldos = new double[4];

        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();

        if (numero_nombres == 1) {
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        } else {
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);

        }

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el valor del sueldo semanal");
            sueldos[i] = scanner.nextDouble();
        }
        t.agregar_sueldo(sueldos);
        /* System.out.println("Ingrese el valor del sueldo semanal");
        double sueldo1 = scanner.nextDouble();
        double sueldo2 = scanner.nextDouble();
        double sueldo3 = scanner.nextDouble();
        double sueldo4 = scanner.nextDouble();
        t.agregar_sueldo(sueldo1, sueldo2, sueldo3, sueldo4, sueldo4);*/
        System.out.println("Ingrese el sueldo del trabajador");
        System.out.printf("Los datos del trabajador son: %s\n", t);

    }

}
