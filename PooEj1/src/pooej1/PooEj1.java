/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Libro;

/**
 *
 * @author crist
 */
public class PooEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido al Registro");
        
        Libro L1 = new Libro();
        
        L1.crearLibro();
        L1.MostrarLibro();

    }
    
}
