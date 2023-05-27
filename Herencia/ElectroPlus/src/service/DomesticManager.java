package service;

import domain.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DomesticManager {

    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();
    Electrodomestico elec = new Electrodomestico();
    ArrayList<Electrodomestico> electros = new ArrayList<>();

    Scanner read = new Scanner(System.in);

    public void electroCreate(String product) {

        boolean nombreValido = false;

        do {
            if (lavadora.getNombre().equalsIgnoreCase(product)) {
                lavadora.crearLavadora(read);
                electros.add(lavadora);
                nombreValido = true;
            }

            if (televisor.getNombre().equalsIgnoreCase(product)) {
                televisor.crearTelevisor(read);
                electros.add(televisor);
                nombreValido = true;
            }

            if (!nombreValido) {
                System.out.println("Nombre de producto inválido. Por favor, "
                        + "ingresa un nombre válido.");
                System.out.print("\n¿Qué producto deseas registrar?: ");
                product = read.nextLine();
            }
        } while (!nombreValido);

    }

    public void imprimir() {

        int ancho = 112;
        double precioTo = 0;

        int[] longi = {22, 10, 12, 8, 11, 12, 6, 8};
        String[] tabla = {"| Producto", "Color", "Consumo E.", "Peso", 
            "Carga Max.", "Resolución", "TDT", "Precio"};

        System.out.println("\n" + "-".repeat(ancho));
        for (int i = 0; i < tabla.length; i++) {
            System.out.format("%-" + longi[i] + "s | ", tabla[i]);
        }

        System.out.println("");

        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < longi[i]; j++) {
                if (j == 0 && i == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }

            }
            if (i != tabla.length - 1) {
                System.out.print("-+-");
            } else {
                System.out.print("-+\n");
            }
        }

        for (Electrodomestico electro : electros) {
            System.out.println(electro);
            precioTo += electro.getPrecio();
        }

        String messagePrecio = "PRECIO TOTAL";
        
        String precioFormatt = String.format("%-1.2f", precioTo);
        String precioFOr = "$".concat(precioFormatt);

        int paddginP = 87 / 2;

        System.out.format("|%" + paddginP + "s%s%" + paddginP + "s | %-8s |",
                "", messagePrecio, "", precioFOr);
        System.out.println("\n" + "-".repeat(ancho));

        System.out.println("");

    }

}
