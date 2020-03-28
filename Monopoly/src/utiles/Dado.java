
package utiles;

import java.util.Random;

/**
 *
 * @author Raúl García Humanes
 * @version 1.0
 */
public class Dado {
    // Atributos de clase
    private int valor;
    private Random rdn;  

   // Constructor de la clase
    public Dado() {
        this.valor = 1;
        this.rdn = new Random();
    }
    
    /**
     * TiraDado devuelve un int comprendido del 1 al 6. Es la simulacón de
     * Un dado real.
     * 
     * @return int con un resultado comprendido del 1 al 6
     */
    public int tiraDado() {
        setValor((int) (rdn.nextDouble()* 6 + 1));
        return getValor();
    }

    // Métodos GET/SET atributos de la clase
    public int getValor() { return valor; }

    public Random getRdn() { return rdn; }

    public void setRdn(Random rdn) { this.rdn = rdn; }
    
    public void setValor(int valor) { this.valor = valor; }

    @Override
    public String toString() {
        return "Has sacado " + getValor();
    }
}
