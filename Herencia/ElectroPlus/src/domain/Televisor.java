package domain;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    
    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, 
            String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    public void crearTelevisor() {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Televisor\n");
        
        crearElectrodomestico();
        
        System.out.print("Ingrese la resoluci�n: ");
        this.resolucion = read.nextDouble();
        
        if (this.resolucion >= 40) {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }
        
        precioFinal();
        
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if (this.resolucion > 40) {
            this.precio = (this.precio * 0.30);
        }
        
        if (this.sintonizadorTDT) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
        sb.append("Lavadora \nPrecio: ").append(precio);
        sb.append("\nColor: ").append(color);
        sb.append("\nConsumo Energ�tico: ").append(consumoEnergetico);
        sb.append("\nPeso: ").append(peso);
        sb.append("\nResoluci�n: ").append(resolucion);
        sb.append("\nSintonizaci�n TDT: ").append(sintonizadorTDT);
        return  sb.toString();
    }
    
    
    
}