package Jugadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Jugador {
    private String nombre;
    private int orden;
    private int puntos;
    private int dinero;
    private int carcel;
    private int casilla;
    
    public Jugador(String nombre, int orden, int puntos, int dinero, int carcel, int casilla){
        this.nombre = nombre;
        this.orden = orden;
        this.puntos = puntos;
        this.dinero = dinero;
        this.carcel = carcel;
        this.casilla = casilla;
    }
    
    public boolean estaEnLaCarcel(){
        return carcel > 0;
    }
    
    public void moverCasilla(int posiciones){
        casilla += posiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCarcel() {
        return carcel;
    }

    public void setCarcel(int carcel) {
        this.carcel = carcel;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }
}
