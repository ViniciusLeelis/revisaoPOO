/*
Você foi contratado para desenvolver um aplicativo controlador de estoque para o
almoxarifado de uma empresa, situado no parque tecnológico. O aplicativo deve
permitir ao almoxarife cadastrar, editar e remover produtos e suas quantidades. Além
disso, o aplicativo deve ser capaz de emitir relatórios contendo informações do tipo,
quantidade total de produtos cadastrados, quantidade de cada produto armazenado
no almoxarifado. Por último, o aplicativo deve ser responsável por armazenar suas
informações sem perdas, logo ele deve permitir ao usuário poder salvar e recuperar
as informações do disco.
Ao se gerar relatórios sobre as informações o aplicativo deve listar os produtos
armazenados em ordem alfabética. Seguindo o modelo:
// */
package lista6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends listaProdutos  {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner leitor = new Scanner(System.in);
        listaProdutos listaProdutos = new listaProdutos();
        System.out.println("Por gentileza, informe a operação desejada: \n 1 - ADD Produto \n 2 - Editar Produto \n 3 - Remover Produto"
                + "\n 4 - Emitir Relatório" + "\n 5 - Ler Relatório");
        int escolha = leitor.nextInt();
        switch(escolha) {
            case 1: {
                listaProdutos.addProduto();
    }

            case 2: {
                System.out.println("Digite o nome do produto: ");
                String nomeProduto = leitor.next();
                listaProdutos.alterarProduto(nomeProduto);
                    }
            case 3: {
                listaProdutos.removerProduto();
            }                        
            case 4: {
                System.out.println("O Relatório está sendo salvo");
                listaProdutos.gerarRelatorio();
            }
            case 5: {
                FileInputStream entrada = 
                new FileInputStream("C:\\Program Files\\Almoxarifado\\products.dat");
                ObjectInputStream entradaO = new ObjectInputStream(entrada);
                List<Produto> listaPr = (List<Produto>) entradaO.readObject();
                System.out.println("Lista de produtos lidas do arquivo: ");
                for (Produto produto : listaPr) {
                   System.out.println("Nome: " + produto.getNome());
                   System.out.println("Quantidade: " + produto.getQuantidade());  
                }
            }
        }
    }
}

    

