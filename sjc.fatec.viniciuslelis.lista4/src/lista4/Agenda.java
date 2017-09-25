package lista4;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vinicius Lelis
 */
public class Agenda {
    private List<Aluno> alunos;
    private List<Professor> professores;
    public Scanner leitor = new Scanner(System.in);
    
    public void listarTodos() {
        System.out.println("Lista de contatos de alunos: ");
        for(Aluno aluno:alunos) {
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("Telefone: "+aluno.getTelefone());
            System.out.println("Email: "+aluno.getEmail());
            System.out.println("Número de matricula:"+aluno.getNumeroMatricula());
            
        }
        System.out.println("Lista de contatos de professores: " );
        for(Professor professor:professores) {
            System.out.println("Nome: "+professor.getNome());
            System.out.println("Telefone: "+professor.getTelefone());
            System.out.println("Email: "+professor.getEmail());
            System.out.println("Número de Registro:"+professor.getNumeroRegistro());
            System.out.println("Quantidade Hora: " +professor.getNumeroRegistro()+"\n");
        }
    }
    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next();
        System.out.println("Digite o telefone do aluno: ");
        String telefone = leitor.next();
        System.out.println("Digite o email do aluno: ");
        String email = leitor.next();
        System.out.println("Digite o número de matricula do aluno: ");
        String matricula = leitor.next();
        Aluno novo = new Aluno(nome, telefone, email, matricula);
        alunos.add(novo);
        
    }
    public void cadastrarProfessor() {
        System.out.println("Digite o nome do professor: ");
        String nome = leitor.next();
        System.out.println("Digite o telefone do professor: ");
        String telefone = leitor.next();        
        System.out.println("Digite o email do professor: ");
        String email = leitor.next();       
        System.out.println("Digite o número de registro do professor: ");
        String matricula = leitor.next();
        System.out.println("Digite a quantidade de hora: ");
        int quantidadeHora = leitor.nextInt();
        Professor novo = new Professor(nome, telefone, email, matricula, quantidadeHora);
        professores.add(novo);
        
    }
    public void alterarAluno() {
        System.out.println("Digite o número de matricula do aluno: ");
        String numero = leitor.next();
        for(Aluno aluno: alunos){
            if(numero.equals(aluno.getNome())){
                System.out.println("O que você deseja alterar ?");
            }
        }
    }
    
    public void alterarProfessor() {
        System.out.println("Digite o número de registro do professor: ");
        String numero = leitor.next();
        for(Professor professor: professores){
            if(numero.equals(professor.getNome())){
                System.out.println("O que você deseja alterar ?");
            }
        }
    }
    
    
    public void excluirProfessor(){
        System.out.println("Digite o número de registro do professor: ");
        String numero = leitor.next();
        for(Professor professor: professores){
            if(numero.equals(professor.getNumeroRegistro())){
                professores.remove(professor);
                System.out.println("Professor: " + professor.getNome() + " excluido com sucesso");
            }
            else {    
                System.out.println("Número de registro inválido");
            }
        }
    }
    public void excluirAluno(){
        System.out.println("Digite o número de matricula do aluno: ");
        String numero = leitor.next();
        for(Aluno aluno: alunos){
            if(numero.equals(aluno.getNumeroMatricula())){
                alunos.remove(aluno);
                System.out.println("Aluno: " + aluno.getNome() + " excluido com sucesso");
                    
                }
            else {
                System.out.println("Número de matricula inválido");
            }
        }
    }
}

