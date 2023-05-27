package domain;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private int carga;
    private String nombre = "Lavadora";

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, double precioTotal, String color,
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

        System.out.print("Ingrese el peso: ");
        this.peso = read.nextDouble();
        System.out.print("Ingrese la carga máxima: ");
        this.carga = read.nextInt();

        read.nextLine();

        precioFinal();
        

    }

    @Override
    protected double precioFinal() {

        super.precioFinal();

        if (carga > 30) {
            this.precio += 500;
        }
        
        return this.precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        String pesoFormatt = String.format("%-3.0f", peso);
        String pesoFor = pesoFormatt.concat(" kg");
        String precioFormatt = String.format("%-1.2f", precio);
        String precioFOr = "$".concat(precioFormatt);
        

        sb.append(String.format("| %-20s | %-10s | %-12c | %-8s | "
                + "%-12s | %-6s | %-8s |", nombre,
                color, consumoEnergetico, pesoFor, "", "", precioFOr));
        sb.append("\n+----------------------+------------+--------------"
                + "+----------+--------------+--------+----------+");
        return sb.toString();
    }

}
