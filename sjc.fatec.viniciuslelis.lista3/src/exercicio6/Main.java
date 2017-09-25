package exercicio6;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main extends listaClientes {
    public static void main(String[] args ) {
        Scanner leitor = new Scanner(System.in);
        listaClientes lista = new listaClientes();
        System.out.println("O que deseja fazer ? \n (1) ADD CLIENTE \n (2) ALTERAR CLIENTE \n (3) EXCLUIR CLIENTE");
        int opcao = leitor.nextInt();
        switch(opcao) {
            case 1: {
                lista.cadastrarCliente();
            }
            case 2: {
                lista.editarCliente();
            }
            case 3: {
                lista.excluirCliente();
                
            }
        }
        
        
    }
}
