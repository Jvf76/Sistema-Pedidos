package br.com.sistemapedidos.aplication;

import br.com.sistemapedidos.domain.cliente.Cliente;
import br.com.sistemapedidos.domain.cliente.Endereco;
import br.com.sistemapedidos.domain.entrega.FormaEntrega;
import br.com.sistemapedidos.domain.pagamento.FormaPagamento;
import br.com.sistemapedidos.domain.pagamento.PagamentoDebito;
import br.com.sistemapedidos.domain.pedido.Pedido;
import br.com.sistemapedidos.domain.pedido.Produto;
import br.com.sistemapedidos.domain.entrega.EntregaRapida;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("av getulio vargas",222, "38700233","centro");
        Cliente cliente = new Cliente("joao","77777777", "joao@gmail.com", endereco);
        Pedido pedido = new Pedido(cliente);

        Produto produto1 = new Produto(1, "celular", 2000);
        Produto produto2 = new Produto (2,"mouse", 200);
        Produto produto3 = new Produto (3,"lapis", 100);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.adicionarProduto(produto3);

        FormaPagamento pagamento = new PagamentoDebito();
        pedido.setFormaPagamento(pagamento);

        FormaEntrega entrega = new EntregaRapida();
        pedido.setFormaEntrega(entrega);
        pedido.imprime();


    }
}
