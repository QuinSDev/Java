package alquilerbarcos.model;

import java.time.LocalDate;

public final class Yate extends Barco{
    
    private int potencia;
    private int numCamarotes;

    public Yate() {
    }

    public Yate(int potencia, int numCamarotes, String matricula, int metros, 
            LocalDate anioFabricacion) {
        super(matricula, metros, anioFabricacion);
        this.potencia = potencia;
        this.numCamarotes = numCamarotes;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public int calcularMoudlo() {
        
        return super.calcularMoudlo() + (this.potencia + this.numCamarotes); 
        
    }

}
