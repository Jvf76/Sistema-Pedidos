package br.com.sistemapedidos.domain.entrega;

public class EntregaPadrao implements FormaEntrega{
    @Override
    public int entregaPadrao() {
        return 0;
    }

    @Override
    public int entegaRapida() {
        return 0;
    }
}
