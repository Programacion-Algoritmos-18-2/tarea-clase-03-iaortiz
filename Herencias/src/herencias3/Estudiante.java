/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    // Creación de variable unica para estudiante
    private double matricula;

    //Constructor usando las variables de tipo persona y adicionarle el parametro 
    //matricula que es de tipo estudiante
    public Estudiante(String n, String a, int e, double mat) {
        super(n, a, e);
        setMatricula(mat);
    }

    // Metodos agregar y obtener matricula
    public void setMatricula(double mat) {
        matricula = mat;
    }

    public double getMatricula() {
        return matricula;
    }
    // Uso del toString para presentar y agregar matricula
    @Override
    public String toString() {

        return String.format("%s - %.2f", super.toString(), getMatricula());
    }
}
