package alquilerbarcos.model;

import java.time.LocalDate;

public final class Velero extends Barco{
    
    private int numeMastiles;
    
    public Velero() {
        
    }
    
    public Velero(int numeMastiles, String nombre, String matricula, int eslora, 
            LocalDate anioFabricacion) {
        super(nombre, matricula, eslora, anioFabricacion);
        this.numeMastiles = numeMastiles;
    }

    public int getNumeMastiles() {
        return numeMastiles;
    }

    public void setNumeMastiles(int numeMastiles) {
        this.numeMastiles = numeMastiles;
    }

    @Override
    public int calcularMoudlo() {
        
        return super.calcularMoudlo() + numeMastiles;
        
    }

}
