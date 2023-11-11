/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecej3;

import Entidad.Alumno;
import Servicio.ServiAlumno;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ColecEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiAlumno s1 = new ServiAlumno();
        ArrayList<Alumno> p1 = s1.crearAlum();
        s1.mostrarNotaFinal(p1);
        
        
        
        
      
              
    }
    
}
