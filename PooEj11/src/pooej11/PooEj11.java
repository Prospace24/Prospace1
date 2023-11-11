/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class PooEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el Mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el Año");
        int anio = leer.nextInt();
        Date fecha = new Date(anio, mes-1, dia);
        Date fechaAtual = new Date();
        System.out.println("fecha:"+ fecha);
        System.out.println("fecha de hoy:"+fechaAtual);
        
    }
    
}
