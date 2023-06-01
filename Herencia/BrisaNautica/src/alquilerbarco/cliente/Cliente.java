package alquilerbarco.cliente;

public class Cliente {
    
    private String nombre;
    private long documento;

    public Cliente() {
    }

    public Cliente(String nombre, long documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nDocumento: ").append(documento);
        return sb.toString();
    }
    
    
    
}
