package alquilerbarcos.cliente;

import java.util.ArrayList;

public class CustomerList {
    
    private ArrayList<Cliente> listCustomer;

    public CustomerList() {
    }

    public CustomerList(ArrayList<Cliente> listCustomer) {
        this.listCustomer = listCustomer;
    }

    public ArrayList<Cliente> getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(Cliente listCustomer) {
        this.listCustomer.add(listCustomer);
    }
    
    public Cliente customerSearch(long document) {
        
        for (Cliente cliente : listCustomer) {
            if (cliente.getDocumento() == document) {
                return cliente;
            }
        }
        return null;
    }
    
    
}
