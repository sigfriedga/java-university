
package mundopc;

/**
 *
 * @author Sigfried
 */
public class Teclado {
    private int idTeclado;
    private int contadorTeclados;
    
    
    public Teclado( int idTeclado, int contadorTeclados){
        this.idTeclado = idTeclado;
        this.contadorTeclados = contadorTeclados;
    }

    public int getIdTeclado() {
        return this.idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public int getContadorTeclados() {
        return this.contadorTeclados;
    }

    public void setContadorTeclados(int contadorTeclados) {
        this.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(", contadorTeclados=").append(contadorTeclados);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
  
    
}
