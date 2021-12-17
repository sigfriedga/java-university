/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author Sigfried
 */
public class PruebaCaja {
        public static void main(String[] args) {
            
        int mediaAncho = 2;
        int mediaAlto = 4;
        int mediaPofundo = 6;
        
        Caja caja1 = new Caja();
        caja1.ancho = mediaAncho;
        caja1.alto = mediaAlto;
        caja1.profundo = mediaPofundo;
        int resultado = caja1.calcularVolumen();
        
            System.out.println("El resultado de caja 1:" + resultado);
        
        Caja caja2 = new Caja(2,4,6);
            System.out.println("El resultado de la caja 2:" + caja2.calcularVolumen());
        
    }
}
