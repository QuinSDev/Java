package model;

import java.util.ArrayList;

/**
 *
 * @author QuinSDev
 */
public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private int tamanio;
    private ArrayList<Perro> perro = new ArrayList<>();

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, int tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro.add(perro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String formattedNombre = String.format("%-10s", nombre);
        String formattedRaza = String.format("%-15s", raza);

        sb.append(String.format("%s %s %3d %6d", formattedNombre, 
                formattedRaza, edad, tamanio));

        return sb.toString();
    }

}
