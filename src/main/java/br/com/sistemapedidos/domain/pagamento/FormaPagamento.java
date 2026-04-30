package br.com.sistemapedidos.domain.pagamento;

public interface FormaPagamento {
    double calculaValorTotal(double valorTotal);
    double calculaDesconto(double valorTotal);
}
