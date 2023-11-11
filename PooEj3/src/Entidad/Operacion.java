/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.

* 
 * @author crist
 */
public class Operacion {
    private double num1;
    private double num2;
    
 //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
//b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }
//c) Métodos get y set.
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
}
