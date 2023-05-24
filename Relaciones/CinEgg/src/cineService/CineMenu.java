package cineService;

import java.util.Scanner;

/**
 *
 * @author QuinSDev
 */
public class CineMenu {

    Scanner read = new Scanner(System.in);
    CinEggController cineE = new CinEggController();
    int ancho = 40, opcion = 0;
    
    public void iniciarCine() {
         cineE.llenarPelicula();
        cineE.generarAsiento();
        menu();
    }
    
    public void menu() {

        String bienvenida = "Bienvenido a CinEgg",
                menuOpc = "Menú de opciones",
                registrar = "1. Registrarse", ingresar = "2. Ingresar",
                salir = "3. Salir";

        int longi = bienvenida.length();
        int leftPadding = (ancho - longi) / 2;
        int rightPadding = (ancho - longi) / 2;

        System.out.println("*".repeat(ancho));
        System.out.format("*%" + leftPadding + "s%s%" + (rightPadding - 1) + "s*",
                "", bienvenida, "");
        System.out.println("\n" + "*".repeat(ancho));

        int leftM = (ancho - menuOpc.length()) / 2;

        int leftR = (ancho - registrar.length()) / 2;

        int rightI = ((ancho - ingresar.length()) / 2);

        int rightS = ((ancho - salir.length()) / 2)+1;

        do {
            System.out.println("\n" + "-".repeat(ancho));
            System.out.format("|%" + leftM + "s%s%" + (leftM - 2)
                    + "s|", "", menuOpc, "");
            System.out.println("\n" + "-".repeat(ancho));
            System.out.format("|%-" + leftR + "s%s%" + (leftR - 2) + "s|",
                    "", registrar, "");
            System.out.format("\n" + "|%-" + leftR + "s%s%" + rightI
                    + "s|", "", ingresar, "");
            System.out.format("\n" + "|%-" + leftR + "s%s%" + rightS
                    + "s|", "", salir, "");
            System.out.println("\n" + "-".repeat(ancho));
            System.out.print("\nElija una opción: ");
            opcion = Integer.parseInt(read.nextLine());
            opcionMenu(opcion);

        } while (opcion != 3);

    }
    
    public void opcionMenu(int opcion) {
        
        
        switch(opcion) {
            case 1:
                cineE.registrarUsuario();
                break;
            case 2:
                cineE.ingresarUsuario(this);
                break;
            case 3:
                break;
            default: 
                System.out.println("¡Opción incorrecta!... Intenta"
                        + " nuevamente");
                break;
        }
        
    }
    
    public void menuUsuario() {
        
        String menUs = "Menú de usuario", menPel = "1. Películas en cartelera",
                menCom = "2. Comprar boletas", menSalir = "3. Salir";

        int lefUs = (ancho - menUs.length()) / 2;
        
        int lefPel = (ancho - menPel.length()) / 2;
        
        int leftCom = (ancho - menCom.length()) / 2;
        
        int leftSalic = (ancho - menSalir.length()) / 2;
        
        
        do {
            
            System.out.println("\n" + "-".repeat(ancho));
            System.out.format("|%" + lefUs + "s%s%" + (lefUs-1)
                    + "s|", "", menUs, "");
            System.out.println("\n" + "-".repeat(ancho));
            System.out.format("|%" + lefPel + "s%s%" + (lefPel-1)
                    + "s|", "", menPel, "");
            System.out.format("\n|%" + lefPel + "s%s%" + (leftCom+2)
                    + "s|", "", menCom, "");
            System.out.format("\n|%" + lefPel + "s%s%" + (leftSalic+7)
                    + "s|", "", menSalir, "");
            System.out.println("\n" + "-".repeat(ancho));
            System.out.print("\nElija una opción: ");
            opcion = read.nextInt();
            read.nextLine();
            opcionUsuario(opcion);
            
        } while (opcion != 3);
        
    }
    
    public void opcionUsuario(int opcion) {
        
        switch(opcion) {
            case 1:
                cineE.mostrarPelicula();
                break;
            case 2:
                
                cineE.comprarBoletas();
                break;
            case 3:
                System.out.println("");
                menu();
                break;
            default:
                 System.out.println("¡Opción incorrecta!... Intenta"
                        + " nuevamente");
                break;
        }
        
    }

}
