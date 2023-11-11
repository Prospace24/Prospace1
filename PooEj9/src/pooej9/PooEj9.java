/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Entidad.Matematica;
import Servicio.ServiMatematica;

/**
 *
 * @author crist
 */
public class PooEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiMatematica c1 = new ServiMatematica();
        
        Matematica m1 = c1.cargarNumeros();
        c1.devolverMayor(m1);
        c1.calcularPotencia(m1);
        c1.calcularRaiz(m1);
    }
    
}
