
package principal;

import utiles.Dado;

/**
 *
 * @author Raúl García Humanes
 */
public class Monopoly {

    public static void main(String[] args) {
        Dado dado_1 = new Dado();
        Dado dado_2 = new Dado();
        
        int tirada_1 = dado_1.tiraDado();
        int tirada_2 = dado_2.tiraDado();
        
        System.out.println("Dado 1: " + tirada_1);
        System.out.println("Dado 2: " + tirada_2);
        System.out.println("Resultado fial: " + (tirada_1 + tirada_2));
    }
    
}
