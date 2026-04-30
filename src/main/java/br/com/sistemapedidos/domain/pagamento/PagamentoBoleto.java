package br.com.sistemapedidos.domain.pagamento;

public class PagamentoBoleto implements FormaPagamento{
    @Override
    public double calculaValorTotal(double valorTotal) {
        return valorTotal;
    }

    @Override
    public double calculaDesconto(double valorTotal) {
        return 0;
    }
}
