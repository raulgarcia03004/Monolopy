package Casillas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Propiedad extends Casilla{
    private int precio;
    private String nombre;
    
    public Propiedad(int numero, String nombre, int precio){
        super(numero);
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombrePropiedad() {
        return nombre;
    }

    public void getNombrePropiedad(String nombre) {
        this.nombre = nombre;
    }
    
    
}
