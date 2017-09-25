package lista4;

/**
 *
 * @author Vinicius Lelis
 */
public class Professor extends Pessoa {
    private String numeroRegistro;
    private int quantidadeHora;

    public Professor(String nome, String telefone, String email, String numeroRegistro, int quantidadeHora) {
        super(nome, telefone, email);
        this.numeroRegistro = numeroRegistro;
        this.quantidadeHora = quantidadeHora;
        
    }
    
    public String dadosFormatados()  {
        String dadosFormatados = super.dadosFormatados();
        dadosFormatados = dadosFormatados+"\nRegistro: " +this.getNumeroRegistro();
        dadosFormatados = dadosFormatados+"\nHora/Aula: "+this.getQuantidadeHoraAula();
        return dadosFormatados();
    }
    
    public String getNumeroRegistro(){
        return numeroRegistro;
    }
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public int getQuantidadeHoraAula() {
        return quantidadeHora;
    }
    public void setQuantidadeHoraAula(int quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }
    
    
}
