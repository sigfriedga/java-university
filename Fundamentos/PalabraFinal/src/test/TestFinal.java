
package test;

import domain.Persona;

/**
 *
 * @author Sigfried
 */
public class TestFinal {
    
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi contaste = " + Persona.MI_CONSTANTE);
        
        final Persona perosona1 = new Persona();
        //persona1 = new Personas();
        persona1.setNombre("Juan");
        System.out.println("perosona1 nombre= " + perosona1.getNombre);
    }
    
}
