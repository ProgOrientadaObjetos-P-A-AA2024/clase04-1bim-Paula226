
package paquete1;

/**
 *
 * @author Paula Lopez
 */
public class EjecutableDos {
    public static void main(String [] args) {
        Computadora personal = new Computadora(24,0);
        personal.establecerTipoProcesador("R1");
        System.out.printf("%s - %2f",
                personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());
    }
    
}
