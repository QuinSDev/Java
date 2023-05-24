package model;

import java.util.ArrayList;

/**
 *
 * @author QuinSDev
 */
public class Pelicula {

    private String titulo, director;
    private int edadM, duracion;
    private ArrayList<Pelicula> pelicula;
    private ArrayList<Cine[][]> salaC = new ArrayList<Cine[][]>();

    public Pelicula() {
        pelicula = new ArrayList<>();

    }

    public Pelicula(String titulo, String director, int edadM, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadM = edadM;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadM() {
        return edadM;
    }

    public void setEdadM(int edadM) {
        this.edadM = edadM;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula.add(pelicula);
    }

    public ArrayList<Cine[][]> getSalaC() {
        return salaC;
    }

    public void setSalaC(Cine[][] salaC) {
        this.salaC.add(salaC);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        String formaDura = String.format("%-3d", duracion);
        String formaDuracion = formaDura.concat(" min");
        String formaEd = String.format("%-1d", edadM);
        String formaEdad = formaEd.concat("+");
        sb.append(String.format("| %-20s | %-20s | %-10s | %-5s |", titulo,
                director, formaDuracion, formaEdad));
        sb.append("\n-----------------------+----------------------"
                + "+------------+-------+");

        return sb.toString();
    }

}
