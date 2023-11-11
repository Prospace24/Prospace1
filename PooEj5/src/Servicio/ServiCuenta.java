/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 * @author crist
 */
public class ServiCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su DNI");
        long dn = leer.nextLong();
        System.out.println("Para Crear La cuenta debe Tener 500$");
        double sal = 500.00;
        int num = 1304 + (int) (Math.random()*500000);
        System.out.println("Su numero De cuentas: "+num);
        
        return new CuentaBancaria(num, dn, sal);
    }
    
    public void Ingresar(CuentaBancaria c1){
        System.out.println("Ingrese la Cabtidad a Depositar");
        double depo = leer.nextDouble();
        int sal;
        sal = (int) Math.floor(depo);
         c1.setSaldo(sal);
    }
    public void Retirar(CuentaBancaria c1){
        System.out.println("Ingrese la Cantidad a Retirar");
        double depo = leer.nextDouble();
        if (depo > c1.getSaldo()) {
            System.out.println("El Monto ingresado Supera su Saldo Actual");
            System.out.println("Monto a entregar:"+c1.getSaldo());
            c1.setSaldo(0);
        }else{
            int sal;
        sal = (int) Math.floor(depo);
         c1.setSaldo(c1.getSaldo()-sal);
        }   
        
    }
    public void ExtraccionRapida(CuentaBancaria c1){
        System.out.println("La Extraccion Rapida Permite Retirar Solo el 20%");
         System.out.println("Su Saldo Actual es de: "+c1.getSaldo());
         System.out.println("Por lo q la Cantidad Maxima a retirar es de: "+c1.getSaldo()*0.2);
         System.out.println("Ingrese la Cantidad a Retirar q no Exceda el 20%");
         int reti = leer.nextInt();
         if (reti >(c1.getSaldo()*0.2)) {
             System.out.println("EL monto es Mayor al estipulado");
         }else{
             System.out.println("Entregando DineroExpress");
             c1.setSaldo(c1.getSaldo()-reti);
        }
    }
    
    public void MostrarSaldo(CuentaBancaria c1){
        System.out.println("Su Saldo Actual es de: "+c1.getSaldo());
    }
    public void MostrarDatos(CuentaBancaria c1){
        
        System.out.println("Numero Cuenta: "+c1.getNumC());
        System.out.println("Numero de DNI: "+c1.getDNI());
        System.out.println("Saldo Actual: "+c1.getSaldo());
    }
     
    
     
}
