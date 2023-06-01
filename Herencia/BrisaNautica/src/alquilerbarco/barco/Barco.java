package alquilerbarco.barco;

public class Barco {
    
    protected String tipo = "Normal";
    protected String nombre, matricula;
    protected int eslora, anioFabricacion;

    public Barco() {
    }

    public Barco(String nombre, String matricula, int eslora, int anioFabricacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    public int calcularModulo() {
        
        return this.eslora * 10;
                
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        String esloraFormatted = String.format("%-3d", eslora);
        String eslora = esloraFormatted.concat("mts");
        
        String ano = String.valueOf(anioFabricacion);
        int padding =(20 - ano.length()) / 2;
        String anio = String.format("%" + padding + "s%s%" + padding + "s", "",
                ano, "");
        
        sb.append(String.format("| %-11s | %-15s | %-12s | %-8s | %20s | "
                + "%-14s | %-10s | %-12s |", tipo, nombre, matricula,eslora,
                anio, "", "", ""));
        
        return sb.toString();
    }
    
    
    
}
