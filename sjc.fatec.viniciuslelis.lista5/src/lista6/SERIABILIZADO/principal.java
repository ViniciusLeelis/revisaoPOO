package br.com.fatec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class principal {

	public static void main(String[] args) throws Exception {
		/*FileWriter escritor = 
				new FileWriter("C:\\Users\\Gerson" 
						+ "\\Desktop\\pessoa.txt");
		escritor.write("Moro rules!!!");
		escritor.close();*/
		
		FileReader leitor = 
				new FileReader("C:\\Users\\Gerson"
						+ "\\Desktop\\pessoa.txt");
		BufferedReader buffer = new BufferedReader(leitor);
		String texto = buffer.readLine();
		
		System.out.println(texto);
	}
}