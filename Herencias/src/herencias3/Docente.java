/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author isral
 */
public class Docente extends Persona {
    //Creación de variable
    double sueldo;
    //Constructor usando las variables de tipo persona y adicionarle el parametro 
    //sueldo que es de tipo docente
    public Docente(String n, String a, int e, double sueldo) {
        super(n, a, e);
        setSueldo(sueldo);
    }
    //Metodo  obtener y agregar sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // Uso del toString para presentar y agregar sueldo
    @Override
    public String toString() {
        return String.format("%s - %.2f", super.toString(), getSueldo());

    }

}
