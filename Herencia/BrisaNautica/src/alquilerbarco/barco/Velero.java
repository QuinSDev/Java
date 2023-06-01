package alquilerbarco.barco;

public final class Velero extends Barco {
    
    private String tipo = "Velero";
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String esloraFormatted = String.format("%-3d", eslora);
        String eslora = esloraFormatted.concat("mts");

        String ano = String.valueOf(anioFabricacion);
        int padding = (20 - ano.length()) / 2;
        String anio = String.format("%" + padding + "s%s%" + padding + "s", "",
                ano, "");
        
        String mas = String.valueOf(numMastil);
        int paddginM = (10 - mas.length()) / 2;
        String mastil = String.format("%" + paddginM + "s%s%" + paddginM + "s", 
                "", mas, "");

        sb.append(String.format("| %-11s | %-15s | %-12s | %-8s | %20s | "
                + "%-14s | %-10s | %-12s |", tipo, nombre, matricula, eslora,
                anio, "", mastil, ""));

        return sb.toString();
    }

}
