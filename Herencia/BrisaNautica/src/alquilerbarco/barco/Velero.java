package alquilerbarco.barco;

public final class Velero extends Barco {
    
    private int numMastil;

    public Velero() {
    }

    public Velero(String nombre, String matricula, int eslora, 
            int anioFabricacion, int numMastil) {
        super(nombre, matricula, eslora, anioFabricacion);
        this.numMastil = numMastil;
    }

    public int getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(int numMastil) {
        this.numMastil = numMastil;
    }

    @Override
    public int calcularModulo() {
        
        return super.calcularModulo() + this.numMastil;
        
    } 
    
}
