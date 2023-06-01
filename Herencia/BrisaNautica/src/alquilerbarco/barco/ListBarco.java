package alquilerbarco.barco;

import java.util.ArrayList;

public class ListBarco {

    private ArrayList<Barco> listBarco;

    public ListBarco() {

        listBarco = new ArrayList<>();

        listBarco.add(new Barco("Marina Azul", "ABC123", 25, 2010));
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

    int ancho = 127;
    int[] longi = {13, 15, 12, 8, 20, 14, 10, 12};

    String[] message = {"| Tipo", "Nombre", "Matrícula", "Eslora",
        "Año Frabricación", "Potencia CV", "N° Mastil", "N° Camarotes"};

    String messageB = "Barcos disponibles";

    public void showBarcos() {

        int paddinB = (ancho - messageB.length()) / 2;

        System.out.format("\n%" + paddinB + "s%s%" + paddinB + "s", "",
                messageB, "");
        System.out.print("\n" + "-".repeat(ancho) + "\n");

        for (int i = 0; i < message.length; i++) {
            if (i == 0) {
                System.out.format("%-" + longi[i] + "s | ", message[i]);
            } else {
                System.out.format("%-" + longi[i] + "s | ", message[i]);
            }
        }

        System.out.println("");
        barco();

    }

    public void dibujarLinea() {

        for (int i = 0; i < message.length; i++) {

            for (int j = 0; j < longi[i]; j++) {
                if (j == 0 && i == 0) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            if (i != longi.length - 1) {
                System.out.print("-+-");
            } else {
                System.out.print("-+\n");
            }
        }

    }
    
    public void barco() {
        
        for (Barco barco : listBarco) {
            dibujarLinea();
            System.out.println(barco);
        }
        System.out.println("-".repeat(ancho));
        
    }

}
