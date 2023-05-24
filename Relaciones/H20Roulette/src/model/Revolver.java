package model;

/**
 *
 * @author QuinSDev
 */
public class Revolver {
    
    private int posiActual, posiAgua;

    public Revolver() {
    }

    public Revolver(int posiActual, int posiAgua) {
        this.posiActual = posiActual;
        this.posiAgua = posiAgua;
    }

    
    public void llenarRevolver() {
        
        posiActual = (int) (Math.random() * 6) + 1;
        posiAgua = (int) (Math.random() * 6) + 1;
        
    }
    
    public boolean mojar() {
        
        return posiActual == posiAgua;
    }
    
    public int siguenteChorro() {
        
        if (posiActual > 6) {
            posiActual = 1;
        }
        
        return posiActual++;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revolver De Agua \nPosición Actual: ").append(posiActual);
        sb.append("\nPosición Agua: ").append(posiAgua);
        return sb.toString();
    }  
    
}
