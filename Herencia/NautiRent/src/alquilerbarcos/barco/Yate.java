package alquilerbarcos.barco;

import java.time.LocalDate;

public final class Yate extends Barco{
    
    private int potencia;
    private int numCamarotes;

    public Yate() {
    }

    public Yate( String nombre, String matricula, int eslora, 
            LocalDate anioFabricacion, int potencia, int numCamarotes) {
        super(nombre, matricula, eslora, anioFabricacion);
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
