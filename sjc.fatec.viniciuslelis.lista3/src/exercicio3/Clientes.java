/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Clientes {
    String placa;
    double tempo;
    double value;
    
    public Clientes(String placa, double tempo, double value) {
        this.placa = placa;
        this.tempo = tempo;
        this.value = value;
    }

    Clientes() {}


    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public double getTempo() {
        return tempo;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }

    public void cadastrarCarro() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira uma placa válida: ");
        String cPlaca = leitor.next();
        if(cPlaca.length() <= 8) {
           this.placa = cPlaca;
           System.out.println("Placa válida ! \n");
            }
            else
                System.out.println("Digite um valor menor que 8 caracteres");
                
    }
    
    }
