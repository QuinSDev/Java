package alquilerbarcos.alquiler;

import alquilerbarcos.model.Barco;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Alquiler {
    
    private String nombre;
    private long documento;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private String posicionAmarre;
    private ArrayList<Barco> barcos;
    private Barco barco;

    public Alquiler() {
        barcos = new ArrayList<>();
    }

    public Alquiler(String nombre, long documento, LocalDate fechaAlquiler, 
            LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void barcos() {
        
        barcos.add(new Barco("Marina Azul", 25, LocalDate.parse("2010-05-23")));
        barcos.add(new Barco("Viento Sereno", 30, LocalDate.parse("2015-01-18")));
        
    }
    
    public void alquilar() {
        
        Period diasOcupacion = Period.between(fechaDevolucion, fechaDevolucion);
        int alquiler = diasOcupacion.getDays() * barco.calcularMoudlo();
        System.out.println("El precio final es de " + alquiler);
        
    }
    
}
