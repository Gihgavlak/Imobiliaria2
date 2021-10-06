package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sistema {
    private static Scanner capturaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        System.out.println("Bem vindo a Imobiliária Grande Família!");
        System.out.println("Digite a opção desejada");
        System.out.println("\n1 - Cadastrar novo imóvel");
        System.out.println("\n2 - Exibir imóveis cadastrados");
        System.out.println("\n3 - Remover morador do imóvel");
        System.out.println("\n4 - Sair do programa");
        System.out.println("-----------------------------------------");
    }

    //Cadastrar  morador
    public static Moradores cadastrarMorador() {
        String nomeMorador = capturaDados("Digite o nome do morador: ").nextLine();
        String cpfMorador = capturaDados("Digite o cpf do morador:").nextLine();
        String telefoneMorador = capturaDados("Digite o telefone do morador: ").nextLine();
        double rendaMorador = capturaDados("Digite a renda mensal do morador: R$").nextDouble();

        Moradores morador = new Moradores(nomeMorador, cpfMorador, telefoneMorador, rendaMorador);
        return morador;
    }
    //Adicionar Morador

    public static Imovel adicionarMorador(Imovel imovel) {
        int quantidadeMoradores = capturaDados("Digite a quantidade de moradores deseja cadastrar").nextInt();

        while (imovel.getMoradoresDoImovel().size() < quantidadeMoradores) {
            int contador = imovel.getMoradoresDoImovel().size() + 1;

            System.out.println("cadastre o morador: ");
            Moradores morador = cadastrarMorador();
            imovel.getMoradoresDoImovel();
        }
        return imovel;
    }

      //verificar cpf do Morador
      private static boolean validarCpfExistente(Imobiliaria imobiliaria, Moradores morador) {

        // Percorrer minha lista de imóveis
          String verificarCpf = morador.getCpf();
          for (Imovel imovelIndice : imobiliaria.getImoveis()) {

              // Percorrer todas as listas dos moradores
              for (Moradores referenciaMorador : imovelIndice.getMoradoresDoImovel()) {
                  if (referenciaMorador.getCpf().equals(verificarCpf)) {
                      return true;
                  }
              }
          }
          return false;
      }

    // exibir lista de moradores
    public static List<Moradores> exibirListaMoradores() {
        for (Moradores referencia : exibirListaMoradores()) {

        }
        return exibirListaMoradores();
    }

    //método remover morador
    public static String removerMorador(Imobiliaria imobiliaria) {

        // cpf a ser removido
        String cpf = capturaDados("Digite o cpf do morador a ser removido").nextLine();

        // percorrer a lista de imoveis dentro da imobiliaria
        for (Imovel percorrerListaImoveis : imobiliaria.getImoveis()) {

            //percorrer a lista de moradores dentro de imoveis
            for (Moradores percorrerListaMoradores : percorrerListaImoveis.getMoradoresDoImovel()) {

                //excluindo
                if (percorrerListaMoradores.getCpf().equals(cpf)) {
                    percorrerListaImoveis.getMoradoresDoImovel().remove(percorrerListaMoradores);
                    return "Morador removido";
                }
            }
        }
        return "Morador Não Cadastrado";
    }



    //Cadastrar Funcionario
    public static FuncionarioResponsavel cadastrarFuncionario() {
        String nomeFuncionario = capturaDados("Digite o nome do funcionário responsável: ").nextLine();
        String cpfFuncionario = capturaDados("Digite o CPF do funcionário responsável: ").nextLine();
        String telefoneFuncionario = capturaDados("Digite o telefone do funcionário: ").nextLine();
        String cateiraDeTrabalho = capturaDados("Digite o número da carteira de trabalho: ").nextLine();

        FuncionarioResponsavel novoFuncionario = new FuncionarioResponsavel(nomeFuncionario, cpfFuncionario, telefoneFuncionario, cateiraDeTrabalho);
        return novoFuncionario;
    }

    //Cadastrar  imóvel
    public static Imovel cadastrarImovel() {
        String endereco = capturaDados("Digite o endereço do imóvel: ").nextLine();
        double valorAluguel = capturaDados("Qual o valor do aluguel? R$").nextDouble();

        Imovel novoImovel = new Imovel(endereco, valorAluguel, cadastrarImovel(), cadastrarFuncionario());
        return novoImovel;
    }

        // executando menu
    public static void executar(){
        Imobiliaria imobiliaria = new Imobiliaria();

        boolean exibirMenu = true;

        while (exibirMenu) {

            menuInicial();

            int opcao = capturaDados("\n Digite a opção selecionada: ").nextInt();

            if(opcao==1){

                //cadastrar imovel
             Imovel imovel = cadastrarImovel();
             imobiliaria.adicionarImovel(imovel);
             FuncionarioResponsavel funcionarioResponsavel = cadastrarFuncionario();
             imovel.setFuncionarioImobiliaria(funcionarioResponsavel);
             cadastrarMorador();

            }else if (opcao == 2){

                //Exibir lista
                System.out.println(imobiliaria);

            }else if (opcao ==3){

                //remover morador
                String removerMorador = removerMorador(imobiliaria);

            }else if (opcao ==4){

                System.out.println("Operação encerrada");
                exibirMenu = false;
            }
        }

    }


}