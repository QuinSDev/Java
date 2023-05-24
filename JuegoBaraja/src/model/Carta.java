package model;

import java.util.HashSet;

/**
 *
 * @author QuinSDev
 */
public class Carta {

    private HashSet<String> palo;
    private HashSet<Integer> numCarta;

    public Carta() {
        palo = new HashSet<>();
        numCarta = new HashSet<>();
    }

    public Carta(String palo, Integer numCarta) {
        this();
        this.palo.add(palo);
        this.numCarta.add(numCarta);
    }

    public HashSet<String> getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo.add(palo);
    }

    public HashSet<Integer> getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(Integer numCarta) {
        this.numCarta.add(numCarta);
    }

    public void llenarCarta() {

        palo.add("Espadas");
        palo.add("Bastos");
        palo.add("Oros");
        palo.add("Copas");

        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
                numCarta.add(i);
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String p : palo) {
            for (int n : numCarta) {
                sb.append(String.format("%-3d de  %s", n, p));
            }
            
        }
        return sb.toString().replaceAll("[\\[\\]]", " ");
    }

}
