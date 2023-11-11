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
public class ServiOperacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /**
     *  *d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
     * @return 
     */
    public Operacion crearOperacion(){
        System.out.println("Ingrese un Numero");
        double num = leer.nextDouble();
        System.out.println("Ingrese el Segundo Numero");
        double num2 = leer.nextDouble();
        return new Operacion(num, num2);
    }
    /**
     * e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
     * @param op1 
     */
    public void sumar(Operacion op1){
        
        System.out.println("El resultado de la Suma es de: "+(op1.getNum1()+op1.getNum2()) );
        
    }
    /**
     * f) Método restar(): calcular la resta de los números y devolver el resultado al main
     * @param op1 
     */
     public void restar(Operacion op1){
        
        System.out.println("El resultado de la Resta es de: "+(op1.getNum1()-op1.getNum2()) );
        
    }
     /**
      * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main.
      * @param op1 
      */
     public void multiplicar(Operacion op1){
        
        System.out.println("El resultado de la Multiplicacion es de: "+(op1.getNum1()*op1.getNum2()) );
        
    }
     /**
      * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
      * @param op1 
      */
     public void dividir(Operacion op1){
        
        System.out.println("El resultado de la Dividir es de: "+(op1.getNum1()/op1.getNum2()) );
        
    }
     
    
    
}
