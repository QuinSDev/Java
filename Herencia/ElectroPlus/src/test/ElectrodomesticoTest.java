package test;

import domain.*;

public class ElectrodomesticoTest {
    
    public static void main(String[] args) {
        
        Electrodomestico elecotrodomestico = new Electrodomestico();
//        elecotrodomestico.crearElectrodomestico();
//        imprimir(elecotrodomestico);
        
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        imprimir(lavadora);
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        imprimir(televisor);
        
        
    }
    
    public static void imprimir(Electrodomestico electrodomestico){
        
        System.out.println(electrodomestico.toString());
        
    }
    
}
