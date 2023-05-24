package cineService;

import java.util.Scanner;
import java.util.regex.Pattern;
import model.Cine;
import model.Espectador;
import model.Pelicula;

/**
 *
 * @author QuinSDev
 */
public class CinEggController {

    Pelicula pelicula = new Pelicula();
    Espectador espec = new Espectador();
    Cine cine = new Cine();
    String nombreU = "";

    Scanner read = new Scanner(System.in);

    public void llenarPelicula() {

        pelicula.getPelicula().clear();

        pelicula.setPelicula(new Pelicula("Jhon Wick 4", "Chad Stahelski", 16,
                169));
        pelicula.setPelicula(new Pelicula("Mario Bros", "Michael Jelenic", 7,
                92));
        pelicula.setPelicula(new Pelicula("Rapidos y Furiosos X",
                "Louis Leterrier", 12, 141));
        pelicula.setPelicula(new Pelicula("Maremoto", "John Andreas",
                7, 104));

    }

    public void generarAsiento() {

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        for (Pelicula pelicula1 : pelicula.getPelicula()) {
            Cine[][] sala = new Cine[8][letras.length];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < letras.length; j++) {
                    String num = String.valueOf(i + 1).concat(letras[j]);
                    String letra = " ";
                    sala[i][j] = new Cine(num, letra);
                }
            }
            pelicula1.setSalaC(sala);
        }

    }

    public void registrarUsuario() {

        String nombre = "";
        boolean nombreValido = true;

        do {
            System.out.print("\nIngresa el nombre: ");
            nombre = read.nextLine();
            if (nombre.length() == 1 || nombre.isEmpty()
                    || !Pattern.matches("[a-zA-Z\\s]+", nombre)) {
                System.out.println("-".repeat(30));
                System.out.println(nombre + " no es un nombre válido");
                nombreValido = false;
            } else {
                nombreValido = true;
                espec.setNombre(nombre);
            }

        } while (!nombreValido);

        System.out.print("Ingresa la edad: ");
        espec.setEdad(read.nextInt());
        System.out.print("Ingrese el dinero disponible(USD): ");
        espec.setDineroD(read.nextDouble());
        espec.setEspectador(new Espectador(espec.getNombre(),
                espec.getEdad(), espec.getDineroD()));
        read.nextLine();

    }

    public void ingresarUsuario(CineMenu cineM) {

        if (espec.getEspectador().isEmpty()) {
            System.out.println("\n¡No hay ningún usuario registrado!");
        } else {
            read = new Scanner(System.in);
            System.out.print("\nIngrese el nombre: ");
            nombreU = read.nextLine().toUpperCase();

            boolean encontrado = false;

            for (Espectador espectador : espec.getEspectador()) {
                String nombE = espectador.getNombre().toUpperCase();
                if (nombE.contains(nombreU)) {
                    encontrado = true;
                    cineM.menuUsuario();
                    break;
                }

            }

            if (!encontrado) {
                System.out.println("\n¡Nombre de usuario incorrecto o "
                        + "no está registrado en el sistema!");
            }
        }

    }

    public void mostrarAsientos(String pelic) {

        String pantalla = "Pantalla";
        int anchoP = 25, anchoT = 40;

        int padding = (anchoP - pantalla.length()) / 2;
        int paddginT = (anchoT - anchoP) / 2;

        System.out.format("\n" + "%" + paddginT + "s%s%" + paddginT + "s", "",
                "-".repeat(anchoP), "" + "\n");
        System.out.format("%" + paddginT + "s", "");
        System.out.format("|%" + padding + "s%s%" + (padding - 1) + "s|", "",
                pantalla, "");
        System.out.format("\n" + "%" + paddginT + "s", "");
        System.out.print("-".repeat(anchoP) + "\n");

        System.out.println("");
        for (Pelicula pelicula1 : pelicula.getPelicula()) {
            String peeli = pelicula1.getTitulo().toUpperCase();
            if (peeli.contains(pelic)) {
                for (Cine[][] cineses : pelicula1.getSalaC()) {
                    for (int i = cineses.length - 1; i >= 0; i--) {
                        for (int j = 0; j < cineses[i].length; j++) {
                            if (j == 0) {
                                System.out.format("%" + paddginT
                                        + "s%s", "", " ");
                            }
                            if (j != 5) {
                                System.out.print(cineses[i][j].getNum()
                                        + cineses[i][j].getLetra() + "|");
                            } else {
                                System.out.print(cineses[i][j].getNum()
                                        + cineses[i][j].getLetra());
                            }
                        }
                        System.out.println("");
                    }
                }
            }
        }

    }

    public void mostrarPelicula() {

        System.out.println("");
        int[] longi = {22, 20, 10, 5};
        String[] encabezado = {"| Título", "Director", "Duración", "Edad"};
        String linea = "-".repeat(68);

        System.out.format("%38s", "Cartelera" + "\n");
        System.out.println(linea);

        for (int i = 0; i < encabezado.length; i++) {
            System.out.format("%-" + longi[i] + "s | ", encabezado[i]);

        }
        System.out.println("");

        for (int i = 0; i < encabezado.length; i++) {
            for (int j = 0; j < longi[i]; j++) {
                System.out.print("-");
            }
            if (i != encabezado.length - 1) {
                System.out.print("-+-");
            } else {
                System.out.print("-+\n");
            }
        }

        for (Pelicula pelicula1 : pelicula.getPelicula()) {
            System.out.println(pelicula1);
        }

    }

    public void comprarBoletas() {

        read = new Scanner(System.in);
        double precio = 4;
        boolean pelEncontrada = false;
        String nombP = "";

        for (Espectador espec : espec.getEspectador()) {
            String nombE = espec.getNombre().toUpperCase();
            if (nombE.contains(nombreU)) {

                System.out.println("\nPecio boleta: " + precio);
                System.out.print("-".repeat(40));

                while (!pelEncontrada) {
                    System.out.print("\n¿Qué película quieres ver?: ");
                    nombP = read.nextLine().toUpperCase();
                    for (Pelicula pelicula1 : pelicula.getPelicula()) {
                        String nom = pelicula1.getTitulo().toUpperCase();
                        if (nom.contains(nombP)) {
                            pelEncontrada = true;
                            break;
                        }
                    }
                    if (!pelEncontrada) {
                        System.out.print("-".repeat(40));
                        System.out.println("\n¡Lo sentimos! La "
                                + "película " + nombP + " no se encuentra"
                                + " en cartelera.");
                    }

                }

                System.out.print("¿Cuántas boletas deseas comprar?: ");
                int boleta = read.nextInt();
                double boletF = (precio * boleta);

                for (Pelicula pelicula1 : pelicula.getPelicula()) {
                    String nomPe = pelicula1.getTitulo().toUpperCase();
                    int edadPe = pelicula1.getEdadM();
                    if (nomPe.contains(nombP)) {
                        if (espec.getEdad() >= edadPe) {
                            if (espec.getDineroD() >= boletF) {
                                espec.setDineroD(espec.getDineroD() - boletF);
                                mostrarAsientos(nombP);
                                elegirAsiento(boleta, nombP);
                            } else {
                                System.out.println("\n¡No tienes suficiente "
                                        + "dinero para comprar boletas!");
                            }
                        } else {
                            System.out.println("\n¡No cumples con la edad "
                                    + "mínima requeridad!");
                        }
                    }
                }
            }
        }

    }

    public void elegirAsiento(int entrada, String nombP) {

        String asiento = "";
        read = new Scanner(System.in);

        for (int i = 1; i <= entrada; i++) {

            boolean asientoValido = false, asientoEcontrado = false;

            while (!asientoValido) {
                if (i == 1 && entrada == 1) {
                    System.out.print("\nElija el asiento: ");
                    asiento = read.nextLine();
                    System.out.print("-".repeat(20));
                } else {
                    System.out.print("\nElija el asiento #" + i + ": ");
                    asiento = read.nextLine();
                    System.out.print("-".repeat(23));
                }

                for (Pelicula pel : pelicula.getPelicula()) {
                    String nomb = pel.getTitulo().toUpperCase();
                    if (nomb.contains(nombP)) {
                        for (Cine[][] cineses : pel.getSalaC()) {
                            for (int j = cineses.length - 1; j >= 0; j--) {
                                for (int k = 0; k < cineses[i].length; k++) {
                                    if (cineses[j][k].getNum().equalsIgnoreCase(asiento)) {
                                        asientoEcontrado = true;
                                        if (cineses[j][k].getLetra().equalsIgnoreCase(" ")) {
                                            cineses[j][k].setLetra("X");
                                            System.out.println("\nAsiento asignado");
                                            asientoValido = true;
                                        } else {
                                            System.out.println("\nAsiento ocupado.");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!asientoValido && !asientoEcontrado) {
                    System.out.println("\nNo existe tal asiento");
                }

            }

        }

    }

}
