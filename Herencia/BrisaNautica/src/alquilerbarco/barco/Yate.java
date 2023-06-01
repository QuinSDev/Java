package alquilerbarco.barco;

public final class Yate extends Barco {

    private String tipo = "Yate";
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String esloraFormatted = String.format("%-3d", eslora);
        String eslora = esloraFormatted.concat("mts");
        String potenciaFormatted = String.format("%-4d", potenciaCV);
        String potenciaCV = potenciaFormatted.concat("CV");

        String ano = String.valueOf(anioFabricacion);
        int padding = (20 - ano.length()) / 2;
        String anio = String.format("%" + padding + "s%s%" + padding + "s", "",
                ano, "");

        int paddingP = (14 - potenciaCV.length()) / 2;
        String potencia = String.format("%" + paddingP + "s%s%" + paddingP + "s",
                "", potenciaCV, "");
        
        String cam = String.valueOf(numCamorotes);
        int paddinC = (12 - cam.length()) / 2;
        String camarote = String.format("%" + paddinC + "s%s%" + paddinC + "s", 
                "", cam, "");

        sb.append(String.format("| %-11s | %-15s | %-12s | %-8s | %20s | "
                + "%-14s | %-10s | %-12s |", tipo, nombre, matricula, eslora,
                anio, potencia, "", camarote));

        return sb.toString();
    }

}
