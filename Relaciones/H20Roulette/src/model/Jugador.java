package model;

import java.util.Scanner;

/**
 *
 * @author QuinSDev
 */
public class Jugador {
    
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        if (id < 1 || id > 6) {
            this.id = 6;
        }
        
        this.id = id;
        this.nombre = nombre + " " + id;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    public boolean disparo(Revolver r) {
        
        Scanner read = new Scanner(System.in);
        String jalar = "";
        do {
            
            System.out.print("Jalar el gatillo (s): ");
            jalar = read.nextLine();
            
            if (jalar.equalsIgnoreCase("s")) {
                if (r.mojar()) {
                    mojado = true;
                    break;
                } else {
                    mojado = false;
                    r.siguenteChorro();
                    break;
                } 
            }
            
        } while (!jalar.equalsIgnoreCase("s"));
        
        return mojado;
        
    }
    
}
