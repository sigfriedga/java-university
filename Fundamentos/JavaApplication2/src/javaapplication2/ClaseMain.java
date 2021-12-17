/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Sigfried
 */
public class ClaseMain {

    public static void main(String[] args) {

        Clase1 clase1 = new Clase1();
        ClaseDTO claseDTO = new ClaseDTO();
        clase1.setDto(claseDTO);
        claseDTO.setDato1("Casa");
        int numero = 1;
        clase1.setNumero(2);
        String cadena = "jkh";
        procedimiento1(numero, cadena, clase1);
        System.out.println("numero vale" + numero + " cadena vale " + cadena + " clase1 vale " + clase1);
    }

    public static void procedimiento1(int numero, String cadena, Clase1 clase1) {
        numero = 2;
        
        //clase1.getDto().setDato1("aba");
        clase1.getDto().setDato2("abon");
        clase1.setNumero(3);
        cadena = "weq";
    }
    
    
    

}
