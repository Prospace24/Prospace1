/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidad.CuentaBancaria;
import Servicio.Menu;



/**
 *
 * @author crist
 */
public class PooEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CuentaBancaria cuen = new CuentaBancaria();
        Menu c1 = new Menu();
        c1.Menu(cuen);
    }
    
}
