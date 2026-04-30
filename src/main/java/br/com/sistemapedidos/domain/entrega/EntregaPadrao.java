package br.com.sistemapedidos.domain.entrega;

public class EntregaPadrao implements FormaEntrega{
    @Override
    public String entrega() {
        return "Entrega Padrão";
    }

    @Override
    public int calcularFrete() {
        return 20;
    }
}
