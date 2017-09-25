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
public class listaDespesas {
    public ArrayList<Despesa> listaDespesas = new ArrayList<>();
    
    public ArrayList<Despesa> getListaDespesas() {
        return listaDespesas;
    }

    public void addListaDespesas() {
            String despesaNome = JOptionPane.showInputDialog("Digite o nome da despesa");
            String despesaValor = JOptionPane.showInputDialog("Digite o valor da despesa");
            double despesaValorDouble = Double.parseDouble(despesaValor);
            Despesa novo = new Despesa(despesaNome, despesaValorDouble);
            listaDespesas.add(novo);
        
    }
    public String getListDespesas() {
        String resultado = "";
        for(Despesa despesa: listaDespesas) {
            resultado = resultado + "Tipo: " + despesa.getTipo() + " valor: " + despesa.getValor() + "\n";
        }
        return resultado;
    }
    
    public double totalDespesas() {
        double total = 0;
        for(Despesa despesa: listaDespesas) {
            total = total + despesa.getValor();
        }
        return total;
    }
    

    
    
}
