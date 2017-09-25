package exercicio4;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String j1 = JOptionPane.showInputDialog("Digite o primeiro valor: ");      
        int primeiro = Integer.parseInt(j1);
        String j2 = JOptionPane.showInputDialog("Digite o segundo valor: ");
        int segundo = Integer.parseInt(j2);
        Inteiros inteiro = new Inteiros(primeiro, segundo);
        if(inteiro.multiplo()==true)
            JOptionPane.showMessageDialog(null, "O número: " + segundo + " é múltiplo de: " + primeiro);
        else
            JOptionPane.showMessageDialog(null, "O número: " + segundo + " não é multiplo do: " + primeiro);
        
        
    }
}
