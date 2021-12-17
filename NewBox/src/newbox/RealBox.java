
package newbox;

public class RealBox {
    
    public static void main(String[] args) {
        
        int valoraltura = 6;
        int valorprofundidad = 5;
        int valorancho =4;
        
        NewBox box1 = new NewBox();
            box1.altura = valoraltura;
            box1.profundidad = valorprofundidad;
            box1.ancho = valorancho;
            
            System.out.println("El valor del volumen de la caja 1 es: " + box1.calcularVolumen());    
            
        NewBox box2 = new NewBox(6,5,4);
        
        System.out.println("El valor del volumen de la caja 2 es: " + box2.calcularVolumen());
    }
        
            

}


