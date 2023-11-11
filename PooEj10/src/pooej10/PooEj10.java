/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 * @author crist
 */
public class PooEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        DecimalFormat df = new DecimalFormat("#.##");
        
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i]= (double) (Math.random()*100);
            System.out.print("["+df.format(vectorA[i])+"]");
        }
        System.out.println(" ");
        
        Arrays.sort(vectorA);
      
        for (int i = 0; i < vectorA.length; i++) {
       
            System.out.print("["+df.format(vectorA[i])+"]");
        }
        System.out.println(" ");
        
        for (int i = 0; i < 10; i++) {
             vectorB[i]= 0;
             vectorB[i] = vectorA[i];
              
        }
        
        Arrays.fill(vectorB, 10, 20, 0.5);
     
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print("["+df.format(vectorB[i])+"]");
        }
        System.out.println(" ");
        
        
    }
    
}
