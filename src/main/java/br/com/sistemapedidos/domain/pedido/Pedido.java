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

    public double calculaDesconto(){
        double desconto = formaPagamento.calculaDesconto(valorTotal);
        return desconto;
    }

    public double calcularValorFinal(){
       return formaPagamento.calculaValorTotal(valorTotal) + calcularFrete();

    }


    public String getTipoEntrega(){
       return formaEntrega.entrega();

    }

    public int calcularFrete(){
        return formaEntrega.calcularFrete();
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
