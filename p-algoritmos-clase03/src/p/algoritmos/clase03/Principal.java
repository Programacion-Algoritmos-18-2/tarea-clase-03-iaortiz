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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación de objetos
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        double[] sueldos = new double[4];

        //Ingreso de datos personales del trajador:nombre y apellido
        System.out.println("Ingrese el nombre del trabajador");
        String nombre = scanner.nextLine();
        t.agregar_nombres(nombre);

        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);

        //Pregunta al usuario con que forma quiere sacar el sueldo mensual a aprtir de cada semaan
        System.out.println("Con que metodo quiere obtener el sueldo semanal?\nPrimer metodo, ingrese: 1\nSegundo metodo, ingrese: 2\n");
        int respuesta = scanner.nextInt();
        //Primera forma de obtener el sueldo semanal sumando cada sueldo
        if (respuesta == 1) {
            System.out.println("Ingrese el valor del sueldo semanal");
            double sueldo1 = scanner.nextDouble();
            double sueldo2 = scanner.nextDouble();
            double sueldo3 = scanner.nextDouble();
            double sueldo4 = scanner.nextDouble();
            t.agregar_sueldo(sueldo1, sueldo2, sueldo3, sueldo4, sueldo4);
        } else {
        //Segunda forma de obtener el sueldo semanal usando un ciclo for    
            if (respuesta == 2) {
                for (int i = 0; i < sueldos.length; i++) {
                    System.out.println("Ingrese el valor del sueldo semanal");
                    sueldos[i] = scanner.nextDouble();
                }
                t.agregar_sueldo(sueldos);
            }
        }
        //Presentación
        System.out.println("Ingrese el sueldo del trabajador");
        System.out.printf("Los datos del trabajador son: %s\n", t);

    }

}
