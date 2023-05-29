package alquilerbarcos.barco;

import java.time.LocalDate;

public final class Velero extends Barco{
    
    private int numeMastiles;
    
    public Velero() {
        
    }
    
    public Velero(String nombre, String matricula, int eslora, 
            LocalDate anioFabricacion, int numeMastiles) {
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
