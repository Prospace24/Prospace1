/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiCircunferencia {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circunferencia crearCircun(){
        
        System.out.println("Ingrese el Radio de la Circunferencia");
        double rad = leer.nextDouble();
        
        return new Circunferencia(rad);
    }
    
    public void Area(Circunferencia rad){
        
        System.out.println("El Area De la Circunferencia es de: "+(3.14 * (rad.getRadio()*rad.getRadio())));
        
    }
    
    public void Perimetro(Circunferencia per){
        
        System.out.println("El Perimetro de la circunferencia es de: "+(2*3.14*per.getRadio()));
    }
     
}
