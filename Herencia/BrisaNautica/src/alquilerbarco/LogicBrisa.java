package alquilerbarco;

import alquilerbarco.cliente.Cliente;
import alquilerbarco.cliente.ListCliente;
import java.util.Scanner;

public class LogicBrisa {
    
    Cliente cliente = new Cliente();
    ListCliente listCliente = new ListCliente();
    Scanner read = new Scanner(System.in);
    
    public void customerRegister() {
        
        System.out.println("");
        System.out.print("Nombre: ");
        cliente.setNombre(read.nextLine());
        System.out.print("Documento: ");
        cliente.setDocumento(read.nextLong());
        read.nextLine();
        
        listCliente.setListCliente(new Cliente(cliente.getNombre(), 
                cliente.getDocumento()));
        
    }
    
    public void showCustomer() {
        
        for (Cliente cliente1 : listCliente.getListCliente()) {
            System.out.println(cliente1);
        }
        
    }
    
}
