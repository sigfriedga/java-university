
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
    public void agregarProductos(Producto producto) {
        if(this.contadortProductos < Pedido.MAX_PRODUCTOS){
            this.productos[this.contadortProductos++] = producto;
        }else{
            System.out.println("Se ha superado el numero máximo de productos: " 
                    + Pedido.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadortProductos; i++) {
            //Producto producto = this.productos[i];
            //total += producto.getPrecio();//total = total + producto.getPrecio()
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarPedido(){
        System.out.println("Id Pedido: " + this.idPedido);
        double totalPedido = this.calcularTotal();
        System.out.println("Total del Pedido: $" + totalPedido);
        System.out.println("Productods del Pedido: ");
        for (int i = 0; i < this.contadortProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}
