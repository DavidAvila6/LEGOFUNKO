/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Fabrica.Partes;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.cambiar;

/**
 *
 * @author David
 */
public class puente {
    public  ImageIcon ico = new ImageIcon();
    public static void controladorimg(Partes f,String path) {
         f.setPath(path);
         System.out.println(path);
         f.getimagen();
        
    }
     public static void controladorfon(JPanel f,String path) {
        cambiar.cambiar(f,path);
        
    }
    public static void controladorico(JButton f,ImageIcon ico) {
         f.setIcon(ico);
    }

    

    
}
