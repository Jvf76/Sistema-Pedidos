package br.com.sistemapedidos.domain.pedido;


import java.io.IOException;

public class Produto {
    private int id;
    private String nome;
    private double preco;


    public Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        if (preco == 0 || preco <0){
            throw new IllegalArgumentException("Valor invalido");
        }
        this.preco = preco;


    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }



}
