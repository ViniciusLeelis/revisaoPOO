
package lista6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class listaProdutos {
    List<Produto> listaProdutos;
    Scanner leitor = new Scanner(System.in);
    
    public void addProduto() {
        System.out.println("Digite o nome do novo produto a ser adicionado: ");
        String nome = leitor.next();
        System.out.println("Digite a quantidade deste produto: ");
        int quantidade = leitor.nextInt();
        System.out.println("Digite o preço deste produto: ");
        double preco = leitor.nextDouble();
        System.out.println("Digite a descrição deste produto: ");
        String descricao = leitor.next();
        Produto produto = new Produto(nome, descricao, quantidade, preco);
        listaProdutos.add(produto);
    }
    public void alterarProduto(String nomeProduto) {
        for(Produto produto: listaProdutos) {
            if(nomeProduto == produto.getNome()) 
                System.out.println("Nome do produto: " + produto.getNome() + " Quantidade"
                        + produto.getQuantidade() + "Preço: " + produto.getPreco());
                System.out.println("Digite o novo nome: ");
                String newName = leitor.next();
                System.out.println("Digite a nova quantidade");
                int newQtd = leitor.nextInt();
                System.out.println("Digite o novo preço: ");
                double newPreco = leitor.nextDouble();
                System.out.println("Digite a nova descrição: ");
                String newDescricao = leitor.next();
                Produto newProduto = new Produto(newName, newDescricao, newQtd, newPreco);
                listaProdutos.remove(produto);
                listaProdutos.add(newProduto);
        }
    }
     public void removerProduto() {
        String opcao;
        System.out.println("Digite o nome do produto a ser removido: ");
        opcao = leitor.next();
        for(Produto produto: listaProdutos) {
            if(opcao == produto.getNome())
              listaProdutos.remove(produto);
            else
              System.out.println("Produto não encontrado");
        }          
    }
    public void gerarRelatorio() throws FileNotFoundException, IOException {
            System.out.println("\n");
            Collections.sort(listaProdutos, new ordemAlfabetica());
 		FileOutputStream arquivo;
                arquivo = new FileOutputStream("C:\\Program Files\\Almoxarifado\\products.dat");
		ObjectOutputStream arquivoO = new ObjectOutputStream(arquivo);
		arquivoO.writeObject(listaProdutos);
		arquivoO.close();           
            
            
        }
    
        
    }

