package Fabrica;

public class Factoria {

    public static Partes getParte(String tipo) {

        if (tipo.equals("cabeza")) {

            return new Cabeza();
            
        }
        if(tipo.equals("cuerpo")){
            return new Cuerpo();
        }
        if(tipo.equals("cara")){
            return new Cara();
        }
        if(tipo.equals("viñeta")){
            return new Viñeta();
        }
        if(tipo.equals("fondo")){
            return new Fondo();
        }
        if(tipo.equals("pet")){
            return new Pet();
        }
        if(tipo.equals("principal")){
            return new Pet();
        }
        
        return new Cuerpo();
        

    }
}