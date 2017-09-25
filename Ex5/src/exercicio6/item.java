package exercicio6;
import java.util.Scanner;
/**
 *
 * @author Vinicius Lelis
 */
public class item {
    public int value;
    public int quantidade;
    public int id;
    
    public item(int id, int value, int quantidade) {
        this.id = id;
        this.value = value;
        this.quantidade = quantidade;
    }
   public int getId() {
       return id;
        
}
   public void setId(int id) {
       this.id = id;
   }
   public int getValue() {
       return value;
   } 
   public void setValue(int value) {
       this.value = value;
   }
   public int getQuantidade() {
       return quantidade;
   }
   public void setQuantidade(int quantidade) {
       this.quantidade = quantidade;
   }
 
   
   public class listaProdutos {
       public item[] itens;
       private Scanner leitor;
       public listaProdutos(){
           itens = new item[5];
           leitor = new Scanner(System.in);
       }
       public void cadastrarProduto() {
           for (int i = 0; i < itens.length; i++) {
               if(itens[i]==null) {
                   System.out.println("Digite o ID do produto: ");
                   int idProduto = leitor.nextInt();
                   System.out.println("Digite o valor do produto: ");
                   int valueProduto = leitor.nextInt();
                   System.out.println("Digite a quantidade do produto");
                   int qtdProduto = leitor.nextInt();
                   item criar = new item(idProduto, valueProduto, qtdProduto);
                   itens[i] = criar;
                   System.out.println("Produto adicionado ao vendedor");
                   break;
               }
           }
       }
   }
}
