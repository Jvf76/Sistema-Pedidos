package br.com.sistemapedidos.domain.pagamento;

public class PagamentoPix implements FormaPagamento {
    @Override
    public double calculaValorTotal(double valorTotal) {
        double valorDesconto = valorTotal * 0.15;
        return valorTotal - valorDesconto;
    }

    @Override
    public double calculaDesconto(double valorTotal) {
        double desconto = valorTotal * 0.15;
        return desconto;
    }
}
