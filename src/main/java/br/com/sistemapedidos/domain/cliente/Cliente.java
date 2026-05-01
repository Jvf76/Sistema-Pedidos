package br.com.sistemapedidos.domain.cliente;

public class Cliente {
    private String nome;
    private String email;
    private Endereco endereco;

    public Cliente(String nome,  String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    public String dadosCliente(){
        return "Nome: " + this.nome
                + "\nEMAIIL: "+this.email
                + "\nEndereço: "+ getEndereco().imprimeEndereço();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
