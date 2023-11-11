/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 * Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 * @author crist
 */
public class ServiMovil {
    
    private Scanner leer;

    public ServiMovil() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
    
    public Movil cargarCelular(){
        int[] Cod = new int[7];
        int op;
        System.out.println("Ingrese la Marca");
        String Mar = leer.next();
        System.out.println("Ingrese el Precio");
        int Pre = leer.nextInt();
        System.out.println("Ingrese el Modelo");
        String Mod = leer.next();
        System.out.println("Ingrese la Memoria Ram");
        int Memor = leer.nextInt();
        System.out.println("Ingrese el Almacenamiento Interno");
        int Alma = leer.nextInt();
        System.out.println("Ingrese el codigo del Equipo");
        for (int i = 0; i < Cod.length; i++) {
           op = leer.nextInt();
            while (op > 9) {
                System.out.println("Codigo ingresado Erroneo Vuelva a Ingresarlo");
                op= leer.nextInt();
            }
            Cod[i]= op;
        }
        
   
        return new Movil(Mar, Pre, Mod, Memor, Alma, Cod);
    }
}
