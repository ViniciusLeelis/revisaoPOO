package exercicio7;
import java.util.Scanner;
/**
 *
 * @author Vinicius Lelis
 */
public class exercicio7 {
    public static void main(String[] args) {
        Scanner leitor;
        leitor = new Scanner(System.in);
        int salarioBruto;
        int horaExtra;
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasTotais = leitor.nextInt();
        System.out.println("Digite o valor da hora normal");
        int horaNormal = leitor.nextInt();
        salarioBruto = (horasTotais*horaNormal);
        if(horasTotais <= 40) {
            System.out.println("Seu salário bruto é: " + salarioBruto);
        }
        else {
            horaExtra = horasTotais-40;
            double salarioExtra = horaNormal*0.5;
            System.out.println("Seu salario bruto é: ");
            System.out.println(salarioBruto+(horaExtra*salarioExtra));
            
             }
    }
    
}
