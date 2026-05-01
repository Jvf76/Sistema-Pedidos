package br.com.sistemapedidos.domain.cliente;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String cnpj;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }
    public String dadosCliente(){
        return "Nome: " + this.nome
                + "\nCpf: "+this.cpf
                + "\nEMAIIL: "+this.email
                + "\nEndereço: "+ getEndereco().imprimeEndereço();
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
