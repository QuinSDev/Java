package domain;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;
    private String nombre = "Televisor", valBol = "";

    public Televisor() {
        this.precioTotal = 0;
    }

    public Televisor(double resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio,
            double precioTotal, String color, char consumoEnergetico, 
            double peso) {
        super(precio, precioTotal, color, consumoEnergetico, peso);
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

        crearElectrodomestico(read);

        System.out.print("Ingrese la resolución: ");
        this.resolucion = read.nextDouble();
        read.nextLine();
        System.out.print("¿Lleva TDT?(si/no): ");
        valBol = read.nextLine();

        if (valBol.equalsIgnoreCase("si")) {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }

        precioFinal();
        

    }

    @Override
    protected double precioFinal() {
        super.precioFinal();

        if (this.resolucion > 40) {
            this.precio *= 1.3;
        }

        if (this.sintonizadorTDT) {
            this.precio += 500;
        }
        setPrecioTotal(getPrecioTotal() + this.precio);

        return this.precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("| %-20s | %-10s | %-12c | %-8s | "
                + "%-12.0f | %-6s | %-8.2f |", nombre,
                color, consumoEnergetico, "", resolucion, valBol,
                precio));
        sb.append("\n+----------------------+------------+--------------"
                + "+----------+--------------+--------+----------+");
        return sb.toString();
    }

}
