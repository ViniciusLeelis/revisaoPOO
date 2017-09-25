package lista7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class listaPagamentos {
    public ArrayList<PagamentoA> listaPagamentos = new ArrayList<>();
    public arquivoMetod arquivo = new arquivoMetod();
    
    public ArrayList<PagamentoA> getListaPagamentos() {
        return listaPagamentos;
    }

    public void addgetListaPagamentos() {
            String pagamentoNome = JOptionPane.showInputDialog("Digite o nome do pagamento");
            String pagamentoValor = JOptionPane.showInputDialog("Digite o valor do pagamento");
            double pagamentoValorDouble = Double.parseDouble(pagamentoValor);
            PagamentoA novo = new PagamentoA(pagamentoNome, pagamentoValorDouble);
            listaPagamentos.add(novo);
            

    }
    public String getPagamentoList() {
        String resultado = "";
        for(PagamentoA pagamento: listaPagamentos) {
            resultado = resultado + "Tipo: " + pagamento.getTipo() + " valor: " + pagamento.getValor() + "\n";
            
        }
        return resultado;
    }
    
    public double totalPagamentos() {
        double total = 0;
        for(PagamentoA pagamento: listaPagamentos) {
            total = total + pagamento.getValor();
        }
        return total;
    }
    

    
    
}
