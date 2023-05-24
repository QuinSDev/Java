package h20roulette;

import java.util.ArrayList;
import juegoservice.Juego;
import model.Jugador;
import model.Revolver;

/**
 *
 * @author QuinSDev
 */
public class H20Roulette {

    public static void main(String[] args) {
        
        Juego juego = new Juego();
        Revolver r = new Revolver();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        r.llenarRevolver();
        
        jugadores.add(new Jugador(1,"Sebastian", false));
        jugadores.add(new Jugador(2,"Edwar", false));
        jugadores.add(new Jugador(3,"Camilo", false));
        jugadores.add(new Jugador(4,"Irina", false));
        jugadores.add(new Jugador(5,"Jhon", false));
        jugadores.add(new Jugador(6,"Reyna", false));
        
        
        juego.llenarJuego(jugadores, r);
        juego.ronda();
        
    }
    
}
