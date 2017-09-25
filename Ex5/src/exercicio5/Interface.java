package exercicio5;
import java.util.Scanner;

/**
 *
 * @author Vinicius Lelis
 */
public class Interface {
    public static void main(String[] args) {
        clientes Vinicius;
        Vinicius = new clientes(01, 1000, 1000, 1000, 000, 0);
        Vinicius.novoSaldo();
        Vinicius.getSaldo();
        Vinicius.getCredito();
    }
    
}
