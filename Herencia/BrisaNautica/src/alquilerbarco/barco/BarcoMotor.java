package alquilerbarco.barco;

public final class BarcoMotor extends Barco{
    
    private int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(String nombre, String matricula, 
            int eslora, int anioFabricacion, int potenciaCV) {
        super(nombre, matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public int calcularModulo() {
        
        return super.calcularModulo() + this.potenciaCV;
        
    }
    
}
