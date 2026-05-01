package br.com.sistemapedidos.domain.cliente;

public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public ClientePessoaFisica(String nome, String cpf, String email, Endereco endereco) {
        super(nome, email, endereco);
        this.cpf = cpf;
    }

    @Override
    public String dadosCliente() {
        return "Nome: " + getNome()
                + "\nCPF: " + this.cpf
                + "\nEmail: " + getEmail()
                + "\nEndereço: " + getEndereco().imprimeEndereço();
    }
}