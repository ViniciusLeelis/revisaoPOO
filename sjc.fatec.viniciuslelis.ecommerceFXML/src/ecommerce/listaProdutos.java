package ecommerce;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class listaProdutos {
    public List<Produto> produtos = new ArrayList<>();
    public List<String> rank = new ArrayList<>();
    public List<String> estoque = new ArrayList<>();

    public void addProduto(Produto produto) {  
        produtos.add(produto);
        
    }
    public List getProdutos() {
        return produtos;
    }
    
    public void alterarProduto() {
        String nome = JOptionPane.showInputDialog("Digite o código do produto a ser alterado");
        for(Produto produto: produtos) {
            if(nome.equals(produto.getId())) {
                String novoNome = JOptionPane.showInputDialog("Digite o novo nome do produto: " + produto.getNome());
                String novoPreco = JOptionPane.showInputDialog("Digite o novo preço: (Preco antigo: R$" + produto.getPreco());
                double newPreco = Double.parseDouble(novoPreco);
                produto.setNome(nome);
                produto.setPreco(newPreco);
                JOptionPane.showMessageDialog(null, "Produto: " + produto.getNome() + " alterado com sucesso !");
            }
        }
    }
    public int quantidadeEstoque() {
        int quantidade = 0;
        for(Produto produto: produtos) {
            quantidade = quantidade + produto.getQuantidade();
            
            
    }
        return quantidade;
    }
    
    public List<String> getRank() {
        double var = Double.MAX_VALUE;
	double menor = -1;
        String ranking;
        for(Produto produto: produtos) {
		if(produto.getPreco() < var){
		menor = produto.getPreco();
		var = produto.getPreco();
                   ranking = "Produto: " + produto.getNome() + "     Preço: R$" + produto.getPreco();
                   rank.add(ranking);
        
			}

		}
        return rank;
	}
   }
    

