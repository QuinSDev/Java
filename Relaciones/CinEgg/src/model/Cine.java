package model;

/**
 *
 * @author QuinSDev
 */
public class Cine {
    
    private Pelicula pelicula;
    private double precioE;
    private String letra, num;

    public Cine() {
    }

    public Cine(String num, String letra) {
        this.num = num;
        this.letra = letra;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioE() {
        return precioE;
    }

    public void setPrecioE(double precioE) {
        this.precioE = precioE;
    }    

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
}
