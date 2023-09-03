/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author David
 */
public class cambiar {
    public static void cambiar(JPanel panel,String path) {
        Borrar(panel);
        JPanelImage  mImagen = new  JPanelImage(panel,path);    // TODO add your handling code here:
        panel.add(mImagen).repaint();
        panel.setOpaque(false);
        panel.setBorder(null);
        panel.setBackground(new Color(0,0,0,0));
        
    }
    
    public static void Borrar(JPanel panel) {
        for (Component c : panel.getComponents()){
            if (c instanceof JPanelImage){
                panel.remove(c);
            }
        }
        panel.revalidate();
        panel.repaint();
        
    } 
    public static void Guardar(JFrame frame) {
        BufferedImage screenshot = new BufferedImage(
            frame.getWidth()-20, frame.getHeight()-210, BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = screenshot.createGraphics();
    
    // Desplazar el punto de inicio 200 píxeles hacia abajo
    g2d.translate(-10, -140);
    
    frame.paint(g2d);
    g2d.dispose();

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG", "png"));

    int choice = fileChooser.showSaveDialog(null);
    if (choice == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();

        if (!file.getName().toLowerCase().endsWith(".png")) {
            file = new File(file.getParentFile(), file.getName() + ".png");
        }

        try {
            ImageIO.write(screenshot, "png", file);
            System.out.println("Captura de pantalla guardada en: " + file.getAbsolutePath());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        }}
    
}
