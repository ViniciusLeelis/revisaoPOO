package lista7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class arquivoMetod {
 
    public static void leitor(String ler) throws IOException {
        BufferedReader lerBuff = new BufferedReader(new FileReader(ler));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
 
            } else
                break;
            linha = lerBuff.readLine();
        }
        lerBuff.close();
    }
 
    public static void escritor(String escrever, String dado) throws IOException {
        BufferedWriter escreverBuff = new BufferedWriter(new FileWriter(escrever));

        escreverBuff.append(dado + "\n");
        escreverBuff.close();
    }   


}
