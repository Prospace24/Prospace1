/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.Cafetera;
import Servicio.Menu;


/**
 *
 * @author crist
 */
public class PooEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     
        Cafetera cafe = new Cafetera(); 
        Menu ca = new Menu();
        ca.Menu(cafe);
    }
    
}
