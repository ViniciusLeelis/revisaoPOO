package exercicio6;
import java.util.Scanner;
/**
 *
 * @author Vinicius Lelis
 */
public class vendedor extends item {
    public String nome;
    public int qtdVendas;
    public float rendimentos;
    public Scanner leitor;
    
   
    public vendedor(String nome, int qtdVendas, float rendimentos, int value, int quantidade, int id) {
        super(value, quantidade, id);
        this.nome = nome;
        this.qtdVendas = qtdVendas;
    }
    public void setRendimento(int rendimento) {
        this.rendimentos = (float) (((quantidade*value)*0.09) + 200);
    }
    public void getRendimento() {
        System.out.println("O vendedor: " + nome + " Obteve o rendimento de: " + rendimentos + "R$");
    }

        
}


