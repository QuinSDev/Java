package alquilerbarco.barco;

public class Barco {
    
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
    
}
