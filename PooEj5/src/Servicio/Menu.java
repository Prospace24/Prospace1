/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Menu {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ServiCuenta op = new ServiCuenta();
    
    public void Menu(CuentaBancaria c1){
        
        int opc;
        do {
        System.out.println("Bienvenido a Bancaribe");
        System.out.println("Ingrese La Opcion a Desea Realizar");
        System.out.println("1.-Crear Cuenta");
        System.out.println("2.-Depositar");
        System.out.println("3.-Retirar");
        System.out.println("4.-Retiro Express");
        System.out.println("5.-Mostrar Saldo");
        System.out.println("6.-Mostrar Datos");
        System.out.println("7.-Salir");
        opc = leer.nextInt();
            switch (opc) {
                case 1:
                    op.crearCuenta();
                     System.out.println("Pulse cualquier tecla para volver al menu");
                    leer.next();
                    opc = 0;
                    break;
                case 2:
                    op.Ingresar(c1);
                     System.out.println("Pulse cualquier tecla para volver al menu");
                    leer.next();
                    opc = 0;
                    break;
                case 3:
                    op.Retirar(c1);
                     System.out.println("Pulse cualquier tecla para volver al menu");
                    leer.next();
                    opc = 0;
                    break;
                case 4:
                    op.ExtraccionRapida(c1);
                     System.out.println("Pulse cualquier tecla para volver al menu");
                    leer.next();
                    opc = 0;
                    break;
                case 5:
                    op.MostrarSaldo(c1);
                     System.out.println("Pulse cualquier tecla para volver al menu");
                    leer.next();
                    opc = 0;
                    break;
                case 6:
                    op.MostrarDatos(c1);
                    System.out.println("Pulse cualquier tecla para volver al menu");
                    leer.next();
                    opc = 0;
                    break;
                case 7:
                    opc =1;
                    
                    break;
                default:
                    System.out.println("La opcion ingresaa¿da No corresponde a Ninguna Opcíon");
                    opc = 0;
            }
       
        } while (opc == 0);
        
        
    }
}
