package adoptar;

import java.util.ArrayList;
import java.util.Scanner;
import model.Perro;
import model.Persona;

/**
 *
 * @author QuinSDev
 */
public class AdoptarPerro {

    Perro perro = new Perro();
    Persona persona = new Persona();
    ArrayList<Perro> adopcion = new ArrayList<>();

    Scanner read = new Scanner(System.in);
    
    public void adopcionPerro() {
        
        agregarPerro();
        
        System.out.println("*****************************");
        System.out.println("* Bienvenido a Amor Perruno *");
        System.out.println("*****************************\n");
        
        agregarPersona();
        mostrarPerro();
        
        
        
    }

    public void agregarPerro() {

        perro.setPerro(new Perro("Groot", "Chichuacha", 2, 15));
        perro.setPerro(new Perro("Colitas", "Shih Tzu", 5, 17));
        perro.setPerro(new Perro("Bowser", "Boxer", 8, 35));
        perro.setPerro(new Perro("Bowser", "Beagle", 12, 36));
        perro.setPerro(new Perro("Viruela", "Labrador", 8, 35));
        perro.setPerro(new Perro("Pancho", "Pastor Alemán", 5, 20));
        perro.setPerro(new Perro("Dexter", "Doberman", 8, 40));

    }

    public void agregarPersona() {

        System.out.print("¿Cuantas personas quieres registrar?: ");
        int numP = read.nextInt();
        read.nextLine();

        for (int i = 0; i < numP; i++) {
            System.out.print("\nIngresa el nombre: ");
            persona.setNombre(read.nextLine());
            System.out.print("Ingresa el apellido: ");
            persona.setApellido(read.nextLine());
            System.out.print("Ingresa la edad: ");
            persona.setEdad(read.nextInt());
            System.out.print("Ingresa el documento: ");
            persona.setDocumento(read.nextLong());
            persona.setPersona(new Persona(persona.getNombre(),
                    persona.getApellido(), persona.getEdad(),
                    persona.getDocumento()));
            read.nextLine();
        }
    }

    public void mostrarPerro() {

        System.out.println("\nTenemos los siguientes Perros: \n");

        System.out.println(String.format("%-10s %-15s %4s %8s", "Nombre",
                "Raza", "Edad", "Tamanio"));
        for (Perro perro1 : perro.getPerro()) {
            System.out.println(perro1.toString());
        }

    }

    public void adoptar() {

        for (Persona persona1 : persona.getPersona()) {
            System.out.print("\n" + persona1.getNombre());
            System.out.print("... ¿Cual es el nombre del perro que quieres "
                    + "adoptar?: ");
            String nombreP = read.nextLine().toUpperCase();

            boolean adoptarP = false;

            for (Perro perro2 : adopcion) {
                String nomP = perro2.getNombre().toUpperCase();
                if (nomP.equalsIgnoreCase(nombreP)) {
                    System.out.println("El perro ya fue adoptado!! Elige otro");
                    adoptarP = true;
                    break;
                }

            }
            if (!adoptarP) {
                boolean encontrado = false;
                for (Perro perro1 : perro.getPerro()) {
                    String nombP = perro1.getNombre().toUpperCase();
                    if (nombP.equalsIgnoreCase(nombreP)) {
                        adopcion.add(perro1);
                        int indexP = adopcion.indexOf(perro1);
                        persona.getPersona().get(indexP).setPerro(perro1);
                        perro.getPerro().remove(perro1);
                        encontrado = true;
                        break;
                    }

                }
                if (!encontrado) {
                    System.out.println("El nombre no se encuentra en "
                            + "nuestra base de datos.");

                }
            }

        }

        for (Persona persona1 : persona.getPersona()) {
            System.out.println("\n" + persona1.toString());
        }

    }
}
