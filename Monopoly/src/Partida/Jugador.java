
package Partida;

/**
 *
 * @author Raúl García Humanes
 * @version 1.0
 */
public class Jugador {
    // Atributos de la clase
    private String nombre;
    private String color;
    private int posicionCasilla;
    // Podríamos poner un array con las casillas de las que es dueño.
    private int dinero;

    // Constructor sin parámetros
    public Jugador() {
    }

    // Constructor con parámetros
    public Jugador(String nombre, String color, int posicionCasilla, int dinero) {
        this.nombre = nombre;
        this.color = color;
        this.posicionCasilla = posicionCasilla;
        this.dinero = dinero;
    }
    
    /** TODO seguir por aquí!!!! */
    
    // Métodos GET/SET atributos de la clase
    public String getNombre() { return nombre; }

    public String getColor() { return color; }

    public int getPosicionCasilla() { return posicionCasilla; }

    public int getDinero() { return dinero; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setColor(String color) { this.color = color; }

    public void setPosicionCasilla(int posicionCasilla) { this.posicionCasilla = posicionCasilla; }

    public void setDinero(int dinero) { this.dinero = dinero; }
}
