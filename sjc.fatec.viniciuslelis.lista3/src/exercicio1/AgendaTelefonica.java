package exercicio1;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class AgendaTelefonica {
       private Pessoa[] pessoas;
       private Scanner scanner;
       
       public AgendaTelefonica(){
           pessoas = new Pessoa[5];
           scanner = new Scanner(System.in);
       }
       public void cadastrarPessoa() {
           for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i]==null) {
                System.out.println("\n Insira um nome válido: ");
                String nome = scanner.next();
                System.out.println("Insira um telefone válido: ");
                String telefone = scanner.next();
                System.out.println("Insira um email válido: ");
                String email = scanner.next();
                Pessoa nova = new Pessoa(nome, email, telefone);
                pessoas[i] = nova;
                System.out.println("Contato adicionado com sucesso !");
                break;
                }
            }
       }
       public void imprimirOpcoes() {
           System.out.println("Escolha uma das opções abaixo:");
           System.out.println("1 - Listar contatos. \n");
           System.out.println("2 - Incluir contatos. \n");
           System.out.println("3 - Sair \n");
       }
      public void imprimirPessoas() {
          for(Pessoa pessoa:pessoas) {
              if(pessoa != null)
                  System.out.println("\n Nome: " + pessoa.getNome() + "\n telefone: " + pessoa.getTelefone() + "\n email: " + pessoa.getEmail()); 
          } 
    }
    public Pessoa [] getPessoas() {
        return pessoas;
    }
    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
}
