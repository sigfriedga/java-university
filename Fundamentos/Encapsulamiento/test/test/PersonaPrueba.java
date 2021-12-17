
package test;

import dominio.Persona;


public class PersonaPrueba {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
//        System.out.println("Nombre persona1: " + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
//        System.out.println("Nombre persona1 con cambio: " + persona1.getNombre());
//        System.out.println("Persona1 sueldo:" + persona1.getSueldo());
//        System.out.println("persona1 eliminado: " + persona1.isEliminado());
System.out.println("persina1:" + persona1.toString());
    }
    
}

