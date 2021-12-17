
public class ClaseHija extends ClasePadre {

    public ClaseHija() {
        super.color = "rojo";
        super.ruedas = 4;
    }
    
    public void conducir(){
        System.out.println("Hola soy clase Hija");
    }
    
    public void conducirClasePadre(){
        super.conducir();
  
    }
   
}
