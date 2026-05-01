package br.com.sistemapedidos.domain.entrega;

public class EntregaRapida implements FormaEntrega{
    @Override
    public String entrega() {
        return "Entrega rápida";
    }

    @Override
    public double calcularFrete() {
        return 40.00;
    }
}
