
package newbox;

public class NewBox {
    
int altura;
int profundidad;
int ancho;

public NewBox(){
}

public NewBox(int altura, int profundidad, int ancho){
    this.altura = altura;
    this.profundidad = profundidad;
    this.ancho = ancho;
}

public int calcularVolumen(){
    return altura*profundidad*ancho;
}
        


  
    
}
