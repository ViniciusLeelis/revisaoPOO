/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Produto implements Serializable {
    private static final long serialVersionUID = 1;
    String id;
    String nome;
    String comentario;
    int quantidade;
    double preco;
    public Produto(String id, String nome, int quantidade, double preco, String comentario) {
        this.id = id;
        this.nome = nome;
        this.comentario = comentario;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getComentario() {
        return comentario;
    }
    public void setQuantidade(int qtd) {
        this.quantidade = qtd;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
        
    }
    @Override
    public String toString() {
        return " Produto: " + nome + " Quantidade: " + quantidade + " preco: " + preco;
    }



}
