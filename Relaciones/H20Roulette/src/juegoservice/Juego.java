package juegoservice;

import java.util.ArrayList;
import java.util.HashSet;
import model.Jugador;
import model.Revolver;

/**
 *
 * @author QuinSDev
 */
public class Juego {
    
    private HashSet<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }    
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        
       this.jugadores = new HashSet<>(jugadores);
       this.revolver = r;
       
       
    }
    
    public void ronda() {
        
        for (Jugador jugador : jugadores) {
            System.out.println("Turno de: " + jugador.getNombre());
            if (jugador.disparo(revolver)) {
                System.out.println(jugador.getNombre() + " se ha mojado.");
                break;
            }
            System.out.println("");
        }
        
    }
}
