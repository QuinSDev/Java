package domain;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico{
    
    private int carga;
    private String nombre = "Lavadora";

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, 
            char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void crearLavadora(Scanner read) {
        
        crearElectrodomestico(read);
        
        System.out.print("Ingrese la carga máxima: ");
        this.carga = read.nextInt();
        read.nextLine();
        
        precioFinal();
        
    }

    @Override
    protected void precioFinal() {
        
        super.precioFinal();
        
        if (carga > 30) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nLavadora \nPrecio: $").append(precio);
        sb.append("\nColor: ").append(color);
        sb.append("\nConsumo Energético: ").append(consumoEnergetico);
        sb.append("\nPeso: ").append(peso).append(" kg");
        sb.append("\nCarga: ").append(carga);
        sb.append("\n");
        return  sb.toString();
    }
 
}
