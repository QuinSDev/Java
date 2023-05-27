package model;

public class Rectangulo implements CalculosFormas{
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return (int) (base * altura);
    }

    @Override
    public int calcularPerimetro() {
        return (int) ((base + altura) * 2);
    }
    
    
    
}
