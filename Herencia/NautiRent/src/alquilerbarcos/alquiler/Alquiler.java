package alquilerbarcos.alquiler;

import alquilerbarcos.model.Barco;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;

public class Alquiler {
    
    
    private LocalDate fechaAlquiler, fechaDevolucion;
    private HashMap<String, Barco> posicionAmarre;
    private ArrayList<Barco> barcos;
    private Barco barco;

    public Alquiler() {
        barcos = new ArrayList<>();
        posicionAmarre = new HashMap<>();
        barcos();
    }

    public Alquiler(LocalDate fechaAlquiler, 
            LocalDate fechaDevolucion, HashMap<String, Barco> posicionAmarre, 
            Barco barco) {
      
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
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

    public HashMap<String, Barco> getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(HashMap<String, Barco> posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void barcos() {
        
        barcos.add(new Barco("Marina Azul", "ABC123", 25, 
                LocalDate.parse("2010-05-23")));
        barcos.add(new Barco("Viento Sereno", "XYZ789", 30, 
                LocalDate.parse("2015-01-18")));
        
    }
    
    public void precioAlquilar() {
        
        Period diasOcupacion = Period.between(fechaDevolucion, fechaDevolucion);
        int alquiler = diasOcupacion.getDays() * barco.calcularMoudlo();
        System.out.println("El precio final es de " + alquiler);
        
    }
    
    public void mostrar() {
        for (Barco barco1 : barcos) {
            System.out.println(barco1.toString());
        }
    }
    
    public void amarre() {
        
        posicionAmarre.put("A1", barcos.get(0));
        
    }
    
}
