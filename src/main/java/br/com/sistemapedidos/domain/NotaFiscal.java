package br.com.sistemapedidos.domain;

import br.com.sistemapedidos.domain.pedido.Pedido;

public class NotaFiscal {
    private Pedido pedido;

    public NotaFiscal(Pedido pedido) {
        this.pedido = pedido;
    }

    public void imprimeNotaFiscal(){
        System.out.println("====== Nota Fiscal =========");
        System.out.println(pedido.getCliente().dadosCliente());
        System.out.println("================");
        System.out.println(pedido.getTipoEntrega()+"\nFRETE: "+pedido.calcularFrete());
        System.out.println("================");
        pedido.dadosProduto();
        System.out.println("\n=================");
        System.out.println("Valor dos produtos "+pedido.calcularValorFinal());
        System.out.println("Desconto aplicado: "+pedido.calculaDesconto());
        System.out.println("Valor total: " + pedido.calcularValorFinal());


    }
}

