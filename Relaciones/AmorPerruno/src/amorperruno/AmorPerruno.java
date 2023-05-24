package amorperruno;

import adoptar.AdoptarPerro;
import model.Perro;
import model.Persona;

public class AmorPerruno {

    public static void main(String[] args) {
        
        Perro perro = new Perro();
        Persona persona = new Persona();
        AdoptarPerro adoptar = new AdoptarPerro();
        
        adoptar.adopcionPerro();
        adoptar.adoptar();
        
    }
    
}
