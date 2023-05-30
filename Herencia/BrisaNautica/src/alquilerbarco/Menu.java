package alquilerbarco;

import java.util.Scanner;

public class Menu {
    
    Scanner read = new Scanner(System.in);
    int ancho = 35, opcion = 0;

    public void menu() {

        String messageWelcome = "Bienvenido a NautiRent",
                messageOpcion = "Menú de opciones",
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
            System.out.print("\nElija una opción: ");
            opcion = read.nextInt();
            opcion(opcion);
            read.nextLine();
        } while (opcion != 4);

    }
    
    public void opcion(int opcion) {
        
        switch(opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                
                break;
            case 4:
                System.out.println("\n¡Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta, ¡Vuelva a intentarlo!");
                break;
        }
        
    }
    
}
