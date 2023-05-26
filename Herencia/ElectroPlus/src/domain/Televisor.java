package domain;

import java.util.Scanner;

public final class Televisor extends Electrodomestico{
    
    private double resolucion;
    private boolean sintonizadorTDT;
    private String nombre = "Televisor";

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void crearTelevisor(Scanner read) {
        
        
        System.out.println("\nTelevisor\n");
        
        crearElectrodomestico(read);
        
        System.out.print("Ingrese la resolución: ");
        this.resolucion = read.nextDouble();
        System.out.print("¿Lleva TDT?(true/false): ");
        this.sintonizadorTDT = read.nextBoolean();
        read.nextLine();
        
//        if (this.resolucion >= 40) {
//            this.sintonizadorTDT = true;
//        } else {
//            this.sintonizadorTDT = false;
//        }
//        
        precioFinal();
        
    }

    @Override
    protected void precioFinal() {
        super.precioFinal();
        
        if (this.resolucion > 40) {
            this.precio *= 1.3;
        }
        
        if (this.sintonizadorTDT) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
        sb.append("\nTelevisor \nPrecio: $").append(precio);
        sb.append("\nColor: ").append(color);
        sb.append("\nConsumo Energético: ").append(consumoEnergetico);
        sb.append("\nPeso: ").append(peso);
        sb.append("\nResolución: ").append(resolucion);
        sb.append("\nSintonización TDT: ").append(sintonizadorTDT);
        return  sb.toString();
    }
    
    
    
}
