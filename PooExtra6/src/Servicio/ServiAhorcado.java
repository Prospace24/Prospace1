/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiAhorcado {
    private Scanner leer;

    public ServiAhorcado() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    /**
     *  Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
     * @return 
     */
    public Ahorcado crearJuego(Ahorcado ah){
       
        System.out.println("Ingrese la Palabra a Buscar");
        String pl = leer.next();
        ah.setPalabra(new String[pl.length()]);
        String[] p = new String[pl.length()];
        for (int i = 0; i < ah.getPalabra().length; i++) {
           p[i] = pl.substring(i, i+1);
           
        }
        ah.setPalabra(p);
        System.out.println("Ingrese la cantidad de Intentos");
        ah.setJm(leer.nextInt());
        ah.setPe(0);
        return ah;   
    }
    /**
     * Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
     * @param a1 
     */
    public void longitud(Ahorcado a1){
        
        System.out.println("Longitud de la Palabra: "+" "+a1.getPalabra().length);
            
    }
    /**
     * Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     * @param a1
     * @param letra 
     */
    public void buscar(Ahorcado a1, String letra){
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                System.out.println("La letra Forma Parte de la Palabra");
                break;
            } else if (i+1 == a1.getPalabra().length) {
                System.out.println("La Letra no es Parte de la Palabra");
            }
                
            
        }
    }
    /**
     * Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     * @param a1
     * @param letra
     * @return 
     */
    public boolean encontradas(Ahorcado a1, String letra){
        boolean enco = false;
         for (int i = 0; i < a1.getPalabra().length; i++) {
            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {
                a1.setPe(a1.getPe()+1);
               enco = true;
            }
        }
         System.out.println("Numero de Letras (Encontradas/Faltantes)="+" "+a1.getPe()+"/"+(a1.getPalabra().length-a1.getPe()));
         
         return enco;
    }
    /**
     * Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     * @param a1 
     */
    public void mostrarIntentos(Ahorcado a1){
        System.out.println("Numeros de Intentos Posibles= "+a1.getJm());
    }
    
    public void playGame(){
        Ahorcado A1 = new Ahorcado();
        boolean fin = false;
        crearJuego(A1);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-----------Comienza el juego-----------");
        while ( fin == false) {
            
            System.out.println("Ingresa una Letra");
        String letra = leer.next();
        while (letra.length() != 1) {
            System.out.println("Ingrese 1 letra");
            letra = leer.next();
        }
        longitud(A1);
        buscar(A1, letra);
        if (encontradas(A1, letra) == false) {
            A1.setJm(A1.getJm()-1);
        }
         mostrarIntentos(A1);
        
            if (A1.getPe() == A1.getPalabra().length) {
                fin = true;
                System.out.println("-------Congratulation------");
                for (int i = 0; i < A1.getPalabra().length; i++) {
                     System.out.print("["+A1.getPalabra()[i]+"]");
                }
                System.out.println(" ");
               
            }else if (A1.getJm() == 0) {
                fin = true;
                System.out.println("------AHORCADOOOO--------");
            }
         
        }
       
        
        
        
        
    }
    
            
    
}
