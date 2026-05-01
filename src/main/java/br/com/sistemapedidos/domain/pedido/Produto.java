package br.com.sistemapedidos.domain.pedido;

import java.util.ArrayList;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private double valorTotal;


    public Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }



    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }



}
