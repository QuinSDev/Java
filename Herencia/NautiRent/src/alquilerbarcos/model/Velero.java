package alquilerbarcos.model;

import java.time.LocalDate;

public final class Velero extends Barco{
    
    private int numeMastiles;

    public Velero(int numeMastiles, String matricula, int metros, 
            LocalDate anioFabricacion) {
        super(matricula, metros, anioFabricacion);
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
