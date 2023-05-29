package alquilerbarcos.model;

import java.time.LocalDate;

public class Barco {
    
    protected String nombre, matricula;
    protected int eslora;
    protected LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String nombre, String matricula, int eslora, 
            LocalDate anioFabricacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public int calcularMoudlo() {
        
        return this.eslora * 10;
        
    }
    
}
