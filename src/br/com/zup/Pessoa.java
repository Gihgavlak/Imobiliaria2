package br.com.zup;

public abstract class Pessoa {
    private String nome;
    private String Cpf;
    private String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        Cpf = cpf;
        this.telefone = telefone;
    }
}
