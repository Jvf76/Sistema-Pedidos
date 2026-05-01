package br.com.sistemapedidos.domain;

import br.com.sistemapedidos.domain.pedido.Pedido;

public class NotaFiscal {
    private Pedido pedido;

    public NotaFiscal(Pedido pedido) {
        this.pedido = pedido;
    }

    public void imprimeNotaFiscal(){
        System.out.println("====== Nota Fiscal =========");
        pedido.imprime();

    }
}

