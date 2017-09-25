package exercicio5;
import java.util.Scanner;
/**
 *
 * @author Vinicius Lelis
 */
public class clientes {
    public int conta;
    public int saldoInicial;
    public int totalItems;
    public int totalCreditos;
    public int limiteCreditos;
    public int saldoFinal;
    public clientes(int conta, int saldoInicial, int totalItems, int totalCreditos, int limiteCreditos, int saldoFinal) {
        this.conta = conta;
        this.saldoInicial = saldoInicial;
        this.totalItems = totalItems;
        this.totalCreditos = totalCreditos;
        this.limiteCreditos = limiteCreditos;
        this.saldoFinal = saldoFinal;
    }

    
    public void novoSaldo() {
        this.saldoFinal = (saldoInicial + totalItems - totalCreditos);
        System.out.println(saldoFinal);
     
    }
    public int getSaldo() {
        System.out.println(saldoFinal);
        return (saldoFinal);
    }
    public boolean getCredito() {
        if(saldoFinal>totalCreditos) {
            System.out.println("TRUE");
            return true;
        }
        else {
            System.out.println("FALSE");
            return false;
        }
    }


}
    
