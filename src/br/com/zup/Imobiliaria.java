package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();

    public Imobiliaria() {
    }

    public Imobiliaria(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n" +imoveis);
        retorno.append("\n Quantidade de imoveis: "+imoveis.size());
        return retorno.toString();

    }
}
