/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class Dado {
    private static Random generador = new Random();
    
    public static int tirarDado(){
        return generador.nextInt(6)+1;
    }
}
