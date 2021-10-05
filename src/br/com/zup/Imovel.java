package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String enderecoImovel;
    private double valorAluguel;
    private List<Moradores> moradoresDoImovel = new ArrayList<>();
    private List<FuncionarioResponsavel> funcionarioImobiliaria= new ArrayList();

    public Imovel() {
    }

    public Imovel(String enderecoImovel, double valorAluguel, List<Moradores> moradoresDoImovel, List<FuncionarioResponsavel> funcionarioImobiliaria) {
        this.enderecoImovel = enderecoImovel;
        this.valorAluguel = valorAluguel;
        this.moradoresDoImovel = moradoresDoImovel;
        this.funcionarioImobiliaria = funcionarioImobiliaria;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public List<Moradores> getMoradoresDoImovel() {
        return moradoresDoImovel;
    }

    public void setMoradoresDoImovel(List<Moradores> moradoresDoImovel) {
        this.moradoresDoImovel = moradoresDoImovel;
    }

    public List<FuncionarioResponsavel> getFuncionarioImobiliaria() {
        return funcionarioImobiliaria;
    }

    public void setFuncionarioImobiliaria(List<FuncionarioResponsavel> funcionarioImobiliaria) {
        this.funcionarioImobiliaria = funcionarioImobiliaria;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("\n Endereço do Imovel: "+ enderecoImovel);
        retorno.append("\n Valor do aluguel: "+valorAluguel);
        retorno.append(("\n Quantidade de Moradores: "+moradoresDoImovel.size()));
        retorno.append("\n Morador: "+moradoresDoImovel);
        retorno.append("\n Funcionario responsavel: "+ funcionarioImobiliaria);
        return retorno.toString();

    }
}
