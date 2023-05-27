package model;

public class Circulo implements CalculosFormas{
    
    public double radio;
    public double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    

    @Override
    public int calcularArea() {
        return (int) (PI * Math.pow(radio, 2));
    }

    @Override
    public int calcularPerimetro() {
        return (int) (PI * diametro);
    }
    
}
