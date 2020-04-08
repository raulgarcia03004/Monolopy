/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casillas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class Ficha extends JLabel{
    private int id;
    
    public Ficha(int id){
        super();
        this.id = id;
        this.setIcon(new ImageIcon("./img/p"+(id)+".png"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
