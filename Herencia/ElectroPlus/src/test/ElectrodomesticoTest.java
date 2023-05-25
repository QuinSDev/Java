package test;

import domain.*;
import service.DomesticManager;

public class ElectrodomesticoTest {
    
    public static void main(String[] args) {
        
//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//        imprimir(lavadora);
//        Televisor televisor = new Televisor();
//        televisor.crearTelevisor();
//        imprimir(televisor);

            DomesticManager domes = new DomesticManager();
            domes.electroCreate();
        
        
    }
    
//    public static void imprimir(Electrodomestico electrodomestico){
//        
//        System.out.println(electrodomestico);
//        
//    }
    
}
