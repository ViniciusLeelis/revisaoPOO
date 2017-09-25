package exercicio6;
import javax.swing.JOptionPane;
/**
 *  
 * @author Vinicius Lelis
 */
public class listaClientes {
    Cliente[] clientes;
    
    public listaClientes() {
        clientes = new Cliente[10];   
    }
    public void cadastrarCliente() {
        for(int i =0; i<clientes.length; i++) {
            if(clientes[i]==null){
                String name = JOptionPane.showInputDialog("Digite o nome do cliente");
                String email = JOptionPane.showInputDialog("Digite o email do: " + name);
                String telefone = JOptionPane.showInputDialog("Digite o telefone do: " + name);
                String endereco = JOptionPane.showInputDialog("Digite o endereço do: " + name);
                Cliente novo = new Cliente(name, email, telefone, endereco, 0);
                clientes[i] = novo;
                
            }
        }
    }
    public void excluirCliente() {
        String idtext = JOptionPane.showInputDialog("Digite o ID do cliente que deseja excluir: ");
        int id = Integer.parseInt(idtext);
        int confirm = JOptionPane.showConfirmDialog(null, "Deseja excluir o cliente: " + clientes[id] + "?");
        if (confirm == JOptionPane.YES_OPTION) {
            for(int i=0; i<clientes.length; i++) {
                if(id==i){
                    clientes[i] = null;
                }
                else {
                    excluirCliente();
                }                 
            }             
        }              
    }
    
    public void editarCliente() {
        String question = JOptionPane.showInputDialog("Digite o ID do cliente que deseja alterar !");
        int id = Integer.parseInt(question);
        for(int i=0; i<clientes.length; i++) {
            if(id==i){
                int sim = JOptionPane.showConfirmDialog(null, "Informações conferem?: \n ID: " + id + "Nome: " + clientes[id].getNome() + "\n email: " + clientes[id].getEmail() + "\n telefone: " + clientes[id].getTelefone() + "\n endereço: " + clientes[id].getEndereco());
                if(sim == JOptionPane.YES_OPTION)
                    editarCliente();
                else {
                    String nome = JOptionPane.showInputDialog("Digite o novo nome");
                    clientes[id].setNome(nome);
                    String email = JOptionPane.showInputDialog("Digite o novo email:");
                    clientes[id].setEmail(email);
                    String telefone = JOptionPane.showInputDialog("Digite o novo telefone: ");
                    clientes[id].setTelefone(telefone);
                    String endereco = JOptionPane.showInputDialog("Digite o novo endereço: ");
                    clientes[id].setEndereco(endereco);
                }
                    
            
         }
    }
}

    void alterarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
