package alquilerbarco.cliente;

import alquilerbarco.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class ListCliente {
    
    private ArrayList<Cliente> listCliente;
    private Cliente cliente;
    Scanner read = new Scanner(System.in);

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
    
    public void enterCustomer(Menu menu) {
        
        if (listCliente.isEmpty()) {
            System.out.println("\n¡No hay ningún cliente registrado!");
        } else {
            
            System.out.print("\nIngrese el documento: ");
            int docu = read.nextInt();
            
            boolean encontrado = false;
            
            for (Cliente cliente1 : listCliente) {
                if (cliente1.getDocumento() == docu) {
                    encontrado = true;
                    menu.menuAlquiler();
                    break;
                }
            }
            
            if (!encontrado) {
                System.out.println("\n¡Documento invalido!");
            }
        }
        
        
    }
    
}
