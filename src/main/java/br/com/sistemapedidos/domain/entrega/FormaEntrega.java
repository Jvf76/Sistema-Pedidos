package br.com.sistemapedidos.domain.entrega;

public interface FormaEntrega {
    String entrega(String entrega);
    int calcularFrete(int frete);
}
