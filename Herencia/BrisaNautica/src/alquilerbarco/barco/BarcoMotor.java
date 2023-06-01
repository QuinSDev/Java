package alquilerbarco.barco;

public final class BarcoMotor extends Barco{
    
    private String tipo = "Barco motor";
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        String esloraFormatted = String.format("%-3d", eslora);
        String eslora = esloraFormatted.concat("mts");
        String potenciaFormatted = String.format("%-4d", potenciaCV);
        String potenciaCV = potenciaFormatted.concat("CV");
        
        String ano = String.valueOf(anioFabricacion);
        int padding =(20 - ano.length()) / 2;
        String anio = String.format("%" + padding + "s%s%" + padding + "s", "",
                ano, "");
        
        int paddingP = (14 - potenciaCV.length()) / 2;
        String potencia = String.format("%" + paddingP + "s%s%" + paddingP + "s",
                "", potenciaCV, "");
        
        sb.append(String.format("| %-8s | %-15s | %-12s | %-8s | %20s | "
                + "%-14s | %-10s | %-12s |", tipo, nombre, matricula,eslora,
                anio, potencia, "", ""));
        
        return sb.toString();
    }
    
    
    
}
