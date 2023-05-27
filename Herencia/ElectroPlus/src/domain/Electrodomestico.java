package domain;

import java.util.Scanner;

public class Electrodomestico implements Caracteristica{
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        
    }

    public Electrodomestico(double precio, String color, 
            char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void comprobarConsumoEnegertico(char letra) {
        
        char[] letras = {'A','B','C','D','E','F'};
        boolean encontrado = false;
        
        for (char m : letras) {
             String letter = String.valueOf(letra);
            String letter1 = String.valueOf(m);
            if (letter.equalsIgnoreCase(letter1)) {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
        
    }

    @Override
    public void comprobarColor(String color) {
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean encontrado = false ;
        
        for (String colore : colores) {
            if (colore.equalsIgnoreCase(color)) {
                encontrado = true;
            }
        }
        
        if (encontrado) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }
    }
    
    public void crearElectrodomestico(Scanner read) {
        
        System.out.print("\nIngrese el color deseado: ");
        this.color = read.nextLine();
        comprobarColor(color);
        System.out.print("Ingrese el consumo energético: ");
        this.consumoEnergetico = read.nextLine().toUpperCase().charAt(0);
        comprobarConsumoEnegertico(consumoEnergetico);
        this.precio = 1000;
        
    }

    protected double precioFinal() {
        switch(consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        }
        
        if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        }
        
        if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        }
        
        if (this.peso >= 80) {
            this.precio += 1000;
        }
        
        return this.precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
       sb.append(String.format("| %-20s | %-10s | %-12c | %-8s | "
               + "%-12s | %-6s | %-8.2f |", "",
                color, consumoEnergetico, "", "", "", precio));
        sb.append("\n+----------------------+------------+--------------"
                + "+----------+--------------+--------+----------+");
        return sb.toString();
    }
}
