/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * @author crist
 */
public class ServiMatematica {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Matematica cargarNumeros(){
        
        double num = (double) (Math.random()*100);
        double num1 = (double) (Math.random()*100);
        return new Matematica(num, num1);
    }
    
    public void devolverMayor(Matematica m1){
        System.out.println("EL numero Mayor es: ");
        System.out.println((Math.max(m1.getNum1(), m1.getNum2())));
    }
    
    public void calcularPotencia(Matematica m1){
        System.out.println("EL Resultado de la Potencia es: ");
        int re;
        re = (int) (Math.pow((Math.floor(m1.getNum1())), (Math.floor(m1.getNum2()))));
        System.out.println(re);
    }
    public void calcularRaiz(Matematica m1){
        System.out.println("La Raiz Cuadrada del Numero Menor es: ");
        int menor = (int) (Math.abs(Math.min(m1.getNum1(), m1.getNum2())));
        System.out.println((Math.pow(menor, 2)));
    }
}

