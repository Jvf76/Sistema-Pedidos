package br.com.sistemapedidos.domain.entrega;

public class RetirarNaloja implements FormaEntrega{
    @Override
    public String entrega(String entrega) {
        return "0";
    }

    @Override
    public int calcularFrete(int frete) {
        return 0;
    }
}
