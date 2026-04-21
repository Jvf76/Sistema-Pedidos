package br.com.sistemapedidos.test;

import br.com.sistemapedidos.domain.Cliente;
import br.com.sistemapedidos.domain.Pedido;

public class PedidoTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("joao", "99999999", "joao@gmail");
        Pedido  pedido = new Pedido(cliente);
    }
}
