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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objeto de tipo persona
        System.out.println("EJERCICIO SEMANA 3");
        System.out.println("ESTUDIANTE:");
        // Creacion del objeto y definición de sus parametros con variables
        Estudiante e = new Estudiante("Israel", "Ortiz", 33, 100.2);
        System.out.println(e);
        System.out.println();
        
        //Objeto de tipo docente
        System.out.println("DOCENTE:");
        // Creacion del objeto y definición de sus parametros con variables
        Docente d = new Docente("René", "Elizalde", 33, 1000.4);
        System.out.println(d);
        System.out.println();
        
        //Objeto de tipo policia
        System.out.println("POLICIA:");
        // Creacion del objeto y definición de sus parametros con variables
        Policia p = new Policia("Alex", "Mendoza", 33, "Cabo"); 
        System.out.println(p);
        
    }
    
}
