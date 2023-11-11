/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidad.Rectangulo;
import Servicio.ServiRectangulo;

/**
 *
 * @author crist
 */
public class PooEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiRectangulo rectan = new ServiRectangulo();
        Rectangulo re = rectan.crearRectangulo();
        rectan.perimetro(re);
        rectan.superficie(re);
        rectan.MostrarRectangulo(re);
    }
    
}
