/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import Entidad.Ri;
import Servicio.ServiRi;

/**
 *
 * @author crist
 */
public class PooExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiRi s1 = new ServiRi();
        Ri r1 = s1.crear();
        s1.mostrar(r1);
    }
    
}
