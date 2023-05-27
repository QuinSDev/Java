package test;

import alquilerbarcos.Alquiler;
import alquilerbarcos.model.Barco;
import java.time.LocalDate;
import java.util.Scanner;

public class NautiRent {
    
    public static void main(String[] args) {
        
        Alquiler alquiler = new Alquiler();
        Barco barco = new Barco("fafafa", 30, LocalDate.of(1997, 5, 15));
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        alquiler.setNombre(read.nextLine());
        System.out.print("Documento: ");
        alquiler.setDocumento(read.nextLong());
        read.nextLine();
        System.out.print("Fecha Alquilar(YYYY-MM-DD): ");
        alquiler.setFechaAlquiler(LocalDate.parse(read.nextLine()));
        System.out.print("Fecha Devolución(YYYY-MM-DD): ");
        alquiler.setFechaDevolucion(LocalDate.parse(read.nextLine()));
        System.out.print("Posición de amarre: ");
        alquiler.setPosicionAmarre(read.nextLine());
        alquiler.setBarco(barco);
        
        alquiler.alquilar();
        
        
    }
    
}
