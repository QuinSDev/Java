package alquilerbarco.cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCliente {
    
    private ArrayList<Cliente> listCliente;
    private Cliente cliente;

    public ListCliente() {
        listCliente = new ArrayList<>();
        cliente  = new Cliente();
    }

    public ListCliente(ArrayList<Cliente> listCliente) {
        this.listCliente = listCliente;
    }

    public ArrayList<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(Cliente listCliente) {
        this.listCliente.add(listCliente);
    }
    
    public Cliente buscarCliente(long document) {
        
        for (Cliente cliente : listCliente) {
            if (cliente.getDocumento() == document) {
                return cliente;
            }
        }
        return null;
        
    }
    
    public void registerCustomer() {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("\nIngrese el nombre: ");
        cliente.setNombre(read.nextLine());
        System.out.print("Ingrese el documento: ");
        cliente.setDocumento(read.nextLong());
        
        listCliente.add(new Cliente(cliente.getNombre(), 
                cliente.getDocumento()));
        
    }
    
    public void showCustomer() {
        
        for (Cliente cliente1 : listCliente) {
            System.out.println(cliente1);
        }
        
    }
    
}
