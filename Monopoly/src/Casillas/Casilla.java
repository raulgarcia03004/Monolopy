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
public class Casilla implements Dibujable{
    private int numero;
    private Color color;
    private GUICasilla tablero;
    
    public Casilla(int numero){
        tablero = null;
        this.numero = numero;
        this.tablero = tablero;
        this.color = Color.decode("#D5E8D4");
    }

    public GUICasilla getTablero() {
        return tablero;
    }

    public void setTablero(GUICasilla tablero) {
        this.tablero = tablero;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String getPropietario() {
        return "";
    }

    @Override
    public int getPrecio() {
        return 0;
    }

    @Override
    public String getEdificios() {
        return "";
    }

    @Override
    public String getPrecioStr() {
        return "";
    }

    public Color getColorCode() {
        return color;
    }

    @Override
    public String getNombreCasilla() {
        return "";
    }
}
