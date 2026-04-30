package br.com.sistemapedidos.domain.entrega;

public class EntregaPadrao implements FormaEntrega{
    @Override
    public String entrega(String entrega) {
        return "20";
    }

    @Override
    public int calcularFrete(int frete) {
        return 0;
    }
}
