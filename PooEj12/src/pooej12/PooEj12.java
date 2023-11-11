/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Entidad.Persona;
import Servicio.ServiPersona;

/**
 *
 * @author crist
 */
public class PooEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiPersona ps = new ServiPersona();
        Persona p1 = ps.crearPersona();
        ps.calcularEdad(p1);
       
      
    }
    
}
