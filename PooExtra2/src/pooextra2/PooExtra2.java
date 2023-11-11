/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import Entidad.Puntos;
import Servicio.ServiPuntos;

/**
 *
 * @author crist
 */
public class PooExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiPuntos c1 = new ServiPuntos();
        Puntos p1 = c1.crearPuntos();
        c1.calcularDistancia(p1);
    }
    
}
