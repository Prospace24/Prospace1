/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Menu {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     ServiOperacion op = new ServiOperacion();
     
    public void menu(Operacion op1){
        System.out.println("Bienvenido al Menu de Operaciones");
        int opc = 0;
        int it = 0;
        do {
            if (it > 0) {
                op.crearOperacion();
            }
            System.out.println("Ingrese la opcion q desea realizar");
            System.out.println("1.-Sumar");
            System.out.println("2.-Restar");
            System.out.println("3.-Multiplicar");
            System.out.println("4.-Dividir");
            System.out.println("5.-Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    op.sumar(op1);
                    System.out.println("Pulse Cualquier tecla para volver al menu Principal");
                    leer.next();
                     opc = 0;
                    break;
                case 2:
                    op.restar(op1);
                    System.out.println("Pulse Cualquier tecla para volver al menu Principal");
                    leer.next();
                     opc = 0;
                    break;
                case 3:
                    if (op1.getNum1() == 0 || op1.getNum2() == 0) {
                        System.out.println("Uno de los Numeros Ingresados es 0 por lo tanto el Resultado es 0");
                    }else{
                          op.multiplicar(op1);
                    }
                    System.out.println("Pulse Cualquier tecla para volver al menu Principal");
                    leer.next();
                     opc = 0;
                  
                    break;
                case 4:
                    if (op1.getNum1() == 0 || op1.getNum2() == 0) {
                        System.out.println("Uno de los Numeros Ingresados es 0 por lo tanto el Resultado es 0");
                    }else{
                          op.dividir(op1);
                    }
                    System.out.println("Pulse Cualquier tecla para volver al menu Principal");
                    leer.next();
                     opc = 0;
                    break;
                case 5:
                    opc = 1;
                    break;
                default:
                    opc = 0;
            }
            it= it +1;
                    
        } while (opc == 0);
        
    }
}
