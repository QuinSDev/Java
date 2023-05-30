package alquilerbarco.cliente;

import java.util.ArrayList;

public class ListCliente {
    
    private ArrayList<Cliente> listCliente;

    public ListCliente() {
        listCliente = new ArrayList<>();
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
    
}
