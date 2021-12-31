
package ventas.test;

import mx.com.gm.ventas.*;

/**
 *
 * @author Sigfried
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);
        
        Pedido pedido1 = new Pedido();
        pedido1.agregarProductos(producto1);
        pedido1.agregarProductos(producto2);
        pedido1.mostrarPedido();
        
    }
    
}
