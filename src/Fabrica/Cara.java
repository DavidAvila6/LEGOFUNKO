package Fabrica;

import java.util.HashMap;
import modelo.cambiar;
import vista.Fondos;

public class Cara extends Partes{


  @Override
  public void getimagen() {
 // TODO Auto-generated method stub
    
    String a = getPath();
      HashMap<String, String> imageMap = new HashMap<>();
        imageMap.put("1", "/imgcara/cara1.png");
        imageMap.put("2", "/imgcara/cara2.png");
        imageMap.put("3", "/imgcara/cara3.png");
        imageMap.put("4", "/imgcara/cara4.png");
        imageMap.put("5", "/imgcara/cara5.png");
        imageMap.put("6", "/imgcara/cara6.png");
        
         String imagePath = imageMap.get(a);
        if (imagePath != null) {
            cambiar.cambiar(Fondos.JP4, imagePath);
        }
 
 }


}