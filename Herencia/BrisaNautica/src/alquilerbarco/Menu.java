package alquilerbarco;

import java.util.Scanner;

public class Menu {
    
    Scanner read = new Scanner(System.in);
    int ancho = 35, opcion = 0;

    public void menu() {

        String messageWelcome = "Bienvenido a NautiRent",
                messageOpcion = "MEN� PRINCIPAL",
                messageRegister = "1. Registrar cliente",
                messageRent = "2. Alquilar barco",
                messageCustomerR = "3. Clientes registrados",
                messageExit = "4. Salir";

        int padding = (ancho - messageWelcome.length()) / 2;
        System.out.print("*".repeat(ancho) + "\n");
        System.out.format("*%" + (padding - 1) + "s%s%" + padding + "s*", 
                "", messageWelcome, "");
        System.out.print("\n" + "*".repeat(ancho) + "\n");

        int paddingO = ((ancho - messageOpcion.length()) / 2) ;
        int paddinR = ((ancho - messageCustomerR.length()) / 2);
        int paddinE = ((ancho - paddinR) / 2) + 5;

        do {
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            System.out.format("|%" + paddingO + "s%s%" + (paddingO-1) + "s|", "",
                    messageOpcion, "");
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            System.out.format("|%" + paddinR + "s%s%" + (paddinR+1) + "s|", "",
                    messageRegister, "");
            System.out.format("\n" + "|%" + paddinR + "s%s%" + (paddinR + 4) + 
                    "s|", "", messageRent, "");
             System.out.format("\n" + "|%" + paddinR + "s%s%" + (paddinR-2) + 
                    "s|", "", messageCustomerR, "");
            System.out.format("\n" + "|%" + paddinR + "s%s%" + paddinE + "s|", 
                    "", messageExit, "");
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            System.out.print("\nElija una opci�n: ");
            opcion = read.nextInt();
            opcionPrincipal(opcion);
            read.nextLine();
        } while (opcion != 4);

    }
    
    public void opcionPrincipal(int opcion) {
        
        switch(opcion) {
            case 1:
                break;
            case 2:
                menuAlquiler();
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("\n�Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opci�n incorrecta, �Vuelva a intentarlo!");
                break;
        }
        
    }
    
    public void menuAlquiler() {
        
        String messageMenu = "MEN� ALQUILER",
                messageBarco = "1. Mostrar barcos disponibles",
                messageAmarre = "2. Mostrar puerto",
                messageRealizar = "3. Realizar alquiler",
                messagerExit = "4. Volver al men� principal";
        
        int paddinM = ((ancho - messageMenu.length()) /2)-1 ;
        int paddingB = (ancho - messageBarco.length()) /2;
        int paddingA = ((ancho - messageAmarre.length())/2)+4;
        int paddinR = (ancho - messageRealizar.length())/2;
        
        do {
            System.out.print("\n"+"-".repeat(ancho) + "\n");
            System.out.format("|%" + paddinM + "s%s%" + paddinM + "s|", "",
                    messageMenu, "");
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            System.out.format("|%" + paddingB + "s%s%" + (paddingB-2) + "s|", "",
                    messageBarco, "");
            System.out.format("\n" + "|%" + paddingB + "s%s%" + paddingA + 
                    "s|", "", messageAmarre, "");
             System.out.format("\n" + "|%" + paddingB + "s%s%" + (paddinR+3) + 
                    "s|", "", messageRealizar, "");
            System.out.format("\n" + "|%" + paddingB + "s%s%" + paddingB + "s|", 
                    "", messagerExit, "");
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            
            System.out.print("\nElija una opci�n: ");
            opcion = read.nextInt();
//            opcion(opcion);
            read.nextLine();
            
            
        } while (opcion != 4);
        
        
    }
    
    public void opcionAlquiler() {
        
    }
    
}
