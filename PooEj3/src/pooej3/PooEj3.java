
package pooej3;

import Entidad.Operacion;
import Servicio.Menu;
import Servicio.ServiOperacion;

/**
 *
 * @author crist
 */
public class PooEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       ServiOperacion opera = new ServiOperacion();
       Operacion op1 = opera.crearOperacion();
       Menu op = new Menu();
       op.menu(op1);
      
     
       
   
       
        
        
    }
    
}
