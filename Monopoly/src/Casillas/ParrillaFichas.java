/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casillas;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class ParrillaFichas extends JPanel{
    
    public ParrillaFichas(){
        super();
        GridLayout layout = new GridLayout();
        layout.setRows(2);
        layout.setColumns(4);
        this.setLayout(layout);
    }
    
    public Ficha extraerFicha(int id){
        Ficha ficha = null;
        Component componentes[] = this.getComponents();
       
        for(Component c : componentes){
            Ficha f = (Ficha)c;
            if(f.getId() == id){
                ficha = f;
                this.remove(c);
            }
        }
        
        return ficha;
    }
    
    public void insertarFicha(Ficha nueva){
        this.add(nueva);
    }
}
