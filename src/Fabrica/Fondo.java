package Fabrica;

import java.util.HashMap;
import modelo.cambiar;
import vista.Fondos;

public class Fondo extends Partes{


  @Override
  public void getimagen() {
 // TODO Auto-generated method stub
  String a = getPath();
        
        HashMap<String, String> imageMap = new HashMap<>();
        imageMap.put("1", "/imgfondo/fondo1.png");
        imageMap.put("2", "/imgfondo/fondo2.png");
        imageMap.put("3", "/imgfondo/fondo3.png");
        imageMap.put("4", "/imgfondo/fondo4.png");
        imageMap.put("5", "/imgfondo/fondo5.png");
        imageMap.put("6", "/imgfondo/fondo6.jpg");
        
        String imagePath = imageMap.get(a);
        if (imagePath != null) {
            cambiar.cambiar(Fondos.JP3, imagePath);
        }
 
 }


}