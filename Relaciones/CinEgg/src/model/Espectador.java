package model;

import java.util.ArrayList;

/**
 *
 * @author QuinSDev
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private double dineroD;
    private ArrayList<Espectador> espectador;

    public Espectador() {
        espectador = new ArrayList<>();
    }

    public Espectador(String nombre, int edad, double dineroD) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroD = dineroD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroD() {
        return dineroD;
    }

    public void setDineroD(double dineroD) {
        this.dineroD = dineroD;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador.add(espectador);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Espectador{nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", dineroD=").append(dineroD);
        return sb.toString();
    }
    
    
    
}
