/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Menu {
    private Scanner leer;
    private Serviperro ps;

    public Menu() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ps = new Serviperro();
    }
    
    public void MenuPerro(Perro p1){
        int op;
        
        do {
             System.out.println("Bienvnido al Menu Mascota");
        System.out.println("Ingrese la opcion a Realizar");
        System.out.println("1.-Agregar Mascota");
        System.out.println("2.-Mostrar Mascotas");
        System.out.println("3.-Eliminar Mascota");
        System.out.println("4.-Salir");
        
        op= leer.nextInt();
        switch (op) {
            case 1:
                Perro p2 = ps.crearPerro();
                ps.agregarPerro(p2);
                op = 0;
                break;
            case 2:
                ps.mostrarPerro();
                op = 0;
                break;
            case 3:
                System.out.println("Ingrese el nombre del Perro a Eliminar");
                String nom = leer.next();
                ps.eliminarRaza(nom);
                op = 0;
                break;
            case 4:
                op = 1;
                break;    
        }
        } while (op == 0);
        
       
    }
    
}
