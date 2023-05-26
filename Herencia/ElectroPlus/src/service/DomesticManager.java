package service;

import domain.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DomesticManager {

    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();
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
        
        for (Electrodomestico electro : electros) {
            System.out.println(electro);
        }
        
    }

}
