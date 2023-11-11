/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiRectangulo {
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la Base del Rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la Altura del Rectangulo");
        int altu = leer.nextInt();
        return new Rectangulo(base,altu );
    }
    
    public void superficie(Rectangulo r1){
        System.out.println("La Superficie del Rectangulo es de: "+(r1.getBase()*r1.getAltura()));
    }
    
    public void perimetro(Rectangulo r1){
        System.out.println("El Perimetro del Rectangulo es de: "+((r1.getBase()+r1.getAltura())*2));
    }
    
    public void MostrarRectangulo(Rectangulo r1){
        String[][] rec = new String[r1.getBase()][r1.getAltura()];
        
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                if (i== 0) {
                    rec[i][j]="*";
                } else if (j==0&i>0) {
                    rec[i][j]="*";
                }else if (i== (r1.getBase()-1)) {
                    rec[i][j]="*";
                }else if (j == (r1.getAltura()-1)) {
                    rec[i][j]="*";
                }else{
                     rec[i][j]=" ";
                }
                    
                }
            }
        
        for (int i = 0; i < r1.getBase(); i++) {
            for (int j = 0; j < r1.getAltura(); j++) {
                System.out.print("["+rec[i][j]+"]");
            }
            System.out.println("");
        }
        }
    }

