package br.com.sistemapedidos.domain.entrega;

public class RetirarNaLoja implements FormaEntrega{
    @Override
    public String entrega() {
        return "Retirada na loja";
    }

    @Override
    public int calcularFrete() {
        return 0;
    }
}
