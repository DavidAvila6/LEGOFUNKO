package Fabrica;

import java.util.HashMap;
import modelo.cambiar;
import vista.Fondos;
public class Cabeza extends Partes {

  @Override
  public void getimagen() {
      // TODO Auto-generated method stub
      String a = getPath();
      HashMap<String, String> imageMap = new HashMap<>();
        imageMap.put("1", "/imgcabezas/cabeza1.png");
        imageMap.put("2", "/imgcabezas/cabeza2.png");
        imageMap.put("3", "/imgcabezas/cabeza3.png");
        imageMap.put("4", "/imgcabezas/cabeza4.png");
        imageMap.put("5", "/imgcabezas/cabeza5.png");
        imageMap.put("6", "/imgcabezas/cabeza6.png");
        imageMap.put("7", "/imgcabezas/cabeza7.png");
        imageMap.put("8", "/imgcabezas/cabeza8.png");
        imageMap.put("9", "/imgcabezas/cabeza9.png");
        imageMap.put("10", "/imgcabezas/cabeza10.png");
        imageMap.put("11", "/imgcabezas/cabeza11.png");
        
         String imagePath = imageMap.get(a);
        if (imagePath != null) {
            cambiar.cambiar(Fondos.JP1, imagePath);
        }
 
 }

}