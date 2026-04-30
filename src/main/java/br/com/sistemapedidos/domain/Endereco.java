package br.com.sistemapedidos.domain;

public class Endereco {
    private String rua;
    private int numero;
    private int cep;
    private String bairro;


    public Endereco(String rua, int numero, int cep, String bairro){
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
