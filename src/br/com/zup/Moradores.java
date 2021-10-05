package br.com.zup;

public class Moradores extends Pessoa {
    private double renda;

    public Moradores(){

    }

    public Moradores(String nome, String cpf, String telefone, double renda) {
        super(nome, cpf, telefone);
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n"+ super.toString());
        retorno.append(("\n Renda: "+renda ));
        return retorno.toString();
    }
}
