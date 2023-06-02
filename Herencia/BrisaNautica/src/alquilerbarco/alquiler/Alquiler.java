package alquilerbarco.alquiler;

import alquilerbarco.Menu;
import alquilerbarco.barco.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class Alquiler {

    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private ListBarco lisB = new ListBarco();
    private ArrayList<Barco> listBarco = new ArrayList<>();
    private Puerto puerto = new Puerto();

    Scanner read = new Scanner(System.in);

    public double precioAlquiler(Barco barco) {

        Period period = Period.between(fechaAlquiler, fechaDevolucion);
        double precioFinal = period.getDays() * barco.calcularModulo();
        return precioFinal;

    }

    public void buscarBarco(Menu menu) {

        System.out.print("\nIngrese la matrícula del barco: ");
        String matricula = read.nextLine();

        boolean encontrado = false;
        double preciofinal = 0;

        for (Barco barco1 : lisB.getListBarco()) {
            if (barco1.getMatricula().equalsIgnoreCase(matricula)) {
                fecha();
                preciofinal = precioAlquiler(barco1);
                listBarco.add(barco1);
                menu.getClienSeleccionado().setListB(barco1);
                lisB.getListBarco().remove(barco1);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nEsa matrícula no se encuentra en "
                    + "nuestro sistema");
        } else {
            posicionAmarre();
            System.out.println("El precio del alquiler del barco es de: $"
                    + preciofinal);
        }

    }

    public void posicionAmarre() {

        System.out.print("\nIngrese la posición del amarre: ");
        posicionAmarre = read.nextLine();

        puerto.validarPuerto(posicionAmarre);
        puerto.dibujarPuerto();

    }

    public void fecha() {

        System.out.print("Ingresa la fecha de alquiler(YYYY-MM-DD): ");
        fechaAlquiler = LocalDate.parse(read.nextLine());
        System.out.print("Ingresa la fecha de devolución(YYYY-MM-DD): ");
        fechaDevolucion = LocalDate.parse(read.nextLine());

    }

}
