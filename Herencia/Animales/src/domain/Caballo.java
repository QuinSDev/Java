package domain;

public final class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("E caballo " + getNombre() + " se alimenta de " 
                + getAlimento());
    }
    
}
