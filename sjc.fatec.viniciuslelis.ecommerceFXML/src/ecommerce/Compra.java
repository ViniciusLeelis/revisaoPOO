
package ecommerce;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Compra extends listaProdutos {
    public List<Produto> compra = new ArrayList<>();
    public listaCompra lista = new listaCompra();
    public listaProdutos listaProdutos = new listaProdutos();
  
    
    public void adicionarProduto(String idAdd) {
        for(Produto produto: this.produtos) {
            if(idAdd.equals(produto.getId())) {
                compra.add(produto);
                JOptionPane.showMessageDialog(null, "Produto: " + produto.getNome() + " Adicionado !");
            } else
                JOptionPane.showMessageDialog(null, "Produto não encontrado !");
        }
        
    }

    
    public void finalizarCompra() {
        double total= 0;
        for(Produto item: compra) {
            total += item.getPreco();
            item.setQuantidade(item.getQuantidade()-1);
        }
        JOptionPane.showMessageDialog(null, "COMPRA REALIZADA COM SUCESSO NO VALOR DE: R$" + total); 
        lista.addCompra((Compra) compra);
    }
}
