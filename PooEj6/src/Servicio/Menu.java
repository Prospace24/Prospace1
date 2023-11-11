/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Menu {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServiCafetera caf = new ServiCafetera();
    int op;
    public void Menu(Cafetera c1){
        do {
            System.out.println("Bienvenido a Nespresso");
            System.out.println("Ingrese la Opcion Deseada");
            System.out.println("1.-Llenar Cafetera");
            System.out.println("2.-Servir Taza");
            System.out.println("3.-Vaciar Cafetera");
            System.out.println("4.-Agregar Cafe");
            System.out.println("5.-Salir");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    caf.llenarCafetera(c1);
                    op=0;
                    break;
                case 2:
                    caf.servir(c1);
                    op=0;
                    break;
                case 3:
                    caf.vaciarCafetera(c1);
                    op=0;
                    break;
                case 4:
                    caf.agregarCafe(c1);
                    op=0;
                    break;
                case 5:
                    System.out.println("Gracias Por Preferirnos Vuelva Pronto");
                    op = 1;
                    break;
                default:
                    System.out.println("La Opcion Ingresada no es Correcta");
                    op = 0;
            }
           
        } while (op==0);
        
    }
    
    
}
