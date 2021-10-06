package br.com.zup;

public class FuncionarioResponsavel extends Pessoa{
    private String carteiraDeTrabalho;

    public FuncionarioResponsavel(){

    }

    public FuncionarioResponsavel(String nome, String cpf, String telefone, String carteiraDeTrabalho) {
        super(nome, cpf, telefone);
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\n Carteira de trabalho: "+carteiraDeTrabalho);
        return retorno.toString();
    }
}
