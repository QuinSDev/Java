package pruebaexcepcionnull;

import model.Person;


public class PruebaExcepcionNull {
    
    public static void main(String[] args) {
        
        try {
            
            Person person = null;
            person.mayorEdad();
            
        } catch (Exception e) {
            System.out.println("Se produjo una excepción " + e.getMessage());
        }
        
    }
  
    
}
