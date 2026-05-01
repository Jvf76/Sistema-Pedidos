package br.com.sistemapedidos.domain.entrega;

public class EntregaPadrao implements FormaEntrega{
    @Override
    public String entrega() {
        return "Entrega Padrão";
    }

    @Override
    public double calcularFrete() {
        return 20.00;
    }
}
