
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class EjecutableTres {
     public static void main(String [] args) {
        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Inter vPRo");
      
        System.out.printf("%s - %2f",
                personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());
        
        
    }
    
}
    


