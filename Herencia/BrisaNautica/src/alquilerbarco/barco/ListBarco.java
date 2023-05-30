package alquilerbarco.barco;

import java.util.ArrayList;

public class ListBarco {
    
    private ArrayList<Barco> listBarco;

    public ListBarco() {
        
        listBarco = new ArrayList<>();
        
        listBarco.add(new Barco("Marina Azul", "ABC123", 25, 210));
        listBarco.add(new Barco("Viento Sereno", "XYZ789", 30, 2015));
        
        listBarco.add(new BarcoMotor("Marlin Rojo", "AB123CD", 10, 2018, 250));
        listBarco.add(new BarcoMotor("Ola Dorada", "XY987ZW", 12, 2015, 350));
        
        listBarco.add(new Velero("Albatros II", "VE002CD", 15, 2012, 1));
        listBarco.add(new Velero("Viento Sur", "VE001AB", 12, 2015, 2));
        
        listBarco.add(new Yate("Ocean Pearl", "YT001AB", 20, 2010, 500, 4));
        listBarco.add(new Yate("Sunset Dream", "YT002CD", 25, 2020, 750, 6));
         
    }

    public ArrayList<Barco> getListBarco() {
        return listBarco;
    }

    public void setListBarco(Barco listBarco) {
        this.listBarco.add(listBarco);
    }
    
}
