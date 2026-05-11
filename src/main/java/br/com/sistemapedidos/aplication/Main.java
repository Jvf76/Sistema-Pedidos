package br.com.sistemapedidos.aplication;

import br.com.sistemapedidos.domain.NotaFiscal;
import br.com.sistemapedidos.domain.atendente.AtendenteVirtual;
import br.com.sistemapedidos.domain.cliente.Cliente;
import br.com.sistemapedidos.domain.cliente.Endereco;
import br.com.sistemapedidos.domain.cliente.ClientePessoaFisica;
import br.com.sistemapedidos.domain.cliente.ClientePessoaJuridica;
import br.com.sistemapedidos.domain.entrega.FormaEntrega;
import br.com.sistemapedidos.domain.pagamento.FormaPagamento;
import br.com.sistemapedidos.domain.pagamento.PagamentoDebito;
import br.com.sistemapedidos.domain.pagamento.PagamentoPix;
import br.com.sistemapedidos.domain.pedido.Pedido;
import br.com.sistemapedidos.domain.pedido.Produto;
import br.com.sistemapedidos.domain.entrega.EntregaRapida;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("av getulio vargas", 222, "38700233", "centro");
        Cliente cliente = new ClientePessoaFisica("joao", "998989898988", "joao@gmail.com", endereco);
        Cliente cliente2 = new ClientePessoaJuridica("jose", "9797666555", "josee@gmail.com", endereco);
        AtendenteVirtual atendente = new AtendenteVirtual();
        Pedido pedido = new Pedido(cliente);

        NotaFiscal notaFiscal = new NotaFiscal(pedido);

        atendente.adicionarClienteAtendidos(cliente);
        atendente.adicionarClienteAtendidos(cliente2);
        atendente.listaClientesAtendidos();

        try {
            Produto produto1 = new Produto(1, "celular", 2200);
            pedido.adicionarProduto(produto1);
            Produto produto2 = new Produto(2, "mouse", 189);
            pedido.adicionarProduto(produto2);
            Produto produto3 = new Produto(3, "lapis", 2);
            pedido.adicionarProduto(produto3);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }


//        FormaPagamento pagamento = new PagamentoPix();
//        pedido.setFormaPagamento(pagamento);
        try {
            FormaEntrega entrega = new EntregaRapida();
            pedido.setFormaEntrega(entrega);
        } catch (IllegalStateException e) {
            System.out.println("F " + e.getMessage());
        }


        try {
            notaFiscal.imprimeNotaFiscal();
        } catch (IllegalStateException e) {
            System.out.println("Erro ao gerar nota fiscal " + e.getMessage());
        }

    }
}
