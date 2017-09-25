/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class listvendas {
    public ArrayList<Venda> listaVendas = new ArrayList<>();
    
    public void addVenda() {
        String panevenda = JOptionPane.showInputDialog(null, "Digite o nome da venda");
        String paneprodutos = JOptionPane.showInputDialog(null, "Digite os produtos vendidos ! Separados por virgula");
        String panepreco = JOptionPane.showInputDialog(null, "Digite o preco total");
        double panedoublepreco = Double.parseDouble(panepreco);
        String panecliente = JOptionPane.showInputDialog(null, "Digite o nome do cliente");
        Venda venda = new Venda(panevenda, paneprodutos, panedoublepreco, panecliente);
        listaVendas.add(venda);
        
    }
    
    public String getListVendas() {
        String resultado = "";
        for(Venda venda: listaVendas) {
            resultado = resultado + "Venda: " + venda.getNome() + " Produtos vendidos: " + venda.getProdutos() + " Preço: " + venda.getPreco() + " Cliente: " + venda.getCliente() + "\n";
        }
        return resultado;
        
    }
    
    public String getRecebimentos() {
        String recebeu = "";
        for(Venda venda: listaVendas) {
            recebeu = recebeu + "Nome: " + venda.nome + " Valor: " + venda.getPreco() + "\n";
        }
        return recebeu;
    }
    
    public double setTotalRecebimentos() {
        double total = 0;
        for(Venda venda: listaVendas) {
            total = total + venda.getPreco();
        }
        return total;
    }
}
