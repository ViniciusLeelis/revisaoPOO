package exercicio2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicius Lelis
 */
public class Main {
     public static void main(String[] args) {
          List<Produto> listaProdutos= new ArrayList<>();
          double valores[] = {0, 1.00, 2.98, 9.98, 4.49, 6.87};
          double soma = 0;
          double temp = 0;
          for(int i=1; i<=5; i++) {
             listaProdutos.add(new Produto('P' + i, 0 , valores[i]));  
              System.out.println("Produto: " + "P" + i + " Cadastrado, no valor de: " + valores[i]);
              
          }
          for(int i=0; i<5; i++) {
            soma = listaProdutos.get(i).getPrice() + temp;
            temp = soma;
            
          }
          System.out.println("Seja bem vindo ! Você possui 5 produtos cadastrados, e seu total é: R$" + (float)soma);
        }
}