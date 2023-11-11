/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiMeses {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mesSecreto(){
        Meses m1 = new Meses();
        String ms = m1.getMeses()[9];
        System.out.println("Adivine el mes Secreto");
        String m = leer.next();
        while (!m.equals(ms)) {
            System.out.println("Mes Incorrecto, no es el mes Secreto");
            System.out.println("Adivine el mes Secreto");
            m = leer.next();
            
        }
        System.out.println("Mes secreto encontrado "+ms);
    }
    
}
