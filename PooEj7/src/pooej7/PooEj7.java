/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Persona;
import Servicio.ServiPersona;

/**
 *
 * @author crist
 */
public class PooEj7 {

    /**
     * A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ServiPersona ps = new ServiPersona(); 
         double[] Peso = new double[4];
         boolean[] Edad = new boolean[4];
         int con;
        
         
         Persona p1 = ps.crearPersona();
         Peso[0] = comprobarPeso(p1,ps);
         Edad[0] = comprobarEdad(p1,ps);
         System.out.println("");
         
         Persona p2 = ps.crearPersona();
         Peso[1] = comprobarPeso(p2,ps);
         Edad[1] = comprobarEdad(p2,ps);
         System.out.println("");
         
         Persona p3 = ps.crearPersona();
         Peso[2] =comprobarPeso(p3,ps);
         Edad[2] =comprobarEdad(p3,ps);
         System.out.println("");
         
         Persona p4 = ps.crearPersona();
         Peso[3] = comprobarPeso(p4,ps);
         Edad[3] = comprobarEdad(p4,ps);
         
         MostrarPorcentaje(Edad, Peso);
         
        
         
    }
    
    public static double comprobarPeso(Persona pv, ServiPersona mb){
         double resultaod;
         
         
         resultaod= mb.calcularIMC(pv);
         
         if (resultaod == -1) {
             System.out.println("La Persona"+ pv.getNombre()+"esta por debajo del peso Ideal");
            
        }else if (resultaod == 0) {
             System.out.println("La Persona"+pv.getNombre()+"Esta en su Peso Ideal");
        }else{
             System.out.println("La Persona"+pv.getNombre()+"Tiene SobrePeso");
        }
         
         return resultaod;
    }
         
         
    public static boolean comprobarEdad(Persona pv, ServiPersona mb){
         
         boolean resultado;
         resultado = mb.esMAyorEdad(pv);
         if (resultado = true) {
             System.out.println("Es Mayor de Edad");
        }else{
             System.out.println("No es Mayor de Edad");
         }
        
         
        return resultado;
    }
    public static void MostrarPorcentaje(boolean[] bn, double[] cap ){
        int cont1 = 0;
        int cont2=0;
        int cont3= 0;
        for (int i = 0; i < bn.length; i++) {
            if (bn[i]== true) {
                cont1++;
            }
            
        }
        System.out.println("De las Personas Registradas el "+((cont1*100)/4)+"% es Mayor de Edad");
        cont1 = 0;
        for (int i = 0; i < cap.length; i++) {
            if (cap[i]==(-1)) {
                cont1++;
            }else if (cap[i]==0) {
                cont2++;
                
            }else if (cap[i]==1) {
                cont3++;
            }
        }
        System.out.println("De las Personas Ingresadas:");
        System.out.println("Bajas en Peso: "+(cont1*100)/4+"%");
        System.out.println("Peso Ideal: "+((cont2*100)/4)+"%");
        System.out.println("SobrePeso: "+((cont3*100)/4)+"%");
    
    }
    

    
}
