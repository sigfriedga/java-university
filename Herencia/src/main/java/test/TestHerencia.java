package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Sigfried
 */
public class TestHerencia {

    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Juan", 5000.0);
//        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(new Date(), true, "Sigfried", 'M', 32, "Murcia 18");
        System.out.println("cliente1 = " + cliente1);

    }

}
