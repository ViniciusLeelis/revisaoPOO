package exercicio3;

import java.util.Scanner;
/**
 *
 * @author Vinicius Lelis
 */
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0; int sair = 0; 
        String insertedPlaca;
        Clientes cliente = new Clientes();

        while(sair == 0){
            switch(opcao){
                case 0: {
                    System.out.println("Sem bem-vindo ao Estacionamento for Zombies !");
                    System.out.println("- Digite 1 para cadastrar um carro | \n - Digite 2 para consultar a cobrança do cliente ! | \n - Digite 3 para sair | \n");
                    opcao = leitor.nextInt();
                }
                case 1:{
                    cliente.cadastrarCarro();
                    System.out.println("Digite o tempo total(em horas): ");
                    int tempo = leitor.nextInt();
                    cliente.setTempo(tempo);
                    System.out.println("Carro cadastrado com sucesso");
                    opcao = leitor.nextInt();
                    continue;
                }
  
                case 2: {
                    System.out.println("Verificar veiculo: Insira a placa do veiculo: ");
                    insertedPlaca = leitor.next();
                    System.out.println("O cliente da placa: " + cliente.getPlaca());
                    System.out.println("Valor pago até agora é de: ");
                    double taxa;
                    if (cliente.getTempo() <= 3) {
                        taxa = 2.00;
                        cliente.setValue(taxa);
                        System.out.println("R$" + cliente.getValue());
                        }
                        else {
                          taxa = (2.00 + (cliente.getTempo()*0.50));
                          cliente.setValue(taxa);
                          System.out.println("R$" + cliente.getValue());
                          }
                        } 
      
                case 3:{
                    sair = 1;

                    break;           
                }
                default:{
                    break;     
    }
            }
        }
    }
  }

