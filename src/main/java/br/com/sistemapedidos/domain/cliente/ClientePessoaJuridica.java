package br.com.sistemapedidos.domain.cliente;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj, String email, Endereco endereco) {
        super(nome, email, endereco);
        this.cnpj = cnpj;
    }



    @Override
    public String dadosCliente() {
        return super.dadosCliente();
    }

    @Override
    public Endereco getEndereco() {
        return super.getEndereco();
    }
}
