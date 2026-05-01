package br.com.sistemapedidos.domain.pedido;
import br.com.sistemapedidos.domain.cliente.Cliente;
import br.com.sistemapedidos.domain.entrega.FormaEntrega;
import br.com.sistemapedidos.domain.pagamento.FormaPagamento;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private double valorTotal;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private FormaEntrega formaEntrega;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void imprime(){
        System.out.println(cliente.dadosCliente());
        dadosProduto();
        dadosEntrega();
        dadosPagamento();
    }

    public void dadosPagamento(){
        double desconto = calculaDesconto();
        double valorFinal = valorFinal();
        System.out.println("\nValor total do pedido: " + (this.valorTotal+formaEntrega.calcularFrete()));
        if (desconto > 0) {
            System.out.println("Desconto aplicado" + desconto);
            System.out.println("Valor total do pedido com desconto: " + valorFinal);
        }
    }
    public double calculaDesconto(){
        double desconto = formaPagamento.calculaDesconto(valorTotal);
        return desconto;
    }

    public double valorFinal(){
        double valorFinal = formaPagamento.calculaValorTotal(valorTotal) + formaEntrega.calcularFrete();
        return valorFinal;
    }

    public void dadosEntrega(){
        String entrega = formaEntrega.entrega();
        int frete = formaEntrega.calcularFrete();
        System.out.println("Endereço para entrega: " + cliente.getEndereco().getRua() + ", Numero: " + cliente.getEndereco().getNumero() + " Bairro: " + cliente.getEndereco().getBairro() + " CEP: " + cliente.getEndereco().getCep() );
        System.out.println("Forma de Entrega: " + entrega );
        System.out.println("Valor: " + frete );
    }
    public void dadosProduto(){
        System.out.print("Produtos do pedido: ");
        for (Produto produto : produtos){
            System.out.print(produto.getNome()+", ");
        }
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setFormaEntrega(FormaEntrega formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public FormaEntrega getFormaEntrega() {
        return formaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
