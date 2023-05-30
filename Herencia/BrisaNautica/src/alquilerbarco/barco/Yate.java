package alquilerbarco.barco;

public final class Yate extends Barco{
    
    private int potenciaCV;
    private int numCamorotes;

    public Yate() {
    }

    public Yate(String nombre, String matricula, int eslora, int anioFabricacion,
            int potenciaCV, int numCamorotes) {
        super(nombre, matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamorotes = numCamorotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamorotes() {
        return numCamorotes;
    }

    public void setNumCamorotes(int numCamorotes) {
        this.numCamorotes = numCamorotes;
    }

    @Override
    public int calcularModulo() {
        
        return super.calcularModulo() + (this.numCamorotes + (this.potenciaCV));
        
    }
    
}
