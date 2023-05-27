package formasgeometricas;

import model.Circulo;
import model.Rectangulo;

public class FormasGeometricas {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(4, 8);
        Rectangulo rec = new Rectangulo(10, 5);
        
        
        System.out.println("�rea del c�rculo: " + circulo.calcularArea());
        System.out.println("Per�metro del c�rculo: " + circulo.calcularPerimetro());
        System.out.println("�rea del rect�ngulo: " +  rec.calcularArea());
        System.out.println("Per�metro del rect�ngulo: " + rec.calcularPerimetro());
        
    }
    
}
