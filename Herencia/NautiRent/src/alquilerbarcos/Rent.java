package alquilerbarcos;

import alquilerbarcos.cliente.*;
import java.util.Scanner;

public class Rent {
    
    Cliente cliente = new Cliente();
    CustomerList list = new CustomerList();
    Scanner read = new Scanner(System.in);
    
    public void customerRegister() {
        
        System.out.println("");
        System.out.print("Nombre: ");
        cliente.setNombre(read.nextLine());
        System.out.print("Documento: ");
        cliente.setDocumento(read.nextLong());
        read.nextLine();
        list.setListCustomer(cliente);
        
        
    }
    
    public void barcosDisponibles() {
        
       
        
    }
    
}
