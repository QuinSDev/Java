package domain;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private int carga;
    private String nombre = "Lavadora";

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
        this.precioTotal = 0;
    }

    public Lavadora(int carga, double precio, double precioTotal, String color,
            char consumoEnergetico, double peso) {
        super(precio, precioTotal, color, consumoEnergetico, peso);
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

//        System.out.println("\nLavadora\n");
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
        this.precioTotal += precio;
        return this.precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("| %-20s | %-10s | %-12c | %-8.0f | "
                + "%-12s | %-6s | %-8.2f |", nombre,
                color, consumoEnergetico, peso, "", "", precio));
        sb.append("\n+----------------------+------------+--------------"
                + "+----------+--------------+--------+----------+");
        return sb.toString();
    }

}
