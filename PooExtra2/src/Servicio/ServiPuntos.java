/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiPuntos {
    private Scanner leer;

    public ServiPuntos() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese el los valores del Punto 1");
        System.out.println("X1");
        double X1 = leer.nextDouble();
        System.out.println("x2");
        double X2 = leer.nextDouble();
        System.out.println("Ingrese los Valores del Punto 2");
        System.out.println("y1");
        double Y1 = leer.nextDouble();
        System.out.println("y2");
        double Y2 = leer.nextDouble();
        return new Puntos(X1, Y1, X2, Y2);
    }
    public void calcularDistancia(Puntos p1){
        System.out.println("La distancia de los 2 puntos es de:");
        double dis;
        dis = (double) (Math.sqrt(Math.pow((p1.getX2()-p1.getX1()),2)+(Math.pow( (p1.getY2() - p1.getY1()), 2))));
        System.out.println(dis);
    }
}
