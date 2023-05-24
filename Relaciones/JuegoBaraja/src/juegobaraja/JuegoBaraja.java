package juegobaraja;

import model.Baraja;
import model.Carta;

/**
 *
 * @author QuinSDev
 */
public class JuegoBaraja {
    public static void main(String[] args) {
        
        Carta carta = new Carta();
        Baraja baraja = new Baraja();
        
        baraja.llenarBaraja();
        baraja.mostrarBaraja();
        
        baraja.menuBaraja();
        
    }
    
}
