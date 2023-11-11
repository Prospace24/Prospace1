/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra3;

import Entidad.Raicez;
import Servicio.ServiRaicez;

/**
 *
 * @author crist
 */
public class PooExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiRaicez s1 = new ServiRaicez();
        Raicez r1 = s1.crearValores();
        s1.calcular(r1);
    }
    
}
