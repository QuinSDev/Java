package alquilerbarcos.barco;

import java.time.LocalDate;

public class Barco {

    protected String nombre, matricula;
    protected int eslora;
    protected LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String nombre, String matricula, int eslora,
            LocalDate anioFabricacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int calcularMoudlo() {

        return this.eslora * 10;

    }

    int ancho = 124;
    int[] longi = {10, 15, 12, 8, 20, 14, 10, 12};

    String[] message = {"| Tipo", "Nombre", "Matrícula", "Eslora",
        "Año Frabricación", "Potencia CV", "# Mastil", "# Camarotes"};

    String messageB = "Barcos disponibles";

    public void message() {

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

    }

    @Override
    public String toString() {

    
        StringBuilder sb = new StringBuilder();

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

        sb.append("Barco{nombre=").append(nombre);
        sb.append(", matricula=").append(matricula);
        sb.append(", eslora=").append(eslora);
        sb.append(", anioFabricacion=").append(anioFabricacion);
        sb.append('}');
        
        System.out.print("\n"+"-".repeat(ancho));
        return sb.toString();
    }

}
