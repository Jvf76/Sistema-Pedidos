package br.com.sistemapedidos.domain.pedido;
import br.com.sistemapedidos.domain.cliente.Cliente;
import br.com.sistemapedidos.domain.entrega.FormaEntrega;
import br.com.sistemapedidos.domain.pagamento.FormaPagamento;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private double valorTotal;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private FormaEntrega formaEntrega;



    public Pedido(Cliente cliente) {
        this.cliente = cliente;

    }

    public void imprime(){
        imprimeCliente();
        imprimeProduto();
        imprimePagamento();
        imprimeEntrega();
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
        double valorFinal = formaPagamento.calculaValorTotal(valorTotal) + formaEntrega.calcularFrete();

        System.out.println("\nValor total do pedido: " + (this.valorTotal+formaEntrega.calcularFrete()));
        if (desconto > 0) {
            System.out.println("Desconto aplicado" + desconto);
            System.out.println("Valor total do pedido com desconto: " + valorFinal);

        }
    }

    public void imprimeEntrega(){
        String entrega = formaEntrega.entrega();
        int frete = formaEntrega.calcularFrete();
        System.out.println("Endereço para entrega: " + cliente.getEndereco().getRua() + ", Numero: " + cliente.getEndereco().getNumero() + " Bairro: " + cliente.getEndereco().getBairro() + " CEP: " + cliente.getEndereco().getCep() );
        System.out.println("Forma de Entrega: " + entrega );
        System.out.println("Valor: " + frete );
    }

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        valorTotal += produto.getPreco();
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
}
