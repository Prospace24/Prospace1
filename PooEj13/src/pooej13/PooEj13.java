/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13;

import Entidad.Curso;
import Servicio.ServiCurso;

/**
 *
 * @author crist
 */
public class PooEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServiCurso c1 = new ServiCurso();
      Curso p1 = c1.crearCurso();
      c1.calcularGananciaSemanal(p1);
    }
    
}
