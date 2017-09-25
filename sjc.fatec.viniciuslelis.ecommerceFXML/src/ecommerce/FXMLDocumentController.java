
package ecommerce;

import java.net.URL;
import static java.nio.file.Files.list;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    

    @FXML  // Produto
    private TextField nomeProduto; 
    @FXML
    private TextField idProduto;
    @FXML
    private TextField quantidadeProduto;
    @FXML
    private TextField precoProduto;
    @FXML
    private TextField comentarioProduto;
    @FXML
    public listaProdutos listaProdutos = new listaProdutos();
    
    
    
    @FXML //Compra 
    private TextField produtoIDCompra ;
    @FXML
    private ListView<String> menoresPrecos = new ListView<String>();

    protected ListProperty<String> listProdutos= new SimpleListProperty<>();
    
    @FXML // Controle de Estoque
    private Text qtdEstoque;
    @FXML
    private Text qtdVendido;

    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(nomeProduto.getText());
    }
    
    @FXML
    public void guiCadastrarProduto(ActionEvent event) {

        String id; String nome; String comentario; int quantidade ; double preco;
        id = idProduto.getText();
        nome = nomeProduto.getText();
        comentario = comentarioProduto.getText();
        quantidade = Integer.parseInt(quantidadeProduto.getText());
        preco = Double.parseDouble(precoProduto.getText());
        if(idProduto.getText()=="" || nomeProduto.getText()=="" || comentarioProduto.getText()=="" || quantidadeProduto.getText()=="" || precoProduto.getText()=="") {
            JOptionPane.showMessageDialog(null, "Existem campos em branco ! !");
        } else {
            Produto produto = new Produto(id, nome, quantidade, preco, comentario);
            listaProdutos.addProduto(produto);
            JOptionPane.showMessageDialog(null, "Produto: " + nome + " Foi adicionado com sucesso !");
            System.out.println(produto.getNome());
            idProduto.setText(""); 
            nomeProduto.setText(""); 
            comentarioProduto.setText(""); 
            quantidadeProduto.setText("");
            precoProduto.setText(""); 
            int qtd = listaProdutos.quantidadeEstoque();
            String qtds = Integer.toString(qtd);
            qtdEstoque.setText(qtds);

        }
    }
    
    @FXML
    public void guiAlterarProduto(ActionEvent event) {
        listaProdutos.alterarProduto();
    }
        
    @FXML
    private void guiFazerCompra(ActionEvent event) { //Não consegui solucionar tal problema !  ? ? ? ? ? ? ? ? 
        String id;
        id = produtoIDCompra.getText();
        Compra compra = new Compra();
        compra.adicionarProduto(id);
        String listaCompra;
        listaCompra = compra.produtos.toString();
        System.out.println("Produto adicionado");
        compra.finalizarCompra();
        //compraLista.getItems().add(listaCompra);      
    }
    
    @FXML
    private void guiControleEstoque(ActionEvent event) {
        
        
    }
    
    @FXML
    private void guiRanking(ActionEvent event) {
        listProdutos.set(FXCollections.observableArrayList(listaProdutos.getRank()));
        menoresPrecos.itemsProperty().bind(listProdutos);
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
