package ex3_ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner leitor = new java.util.Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int one = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int two = leitor.nextInt();
        if((one%two)==0)
            System.out.println(one +" é multiplo de " + two);
        else
            System.out.println(one + " não é multiplo de " + two);
        
    }
}
