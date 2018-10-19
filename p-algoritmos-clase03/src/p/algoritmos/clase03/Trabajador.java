/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.algoritmos.clase03;

/**
 *
 * @author reroes
 */
public class Trabajador {
    //Declaración de variables
    private String nombres;
    private double sueldo_mensual;
    private String apellidos;

    //Metodos agregar de cada una de las variables

    public void agregar_nombres(String n) {
        nombres = n;
    }

    public void agregar_nombres(String n1, String n2) {
        nombres = String.format("%s-%s", n1, n2);
    }   
    
    //Primer mètodo de agregar sueldo, estableciendo solo un unico ingreso de datos
    public void agregar_sueldo(double sueldo) {
        sueldo_mensual = sueldo;
    }

    //Seugndo metodo para agregar el sueldo, con la suma de un sueldo semanal
    public void agregar_sueldo(double s1, double s2, double s3, double s4, double s5) {
        sueldo_mensual = s1 + s2 + s3 + s4 + s5;
    }
    
    //Tercer metodo para agregar el sueldo, con un ciclo for para agregar cuatro sueldos semanales
    public void agregar_sueldo(double [] sueldos) {
        for (int i = 0; i < sueldos.length; i++) {
            sueldo_mensual += sueldos[i];
        }

    }

    public void agregar_apellidos(String n) {
        apellidos = n;
    }

    //Metodos obtener de cada una de las variables
    public String obtener_nombres() {
        return nombres;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public double obtener_sueldo_mensual() {
        return sueldo_mensual;
    }

    //Uso del toString para presentar
    @Override
    public String toString() {
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }


}
