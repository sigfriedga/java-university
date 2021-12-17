
package mx.com.gm.ventas;

/**
 *
 * @author Sigfried
 */
public class Pedido {
    private int idPedido;
    private Producto productos[];
    private static int contadorPedidos;
    private int contadortProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    
    public Pedido(){
        this.idPedido = ++Pedido.contadorPedidos;
        this.productos = new Producto[Pedido.MAX_PRODUCTOS];
    }
    
}
