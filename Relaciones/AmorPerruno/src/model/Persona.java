package model;

import java.util.ArrayList;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private ArrayList<Perro> perro = new ArrayList<>();
    private ArrayList<Persona> persona = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro.add(perro);
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona.add(persona);
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append("\nApellido: ").append(apellido);
        sb.append("\nEdad: ").append(edad);
        sb.append("\nDocumento: ").append(documento);
        sb.append("\nPerro: ").append(perro);
        return sb.toString().replaceAll("[\\[\\]]", " ");
    }
    
}
