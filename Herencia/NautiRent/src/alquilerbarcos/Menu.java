package alquilerbarcos;

import java.util.Scanner;

public class Menu {

    Rent rent = new Rent();
    Scanner read = new Scanner(System.in);
    int ancho = 32, opcion = 0;

    public void menu() {

        String messageWelcome = "Bienvenido a NautiRent",
                messageOpcion = "Menú de opciones",
                messageRegister = "1. Registrar cliente",
                messageInfo = "2. Mostrar barcos",
                messageRent = "3. Alquilar barco",
                messageExit = "4. Salir";

        int padding = (ancho - messageWelcome.length()) / 2;
        System.out.print("*".repeat(ancho) + "\n");
        System.out.format("*%" + (padding - 1) + "s%s%" + (padding - 1) + "s*", 
                "", messageWelcome, "");
        System.out.print("\n" + "*".repeat(ancho) + "\n");

        int paddingO = ((ancho - messageOpcion.length()) / 2) - 1;
        int paddinR = ((ancho - messageRegister.length()) / 2) - 1;
        int paddinE = ((ancho - paddinR) / 2) + 4;

        do {
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            System.out.format("|%" + paddingO + "s%s%" + paddingO + "s|", "",
                    messageOpcion, "");
            System.out.print("\n" + "-".repeat(ancho) + "\n");
            System.out.format("|%" + paddinR + "s%s%" + paddinR + "s|", "",
                    messageRegister, "");
            System.out.format("\n" + "|%" + paddinR + "s%s%" + (paddinR + 3) + 
                    "s|", "", messageInfo, "");
            System.out.format("\n" + "|%" + paddinR + "s%s%" + (paddinR + 3) + 
                    "s|", "", messageRent, "");
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
                rent.customerRegister();
                break;
            case 2:
                rent.barcosDisponibles();
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
