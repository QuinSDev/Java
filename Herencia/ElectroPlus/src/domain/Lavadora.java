package domain;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    
    private int carga;

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
    
    public void crearLavadora() {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Lavadora\n");
        
        crearElectrodomestico();
        
        System.out.print("Ingrese la carga máxima:");
        this.carga = read.nextInt();
        
        precioFinal();
        
    }

    @Override
    public void precioFinal() {
        
        super.precioFinal();
        
        if (carga > 30) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Electrodomestico \nPrecio:").append(precio);
        sb.append("\nColor:").append(color);
        sb.append("\nConsumo Energético: ").append(consumoEnergetico);
        sb.append("\nPeso:").append(peso);
        sb.append("\nCarga: ").append(carga);
        return  sb.toString();
    }
 
}
