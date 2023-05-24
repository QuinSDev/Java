
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baraja {

    private List<Carta> baraja;
    private List<Carta> desbaraja;
    private Carta carta = new Carta();;

    public Baraja() {
        baraja = new ArrayList<>();
        desbaraja = new ArrayList<>();
        
    }

    public Baraja(List<Carta> baraja, List<Carta> desbaraja, Carta carta) {
        this.baraja = baraja;
        this.desbaraja = desbaraja;
        this.carta = carta;
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    public List<Carta> getDesbaraja() {
        return desbaraja;
    }

    public void setDesbaraja(List<Carta> desbaraja) {
        this.desbaraja = desbaraja;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    Scanner read = new Scanner(System.in);
    
    public void menuBaraja() {
        carta.llenarCarta();
        llenarBaraja();
        int opc = 0;
        
            System.out.println("************************************");
            System.out.println("* Bienvenido a Atraco en la Baraja *");
            System.out.println("************************************");
        do {

           
            System.out.println("\n          Menú de Opciones          ");
            System.out.println("------------------------------------");
            System.out.println("|      1. - Barajar                |");
            System.out.println("|      2. - Siguiente Carta        |");
            System.out.println("|      3. - Cartas Disponibles     |");
            System.out.println("|      4. - Pedir Cartas           |");
            System.out.println("|      5. - Mostrar Montón         |");
            System.out.println("|      6. - Mostrar Baraja         |");
            System.out.println("|      7. - Salir                  |");
            System.out.println("------------------------------------\n");

            System.out.print("Elija una opción: ");
            opc = read.nextInt();
            System.out.println("-------------------");
            
            switch(opc) {
                case 1:
                    barajar();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCarta();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción incorrecta... "
                            + "Intentalo nuevamente");
                        break;
            }
        } while (opc != 7);
    }
    

    public void llenarBaraja() {
        for (String string : carta.getPalo()) {
            for (Integer integer : carta.getNumCarta()) {
                baraja.add(new Carta(string, integer));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {
        
        if (baraja.size() < 1) {
            System.out.println("¡No quedan más cartas! No insista...");
        } else {
            System.out.println("Su carta es: " + baraja.get(0) + "");
            desbaraja.add(baraja.get(0));
            baraja.remove(0);
        }
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + baraja.size());
    }

    public void darCarta() {
        System.out.print("¿Cuantas cartas deseas que te demos?: ");
        int dar = read.nextInt();
        int i = 0;
        if (baraja.size() < dar) {
            System.out.println("No le podemos dar el número de cartas... "
                    + "la baraja no tiene suficientes cartas para repartir.");
        } else {
            do {
                siguienteCarta();
                i++;
            } while (i < dar);
        }
    }

    public void cartasMonton() {
        if (desbaraja.size() == 0) {
            System.out.println("No ha salido ninguna Carta");
        } else {
            for (Carta carta1 : desbaraja) {
                System.out.println(carta1.toString());
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta carta1 : baraja) {
            System.out.println(carta1.toString());
        }
    }
}
