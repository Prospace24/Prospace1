/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ri;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiRi {
    
    private Scanner leer;

    public ServiRi() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Ri crear(){
        Ri r1 = new Ri();
        String ver = "TRWAGMYFPDXBNJZSQVHLCKE";
        char[] letras = ver.toCharArray();
        System.out.println("Ingrese su DNI");
        r1.setDni(leer.nextLong());
        int indice = (int) r1.getDni()%23;
        System.out.println(indice);
        r1.setLetra(letras[indice]);
        
        return r1;
    }
    
    public void mostrar(Ri n1){
        System.out.println("Nif = "+" "+n1.getDni()+"-"+n1.getLetra());
    }
    
}
