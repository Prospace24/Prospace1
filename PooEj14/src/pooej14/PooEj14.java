/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Entidad.Movil;
import Servicio.ServiMovil;

/**
 *
 * @author crist
 */
public class PooEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServiMovil m1 = new ServiMovil();
        Movil p1 = m1.cargarCelular();
    }
    
}
