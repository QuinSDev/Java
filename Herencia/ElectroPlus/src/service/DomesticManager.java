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
            
        
        if (lavadora.getNombre().equalsIgnoreCase(product)) {
            lavadora.crearLavadora(read);
            electros.add(lavadora);
        }
        
        if (televisor.getNombre().equalsIgnoreCase(product)) {
            televisor.crearTelevisor(read);
            electros.add(televisor);
        }

    }
    
    public void imprimir() {
        
        int ancho = 98;
        
        int[] longi = {22, 10, 12, 8, 12, 6, 8};
        String[] tabla = {"| Producto", "Color", "Consumo E.", "Peso",
            "Resolución", "TDT", "Precio"};
        
        System.out.println("\n"+"-".repeat(ancho));
        for (int i = 0; i < tabla.length; i++) {
            System.out.format("%-" + longi[i] + "s | ", tabla[i]);
        }
        
        System.out.println("");

        for (int i = 0; i < tabla.length; i++) {
            
            for (int j = 0; j < longi[i]; j++) {
                System.out.print("-");
            }
            if (i != tabla.length - 1) {
                System.out.print("-+-");
            } else {
                System.out.print("-+\n");
            }
        }
        
        for (Electrodomestico electro : electros) {
            System.out.println(electro);
        }
        
        System.out.format("| %-20s %-10s %-12s %-8s "
                + "%-12s %-6s %-8.2f |", "", "", "", "", "", "", 
                elec.getPrecioTotal());
        System.out.println("\n"+"-".repeat(ancho));
        
        System.out.println("");
        
    }

}
