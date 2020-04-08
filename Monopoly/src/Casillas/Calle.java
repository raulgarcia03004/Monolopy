package Casillas;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Calle extends Propiedad{
    private int preciosConstruir[];
    private int alquileres[];
    private int nivel; 
    
    public Calle(int numero, String nombre, int precio, int preciosConstruir[], int alquileres[], int nivel, Color color){
        super(numero, nombre, precio);
        this.nivel = nivel;
        this.preciosConstruir = preciosConstruir;
        this.alquileres = alquileres;
        super.setColor(color);
    }

    public int[] getPreciosConstruir() {
        return preciosConstruir;
    }

    public void setPreciosConstruir(int[] preciosConstruir) {
        this.preciosConstruir = preciosConstruir;
    }

    public int[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(int[] alquileres) {
        this.alquileres = alquileres;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String getPropietario() {
        return super.getPropietario().equals("") ? "Sin propietario" : super.getPropietario();
    }

    @Override
    public String getEdificios() {
        return this.getNivel() == 0 ? "Sin edificar" : this.getNivel() < 5 ? "Casas: "+this.getNivel() : "Hotel";
    }

    @Override
    public String getPrecioStr() {
        return this.getPrecio()+"€";
    }

    @Override
    public String getNombreCasilla() {
        return super.getNombrePropiedad();
    }
}
