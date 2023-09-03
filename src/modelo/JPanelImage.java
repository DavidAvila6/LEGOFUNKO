/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author David
 */
public class JPanelImage extends JLabel{
    private int x,y;
    private final String path;
    
    public JPanelImage(JPanel panel, String path){
        this.path=path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x,y);
        
    }
    @Override
        public void paint(Graphics g){
            setBackground(new Color(0,0,0,0));
            g.drawImage(null, 0, 0, getWidth(),getHeight(),this);
            Image imagen = new ImageIcon(getClass().getResource(path)).getImage();
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
    }
    
    
}
