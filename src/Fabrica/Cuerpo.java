package Fabrica;

import java.util.HashMap;
import modelo.cambiar;
import vista.Fondos;

public class Cuerpo extends Partes{


  @Override
  public void getimagen() {
 // TODO Auto-generated method stub
    String a = getPath();
        
        HashMap<String, String> imageMap = new HashMap<>();
       imageMap.put("1", "/imgpecho/cuerpo1.png");
        imageMap.put("2", "/imgpecho/cuerpo2.png");
        imageMap.put("3", "/imgpecho/cuerpo3.png");
        imageMap.put("4", "/imgpecho/cuerpo4.png");
        imageMap.put("5", "/imgpecho/cuerpo5.png");
        imageMap.put("6", "/imgpecho/cuerpo6.png");
        imageMap.put("7", "/imgpecho/cuerpo7.png");
        imageMap.put("8", "/imgpecho/cuerpo8.png");
        
        String imagePath = imageMap.get(a);
        if (imagePath != null) {
            cambiar.cambiar(Fondos.JP2, imagePath);
        }
 
 }


}