/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import lista7.Lista7;
import lista7.listvendas;

public class FXMLSecondController {

 @FXML
 public void  initialize() {
 }

 @FXML
 private AnchorPane entradaCaixa;
 
 @FXML
 private ListView listVendas;
 
 @FXML
 private ListView listRecebimentos;
 
 @FXML
 public Text userNome;
 
 @FXML
 public Text finalPreco;

 public listvendas listavendas = new listvendas();
 
protected ListProperty<String> listComprasgui= new SimpleListProperty<>();

protected ListProperty<String> listRecebimentosgui= new SimpleListProperty<>();

public arquivoMetod arquivo = new arquivoMetod();
 /**
  * Chama o método estático da classe Main para solicitar outra página
  */
 

 
 @FXML
  private void atualizarVendas(ActionEvent event) throws IOException {
        listComprasgui.set(FXCollections.observableArrayList(listavendas.getListVendas()));
        listVendas.itemsProperty().bind(listComprasgui);
        arquivoMetod.leitor("C:\\biblioteca\\vendas.txt");

 }
 @FXML
  private void atualizarRecebimentos(ActionEvent event) throws IOException {
        listRecebimentosgui.set(FXCollections.observableArrayList(listavendas.getRecebimentos()));
        listRecebimentos.itemsProperty().bind(listRecebimentosgui);
        String totalrecebimentos = Double.toString(listavendas.setTotalRecebimentos());
        finalPreco.setText(totalrecebimentos);
        arquivoMetod.leitor("C:\\biblioteca\\recebimentos.txt");    

 }
  @FXML
  private void addVendas(ActionEvent event) throws IOException {
        listavendas.addVenda();
        listComprasgui.set(FXCollections.observableArrayList(listavendas.getListVendas()));
        listVendas.itemsProperty().bind(listComprasgui);
        arquivoMetod.escritor("C:\\biblioteca\\vendas.txt", listavendas.getListVendas());
  } 

 @FXML
 public void setVisibleProgramScreen() {
     entradaCaixa.setVisible(false);
 } 
  
  
 @FXML
  private void openSaidaCaixa(ActionEvent event) throws IOException {
                try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLSaidaCaixa.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
                setVisibleProgramScreen();
              } catch(Exception e) {
                    e.printStackTrace();
           }

 }
  
  
  
  //Saida de Caixa janela
@FXML
private ListView listaPagamentos;

@FXML
private ListView listaDespesas;

@FXML
private Text despesanum;

@FXML
private Text vendasnum;

@FXML
private Text pagamentosnum;
 @FXML 
private Text lucronum;


protected ListProperty<String> listPagamentosgui= new SimpleListProperty<>();
protected ListProperty<String> listDespesasgui= new SimpleListProperty<>();
listaDespesas despesas = new listaDespesas();
listaPagamentos pagamentos = new listaPagamentos();
@FXML private javafx.scene.control.Button closeButton;

 @FXML
  private void openEntradaCaixa(ActionEvent event) throws IOException {
                
                
                try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLProgram.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));  
                stage.show();
                setVisibleProgramScreen();
              } catch(Exception e) {
                    e.printStackTrace();
           }

 }


@FXML
    private void atualizarPagamentos(ActionEvent event) throws IOException {
        listPagamentosgui.set(FXCollections.observableArrayList(pagamentos.getPagamentoList()));
        listaPagamentos.itemsProperty().bind(listPagamentosgui);
        String texto = Double.toString(pagamentos.totalPagamentos());
        pagamentosnum.setText(texto);
        double lucroT = ((pagamentos.totalPagamentos()+ listavendas.setTotalRecebimentos()) - despesas.totalDespesas() );
        lucronum.setText(Double.toString(lucroT));
        String totalrecebimentos = Double.toString(listavendas.setTotalRecebimentos());
        vendasnum.setText(totalrecebimentos);
        arquivoMetod.leitor("C:\\biblioteca\\pagamentos.txt");
    }
@FXML
    private void atualizarDespesas(ActionEvent event) throws IOException {
        listDespesasgui.set(FXCollections.observableArrayList(despesas.getListDespesas()));
        listaDespesas.itemsProperty().bind(listDespesasgui);
        String texto = Double.toString(despesas.totalDespesas());
        despesanum.setText(texto);
        double lucroT = ((pagamentos.totalPagamentos()+ listavendas.setTotalRecebimentos()) - despesas.totalDespesas() );
        lucronum.setText(Double.toString(lucroT));
        String totalrecebimentos = Double.toString(listavendas.setTotalRecebimentos());
        vendasnum.setText(totalrecebimentos);
        arquivoMetod.leitor("C:\\biblioteca\\despesas.txt");
    }
    
@FXML
    private void addPagamentos(ActionEvent event) throws IOException {
        pagamentos.addgetListaPagamentos();
        listPagamentosgui.set(FXCollections.observableArrayList(pagamentos.getPagamentoList()));
        listaPagamentos.itemsProperty().bind(listPagamentosgui);
        String texto = Double.toString(pagamentos.totalPagamentos());
        pagamentosnum.setText(texto);
        double lucroT = ((pagamentos.totalPagamentos()+ listavendas.setTotalRecebimentos()) - despesas.totalDespesas() );
        lucronum.setText(Double.toString(lucroT));
        String totalrecebimentos = Double.toString(listavendas.setTotalRecebimentos());
        vendasnum.setText(totalrecebimentos);
        arquivoMetod.escritor("C:\\biblioteca\\pagamentos.txt", pagamentos.getPagamentoList());
    }
@FXML
    private void addDespesas(ActionEvent event) throws IOException {
        despesas.addListaDespesas();
        listDespesasgui.set(FXCollections.observableArrayList(despesas.getListDespesas()));
        listaDespesas.itemsProperty().bind(listDespesasgui);
        String texto = Double.toString(despesas.totalDespesas());
        despesanum.setText(texto);
        double lucroT = ((pagamentos.totalPagamentos()+ listavendas.setTotalRecebimentos()) - despesas.totalDespesas() );
        lucronum.setText(Double.toString(lucroT));
        String totalrecebimentos = Double.toString(listavendas.setTotalRecebimentos());
        vendasnum.setText(totalrecebimentos);
        arquivoMetod.escritor("C:\\biblioteca\\despesas.txt", despesas.getListDespesas());
    }
}

    