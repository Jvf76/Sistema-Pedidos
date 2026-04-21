package br.com.sistemapedidos.domain;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private double valorTotal;
    private Cliente cliente;
    private Endereco endereco;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;

    }

    public void imprime(){

        System.out.println("Dados do cliente: ");
        System.out.println("CPF: "+ cliente.getCpf()+ "\n"+ "Nome " + cliente.getNome() + "\n" + "EMAIL: "+ cliente.getEmail());
        System.out.print("Produtos do pedido: ");

        for (Produto produto : produtos){
            System.out.print(produto.getNome()+", ");
        }
        System.out.println("\nValor total do pedido: " + this.valorTotal);
        System.out.println("Endereço para entrega: " + cliente.getEndereco().getRua());

    }
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }


    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }


}
