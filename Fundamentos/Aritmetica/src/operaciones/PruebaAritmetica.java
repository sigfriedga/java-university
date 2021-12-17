package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        
        //Variables locales
        var a = 10;
        var b = 2;
        //miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();

        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);

        Aritmetica aritmetica3 = new Aritmetica(5, 8);

        System.out.println("aritmetica3 a:" + aritmetica3.a);
        System.out.println("aritmetica3 b:" + aritmetica3.b);

    }
    
    public void miMetodo(){
       //la variable a está fuera de este método
       //a = 10;
        System.out.println("otro método");
    }
}
