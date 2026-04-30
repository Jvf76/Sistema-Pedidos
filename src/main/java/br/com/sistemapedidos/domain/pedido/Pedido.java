package br.com.sistemapedidos.domain.pedido;
import br.com.sistemapedidos.domain.cliente.Cliente;
import br.com.sistemapedidos.domain.pagamento.FormaPagamento;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private double valorTotal;
    private Cliente cliente;
    private FormaPagamento formaPagamento;



    public Pedido(Cliente cliente) {
        this.cliente = cliente;

    }

    public void imprime(){
        imprimeCliente();
        imprimeProduto();
        System.out.println("\nValor total do pedido: " + this.valorTotal);
        System.out.println("Endereço para entrega: " + cliente.getEndereco().getRua() + ", Numero: " + cliente.getEndereco().getNumero() + " Bairro: " + cliente.getEndereco().getBairro() + " CEP: " + cliente.getEndereco().getCep() );
        imprimePagamento();
    }

    public void imprimeCliente(){
        System.out.println("Dados do cliente: ");
        System.out.println("CPF: "+ cliente.getCpf()+ "\n"+ "Nome " + cliente.getNome() + "\n" + "EMAIL: "+ cliente.getEmail());
    }

    public void imprimeProduto(){
        System.out.print("Produtos do pedido: ");
        for (Produto produto : produtos){
            System.out.print(produto.getNome()+", ");
        }
    }
    public void imprimePagamento(){
        double desconto = formaPagamento.calculaDesconto(valorTotal);
        double valorFinal = formaPagamento.calculaValorTotal(valorTotal);
        if (desconto > 0) {
            System.out.println("Desconto aplicado" + desconto);
        }
        System.out.println("Valor total do pedido " + valorFinal);
    }
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        valorTotal += produto.getPreco();
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
