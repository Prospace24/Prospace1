/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidad.Circunferencia;
import Servicio.ServiCircunferencia;

/**
 *
 * @author crist
 */
public class PooEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiCircunferencia c1 = new ServiCircunferencia();
        
        Circunferencia cir = c1.crearCircun();
        c1.Area(cir);
        c1.Perimetro(cir);
        
    }
    
}
