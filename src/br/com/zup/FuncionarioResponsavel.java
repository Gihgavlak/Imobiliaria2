package br.com.zup;

public class FuncionarioResponsavel extends Pessoa{

    public FuncionarioResponsavel(){

    }

    public FuncionarioResponsavel(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        return retorno.toString();
    }
}
