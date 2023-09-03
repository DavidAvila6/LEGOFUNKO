package Fabrica;

import java.util.HashMap;
import modelo.cambiar;
import vista.Fondos;

public class Pet extends Partes{


  @Override
  public void getimagen() {
 // TODO Auto-generated method stub
  String a = getPath();
        
        HashMap<String, String> imageMap = new HashMap<>();
        imageMap.put("1", "/imgpet/pet1.png");
        imageMap.put("2", "/imgpet/pet2.png");
        imageMap.put("3", "/imgpet/pet3.png");
        imageMap.put("4", "/imgpet/pet4.png");
        imageMap.put("5", "/imgpet/pet5.png");
        imageMap.put("6", "/imgpet/pet6.png");
        
        String imagePath = imageMap.get(a);
        if (imagePath != null) {
            cambiar.cambiar(Fondos.JP6, imagePath);
        }
 
 }


}