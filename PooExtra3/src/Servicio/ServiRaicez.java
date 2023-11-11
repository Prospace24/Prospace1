/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raicez;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiRaicez {
    private Scanner leer;

    public ServiRaicez() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Raicez crearValores(){
        Raicez r1 = new Raicez();
        System.out.println("Ingrese el Valor A");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el Valor B");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el Valor C");
        r1.setC(leer.nextDouble());
        return r1;
    }
   /**
    *  Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
    * @param c1
    * @return 
    */
    public double getDiscriminante(Raicez c1){
        double dis = (double) (Math.pow(c1.getB(), 2)-4*c1.getA()*c1.getC());
        
        return dis;
    }
    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raicez c1){
        boolean rs;
        double di = getDiscriminante(c1);
        if (di > 0) {
            rs = true;
        } else{
            rs = false;
        }
        return rs;
    }
    /**
     * 
     * @param di
     * @return 
     */
     public boolean tieneRaiz(Raicez c1){
        boolean r;
        double di = getDiscriminante(c1);
        if (di == 0) {
            r = true;
        } else{
            r = false;
        }
        return r;
    }
     
     public void MostrarRaices(Raicez c1){
         boolean s = tieneRaices(c1);
         if (s = true) {
             System.out.println("(-b-√((b^2)-(4*a*c)))/(2*a)"+(-c1.getB()-(double) (Math.sqrt((Math.pow(c1.getB(), 2)-(4*c1.getA()*c1.getC())))))/(2*c1.getA()));
             System.out.println("(-b+√((b^2)-(4*a*c)))/(2*a)"+(-c1.getB()+(double) (Math.sqrt((Math.pow(c1.getB(), 2)-(4*c1.getA()*c1.getC())))))/(2*c1.getA()));
         }else {
             
         }
     }
     
     public void MostrarRaiz(Raicez c1){
         boolean s = tieneRaiz(c1);
         double x1;
         double x2;
         if ( s= true) {
             x1 = (-c1.getB()-(double) (Math.sqrt((Math.pow(c1.getB(), 2)-(4*c1.getA()*c1.getC())))))/(2*c1.getA());
             x2 = (-c1.getB()+(double) (Math.sqrt((Math.pow(c1.getB(), 2)-(4*c1.getA()*c1.getC())))))/(2*c1.getA());
             System.out.println("x1=x2=-b/2 "+" "+(x1 = x2 = (-c1.getB()/2)));
         }
     }
     
     public void calcular(Raicez c1){
         boolean s = tieneRaices(c1);
         if (s = true) {
             MostrarRaices(c1);
         }else{
             s = tieneRaiz(c1);
             if (s = true) {
                 MostrarRaiz(c1);
             }else{
                 System.out.println("No hay solucion posible");
             }
         }
     }
}
