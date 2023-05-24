package service;

import domain.*;
import java.util.ArrayList;

public class ServiceAnimals {
    
    ArrayList<Animal> animals = new ArrayList();
    
    public void animalsCreate() {
        
        Animal perro = new Perro("Stich", "Carne", 15, "Doberman");
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chichuahua");
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
        Animal cabballo = new Caballo("Spark", "Pasto", 25, "Fino");
        
        animals.add(perro);
        animals.add(perro2);
        animals.add(gato);
        animals.add(cabballo);
        
        imprimirr();
    }
    
    public void imprimirr() {
        
        for (Animal animal : animals) {
            if (animal instanceof Perro) {
                Perro perro = (Perro) animal;
                alimentarse(perro);
                continue;
            }
            
            if (animal instanceof Gato) {
                Gato gato = (Gato) animal;
                alimentarse(gato);
                continue;
            }
            
            if (animal instanceof Caballo) {
                Caballo caballo = (Caballo) animal;
                alimentarse(caballo);
                continue;
            }
        }
        
    }
    
    public void alimentarse(Animal animal) {
        animal.alimentarse();
    }
    
        
    
}
