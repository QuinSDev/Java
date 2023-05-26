package service;

import java.util.Scanner;

public class DomesticMenu {
    
    int ancho = 40, opcion = 0;
    String deci = "";
    Scanner read = new Scanner(System.in);
    DomesticManager domestic = new DomesticManager();
    
    public void menu() {
        
        String messageMenu = "Bienvenido a ElectroPlus",
            messageOpcion = "Menú opciones",
            messageRegister = "1. Registrar producto",
            messageInfo = "2. Mostrar productos",
            messageExit = "3. Salir";
            
        
        int longi = messageMenu.length();
        int leftP = (ancho - longi) / 2;
        int rightP = (ancho - longi) / 2;
        
        System.out.println("*".repeat(ancho));
        System.out.format("|%" + (leftP-1) + "s%s%" + (rightP-1) + "s|", "",
                messageMenu, "");
        System.out.println("\n" + "*".repeat(ancho) + "\n");
        
        int leftO = (ancho - messageOpcion.length()) / 2;
        int leftR = (ancho - messageRegister.length()) / 2;
        int leftE = (ancho - messageExit.length()) / 2;
        
        do {
            
            System.out.println("-".repeat(ancho));
            System.out.format("|%" + leftO + "s%s%" + (leftO-1) + "s|", "",
                    messageOpcion, "");
            System.out.println("\n" + "-".repeat(ancho));
            System.out.format("|%" + leftR + "s%s%" + (leftR-1) + "s|", "",
                    messageRegister, "");
            System.out.format("\n"+"|%" + leftR  + "s%s%" + leftR + "s|", "",
                    messageInfo, "");
            System.out.format("\n"+"|%" + leftR + "s%s%" + (leftE+5) + "s|", "",
                    messageExit, "");
            System.out.println("\n" + "-".repeat(ancho));
            System.out.print("\nElija una opción: ");
            opcion = Integer.parseInt(read.nextLine());
            opcionMenu(opcion);
            
        } while (opcion != 3);
        
        
    }
    
    public void opcionMenu(int opcion) {
        
        
        switch(opcion){
            
            case 1:
                menuRegister();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        
    }
    
    public void menuRegister() {
        
        String messageProduct = "Registrar producto";
        
        int longiP = (ancho - messageProduct.length()) / 2;
        
        System.out.println("\n"+"*".repeat(ancho));
        System.out.format("|%" + (longiP-1) + "s%s%" + (longiP-1) + "s|", "",
                messageProduct, "");
        System.out.println("\n" + "*".repeat(ancho) + "\n");
        
        System.out.println("Televisor || Lavadora\n");
        
        
        do {
            
            System.out.print("¿Que producto deseas registrar?: ");
            String produc = read.nextLine();
            domestic.electroCreate(produc);
            System.out.print("\n¿Deseas registrar un nuevo producto?(Y/N): ");
            deci = read.nextLine();
            System.out.println("");
             
            if (deci.equalsIgnoreCase("N")) {
                menu();
                break;
            }
            
        } while (deci.equalsIgnoreCase("Y"));
        
       
    }
    
}
