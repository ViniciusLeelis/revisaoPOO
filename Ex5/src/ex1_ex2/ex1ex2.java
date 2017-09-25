/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_ex2;
import java.util.Scanner;

/**
 *
 * @author Vinicius Lelis
 */
public class ex1ex2 { // Exercicio 1, 2

     public static void main(String[] args) {
        Scanner leitor = new java.util.Scanner(System.in);
	System.out.println("Por gentileza, digite o primeiro valor inteiro: ");
	int numero1 = leitor.nextInt();
	System.out.println("Por gentileza, digite o segundo valor inteiro: ");
	int numero2 = leitor.nextInt();
        System.out.println("A soma dos dois valores é: " + (numero1+numero2));
        System.out.println("A subtração dos dois valores é: " + (numero1-numero2));
        System.out.println("A divisão dos dois valores é: " + (numero1/numero2));
        System.out.println("O produto dos dois valores é: " + (numero1*numero2));
        System.out.println("A média dos dois valores é:" + ((numero1+numero2)/2));
        if (numero1 > numero2) {
            System.out.println("Ordem crescente:" + numero1 + " -> " + numero2);
        } else {
            System.out.println("Ordem crescente:" + numero2 + " -> " + numero1);
        }
	}
}

