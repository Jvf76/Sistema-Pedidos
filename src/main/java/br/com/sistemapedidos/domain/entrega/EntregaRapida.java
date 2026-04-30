package br.com.sistemapedidos.domain.entrega;

public class EntregaRapida implements FormaEntrega{
    @Override
    public int entregaPadrao() {
        return 0;
    }

    @Override
    public int entegaRapida() {
        return 0;
    }
}
