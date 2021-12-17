public class ClaseMain {
    
    public static void main(String args[]){
        
        ClasePadre c1 = new ClasePadre();
        ClaseHija c2 = new ClaseHija();
        
        c1.conducir();
        c2.conducir();
        c2.conducirClasePadre();
        
        ClasePadre c3 = new ClaseHija();
        c3.conducir();
        /*
        Como impedir herencia de una clase
        objeto implicito this
        clase abstracta
        herencia multiple
        
        
        */
        
        
 
    }
    
}
