package exercicio6;
/**
 *
 * @author Admin
 */
public class Cliente {
    String nome;
    String email;
    String telefone;
    String endereco;
    double totalGasto;
    double mes[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public Cliente(String nome, String email, String telefone, String endereco, double totalGasto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.totalGasto = totalGasto;
    }

    Cliente() {
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void totalGasto(int totalGasto) {
        this.totalGasto = totalGasto;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public double getGasto() {
        return totalGasto;
    }
    public void cadastrarValor(int value){
        for(int i = 0; i< mes.length; i++) {
            mes[i] = value;
            }
        }
}

