package service;

import domain.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DomesticManager {

    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();
    ArrayList<Electrodomestico> electros = new ArrayList<>();

    Scanner read = new Scanner(System.in);

    public void electroCreate() {
            
        lavadora.crearLavadora(read);
        televisor.crearTelevisor(read);
        
        electros.add(lavadora);
        electros.add(televisor);
        
        for (Electrodomestico electro : electros) {
            if (electro instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electro;
                imprimir(lavadora);
                continue;
            }
            
            if (electro instanceof Televisor) {
                Televisor televisor = (Televisor) electro;
                imprimir(televisor);
                continue;
            }
            
        }

    }
    
    public void imprimir(Electrodomestico electro) {
        
        System.out.println(electro);
    }

}
