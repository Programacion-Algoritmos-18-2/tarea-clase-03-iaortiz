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
public class Policia extends Persona {
    //Creación de variable unica de policia
    String rango;
    //Constructor usando las variables de tipo persona y adicionarle el parametro 
    //rango que es de tipo policia
    public Policia(String n, String a, int e, String rango) {
        super(n, a, e);
        setRango(rango);
    }
    //Metodos de agregar y obtener rango
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    // Uso del toString para presentar y agregar rango
    @Override
    public String toString() {
        return String.format("%s - Rango: %s", super.toString(), getRango());

    }

}
