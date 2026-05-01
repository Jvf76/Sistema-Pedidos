package br.com.sistemapedidos.domain.cliente;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica(String nome, String cnpj, String email, Endereco endereco) {
        super(nome, email, endereco);
        this.cnpj = cnpj;
    }



    @Override
    public String dadosCliente() {
        return "Nome: " + getNome()
                + "\nCPF: " + this.cnpj
                + "\nEmail: " + getEmail()
                + "\nEndereço: " + getEndereco().imprimeEndereço();
    }

    @Override
    public Endereco getEndereco() {
        return super.getEndereco();
    }
}
