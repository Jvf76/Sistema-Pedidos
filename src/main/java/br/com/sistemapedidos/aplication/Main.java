package br.com.sistemapedidos.aplication;

import br.com.sistemapedidos.domain.Cliente;
import br.com.sistemapedidos.domain.Pedido;
import br.com.sistemapedidos.domain.Produto;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao","77777777", "joao@gmail.com");
        Pedido pedido = new Pedido(cliente);
        Produto produto1 = new Produto(1, "celular", 2000);
        Produto produto2 = new Produto (2,"mouse", 200);
        Produto produto3 = new Produto (3,"lapis", 100);
        Produto produto4 = new Produto (4,"tesoura", 100);
        Produto produto5 = new Produto (5,"mochila", 100);
        Produto produto6 = new Produto (6,"borracha", 100);
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);
        pedido.adicionarProduto(produto4);
        pedido.adicionarProduto(produto5);
        pedido.adicionarProduto(produto6);
        pedido.imprime();


    }
}
