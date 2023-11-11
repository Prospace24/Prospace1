/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**


 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 * @author crist
 */
public class ServiCafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int opc;
    double can;
    /**
     *  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
     * @param c1 
     */
    public void llenarCafetera(Cafetera c1){
        c1.setCapAct(c1.getCapMax());
    }
    /**
     *  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
     * @param c1 
     */
    public void servir(Cafetera c1){
        do {
        System.out.println("Elija la Taza a Servir");
        System.out.println("1.-Taza Peuqeña 4 onz");
        System.out.println("2.-Taza Mediana 8 onz");
        System.out.println("3.-Taza Grande 12 onz");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                if (c1.getCapAct()>= 120) {
                    c1.setCapAct(c1.getCapAct()-120);
                    System.out.println("Sirviendo Café");
                    System.out.println("-------Taza Cervida-------");
                    System.out.println("Disfrute el Mejor Sabor");
                }else{
                    System.out.println("La cantidad Actual de Café no es Suficiente");
                    can = c1.getCapAct() /30;
                    System.out.println("La taza se lleno: "+can+" onzas");
                }
                break;
            case 2:
                if (c1.getCapAct()>= 240) {
                    c1.setCapAct(c1.getCapAct()-240);
                     System.out.println("Sirviendo Café");
                    System.out.println("-------Taza Cervida-------");
                    System.out.println("Disfrute el Mejor Sabor");
                }else{
                    System.out.println("La cantidad Actual de Café no es Suficiente");
                    can = c1.getCapAct() /30;
                    System.out.println("La taza se lleno: "+can+" onzas");
                }
                break;
            case 3:
                if (c1.getCapAct()>= 360) {
                    c1.setCapAct(c1.getCapAct()-360);
                     System.out.println("Sirviendo Café");
                    System.out.println("-------Taza Cervida-------");
                    System.out.println("Disfrute el Mejor Sabor");
                }else{
                    System.out.println("La cantidad Actual de Café no es Suficiente");
                    can = c1.getCapAct() /30;
                    System.out.println("La taza se lleno: "+can+" onzas");
                }
                break;
            default:
                System.out.println("La opcion ingresada es Incorreta");
                opc=0;
                
        }
        } while (opc == 0);
        
        
    }
    /**
     *  Método vaciarCafetera(): pone la cantidad de café actual en cero.
     */
    public void vaciarCafetera(Cafetera c1){
        c1.setCapAct(0);
        System.out.println("Cafetera Vacia");
        
    }
    /**
     * 
     */
    public void agregarCafe(Cafetera c1){
        System.out.println("Ingrese la Cantidad de cafe ml");
        opc = leer.nextInt();
        if ((c1.getCapAct()+opc)>c1.getCapMax()) {
            System.out.println("La cantidad de Café excede el limite");
        } else {
            c1.setCapAct(c1.getCapAct()+opc);
        }
    }
}
