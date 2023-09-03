/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;

import java.util.HashMap;
import modelo.cambiar;
import vista.Fondos;

/**
 *
 * @author David
 */
public class Viñeta extends Partes{
     @Override
  public void getimagen() {
 // TODO Auto-generated method stub
  String a = getPath();
        
        HashMap<String, String> imageMap = new HashMap<>();
        imageMap.put("1", "/imgcomp/comp1.png");
        imageMap.put("2", "/imgcomp/comp2.png");
        imageMap.put("3", "/imgcomp/comp3.png");
        imageMap.put("4", "/imgcomp/comp4.png");
        imageMap.put("5", "/imgcomp/comp5.png");
        imageMap.put("6", "/imgcomp/comp6.png");
        imageMap.put("7", "/imgcomp/comp7.png");
        
        String imagePath = imageMap.get(a);
        if (imagePath != null) {
            cambiar.cambiar(Fondos.JP5, imagePath);
        }
    
 
 }
    
}
