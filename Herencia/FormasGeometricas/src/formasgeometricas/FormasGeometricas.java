package formasgeometricas;

import model.Circulo;

public class FormasGeometricas {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(4, 8);
        
        System.out.println("�rea del c�rculo: " + circulo.calcularArea());
        
    }
    
}
