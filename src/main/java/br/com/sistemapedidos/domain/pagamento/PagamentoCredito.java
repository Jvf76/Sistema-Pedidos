package br.com.sistemapedidos.domain.pagamento;

public class PagamentoCredito implements FormaPagamento{

    @Override
    public double calculaValorTotal(double valorTotal) {
        return valorTotal;
    }

    @Override
    public double calculaDesconto(double calculaDesconto) {
        return 0;
    }
}
