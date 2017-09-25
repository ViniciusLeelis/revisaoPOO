package ex3_ex4;

/**
 *
 * @author Vinicius Lelis
 */

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
    Scanner leitor = new java.util.Scanner(System.in);
    double[] valores;
    valores = new double[5];
    double maior= 0;
    double menor= Double.MAX_VALUE;
    
    
    for (int v = 0; v < valores.length; v++) {
        System.out.println("A seguir digite cinco números inteiros: ");
        valores[v] = leitor.nextDouble();
         
 }
   for (int i = 0; i < valores.length; i++) {
       if(maior < valores[i])
           maior= Math.max(maior, valores[i]);
           
       if(menor > valores[i])
           menor= Math.min(menor, valores[i]);
   }
        System.out.println("Maior:" + maior);
        System.out.println("Menor:" + menor);
}
}