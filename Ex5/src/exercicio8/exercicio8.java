package exercicio8;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class exercicio8 {
    public static void main(String[] args) {   
    int valor, temp;
    String valorStr;
    char[] letraSeparada;
    int finalResults[] = null;
    Scanner leitor;
    leitor = new Scanner(System.in);
        System.out.println("Digite o valor que deseja criptografar de 4 digitos");
        valor = leitor.nextInt();
        valorStr = Integer.toString(valor);
        letraSeparada = valorStr.toCharArray();
        
        for (int i = 0; i < letraSeparada.length; i++) {
            int finalResult = finalResults[i];
            finalResults[i] = Integer.parseInt(letraSeparada[i] + "");
            finalResults[i] = (((finalResults[i])+7)%10);
            int tmp = finalResults[0];
            finalResults[0] = finalResults[2];
            finalResults[2] = tmp;
            tmp = finalResults[1];
            finalResults[1] = finalResults[3];
            finalResults[3] = tmp;
            System.out.println(finalResults[i]);
            
        }           
        
}
    
}
