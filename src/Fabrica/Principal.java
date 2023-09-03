package Fabrica;

import modelo.cambiar;
import vista.Fondos;

public class Principal extends Partes{


  @Override
  public void getimagen() {
 // TODO Auto-generated method stub
    cambiar.cambiar(Fondos.JP4,getPath());
 
 }


}