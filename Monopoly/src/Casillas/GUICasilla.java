
package Casillas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author USUARIO
 */
public class GUICasilla extends JPanel{
    private Casilla casilla;
    private JLabel nombre;
    private JLabel propietario;
    private JLabel edificios;
    private ParrillaFichas fichas;
    private JLabel precio;
    private JPanel color;
    
    public GUICasilla(Casilla casilla){
        super();
        GridLayout layout = new GridLayout();
        layout.setRows(6);
        layout.setColumns(1);
        this.setLayout(layout);
        this.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        this.setBackground(Color.decode("#D5E8D4"));
        
        this.casilla = casilla;
        this.nombre = new JLabel(casilla.getNombreCasilla()+"");
        this.nombre.setHorizontalAlignment(SwingConstants.CENTER);
        this.nombre.setForeground(Color.decode("#1B1B1B"));
        this.nombre.setFont(new Font("Courier", Font.BOLD,12));
        
        this.propietario = new JLabel(casilla.getPropietario()+"");
        this.propietario.setHorizontalAlignment(SwingConstants.CENTER);
        this.propietario.setForeground(Color.decode("#1B1B1B"));
        this.propietario.setFont(new Font("Courier", Font.PLAIN,10));
        
        this.edificios = new JLabel(casilla.getEdificios()+"");
        this.edificios.setHorizontalAlignment(SwingConstants.CENTER);
        this.edificios.setForeground(Color.decode("#1B1B1B"));
        this.edificios.setFont(new Font("Courier", Font.PLAIN,10));
        
        Random rnd = new Random();
        this.fichas = new ParrillaFichas();
        this.fichas.setBackground(Color.decode("#D5E8D4"));
        int limite = rnd.nextInt(8)+1;
        
        this.precio = new JLabel(casilla.getPrecioStr());
        this.precio.setHorizontalAlignment(SwingConstants.CENTER);
        this.precio.setForeground(Color.decode("#1B1B1B"));
        this.precio.setFont(new Font("Courier", Font.PLAIN,10));
        
        this.color = new JPanel();
        this.color.setBounds(new Rectangle(0,20));
        this.color.setBackground(casilla.getColor());
        
        this.add(nombre);
        this.add(propietario);
        this.add(edificios);
        this.add(fichas);
        this.add(precio);
        this.add(color);
    }
    
    public void quitarFichas(){
        for(int i = 0; i < 8; i++){
            quitarFicha(i+1);
        }
    }
    
    public Ficha quitarFicha(int id){
        Ficha extraida = null;
        for(int i = 0; extraida == null && i < fichas.getComponentCount(); i++){
            if(fichas.getComponent(i) instanceof Ficha){
                Ficha f = (Ficha)fichas.getComponent(i);
                if(f.getId() == id){
                    fichas.remove(f);
                    extraida = f;
                }
            }
        }
        return extraida;
    }
    
    public void insertarFicha(Ficha f){
        fichas.add(f);
    }

    public JLabel getEdificios() {
        return edificios;
    }

    public void setEdificios(JLabel edificios) {
        this.edificios = edificios;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public void setNombre(JLabel nombre) {
        this.nombre = nombre;
    }

    public JLabel getPropietario() {
        return propietario;
    }

    public void setPropietario(JLabel propietario) {
        this.propietario = propietario;
    }

    public JLabel getPrecio() {
        return precio;
    }

    public void setPrecio(JLabel precio) {
        this.precio = precio;
    }

    public JPanel getColor() {
        return color;
    }

    public void setColor(JPanel color) {
        this.color = color;
    }
    
    
}
