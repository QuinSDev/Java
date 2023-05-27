package alquilerbarcos.model;

import java.time.LocalDate;

public final class BarcoMotor extends Barco{
    
    private int potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(int potencia, String matricula, int metros, 
            LocalDate anioFabricacion) {
        super(matricula, metros, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int calcularMoudlo() {
        
        return super.calcularMoudlo() + this.potencia;
        
    }

}
