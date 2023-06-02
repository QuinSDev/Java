package alquilerbarco.cliente;

import alquilerbarco.barco.Barco;
import java.util.ArrayList;

public class Cliente {
    
    private String nombre;
    private long documento;
    private ArrayList<Barco> listB = new ArrayList<>();;

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

    public ArrayList<Barco> getListB() {
        return listB;
    }

    public void setListB(Barco listB) {
        this.listB.add(listB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nDocumento: ").append(documento);
        return sb.toString();
    }
    
    
    
}
