package formasgeometricas;

import model.Circulo;
import model.Rectangulo;

public class FormasGeometricas {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(4, 8);
        Rectangulo rec = new Rectangulo(10, 5);
        
        
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Área del rectángulo: " +  rec.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rec.calcularPerimetro());
        
    }
    
}
