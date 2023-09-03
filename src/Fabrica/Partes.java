package Fabrica;

public abstract class Partes {

    private String path;
    
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public abstract void getimagen();
}