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
public class Aplicacao {
    public static Scanner leitor;
    public static void main(String[] args) {
        leitor = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();
        int sair = 0;
        int opcao = 0;
        while(sair == 0){
            switch(opcao){
                case 0: {
                    agenda.imprimirOpcoes();
                    opcao = leitor.nextInt();
                }
                case 1:{
                    agenda.imprimirPessoas();
                }
                case 2:{
                    agenda.cadastrarPessoa();
                    opcao = 0;
                    break;
                }
                case 3:{
                    sair = 1;
                    System.out.println("\n Até logo coleguinha \n");
                    break;           
                }
                default:{
                    agenda.imprimirOpcoes();
                    opcao = leitor.nextInt();
                    break;
                }
            } 
        }
    }
    
}
