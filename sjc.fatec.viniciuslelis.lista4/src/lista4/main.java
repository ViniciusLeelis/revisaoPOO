package lista4;
import java.util.Scanner;

/**
 *
 * @author Vinicius Lelis
 */
public class main extends Agenda {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("O que deseja fazer ? \n (1) adicionar aluno \n (2) alterar aluno \n (3) excluir aluno \n (4) adicionar professor (5) alterar professor (6) excluir professor");
        int opcao = leitor.nextInt();
        switch(opcao) {
            case 1: {
              agenda.cadastrarAluno();
            }
            case 2: {
              agenda.alterarAluno();
                
            }
            case 3: {
              agenda.excluirAluno();
            }
            case 4: {
              agenda.cadastrarProfessor();
            }
            case 5: {
              agenda.alterarProfessor();
            }
            case 6: {
              agenda.excluirProfessor();
            }
        }
    }
    
}
