package alquilerbarcos.barco;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListBarco {
    
    private ArrayList<Barco> list;

    public ListBarco() {
        list = new ArrayList<>();
        
        setList(new Barco("Marina Azul", "ABC123", 25, 
                LocalDate.parse("2010-05-23")));
        setList(new Barco("Viento Sereno", "XYZ789", 30, 
                LocalDate.parse("2015-01-18")));
        
        setList(new BarcoMotor("Marlin Rojo", "AB123CD", 10, 
                LocalDate.parse("2018-06-30"), 250));
        setList(new BarcoMotor("Ola Dorada", "XY987ZW", 12, 
                LocalDate.parse("2015-08-04"), 350));
        
        setList(new Velero("Albatros II", "VE001AB", 15, 
                LocalDate.parse("2012-06-01"), 1));
        setList(new Velero("Viento Sur", "VE002CD", 12, 
                LocalDate.parse("2015-09-18"), 2));
        
        setList(new Yate("Ocean Pearl", "YT001AB", 20, 
                LocalDate.parse("2010-07-1"), 500, 4));
        setList(new Yate("Sunset Dream", "YT002CD", 25, 
                LocalDate.parse("2020-12-05"), 750, 6));
    }

    public ArrayList<Barco> getList() {
        return list;
    }

    public void setList(Barco list) {
        this.list.add(list);
    }
    
    
    
}
