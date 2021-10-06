package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    public class Sistema {
        private static Scanner capturaDados(String mensagem){
            System.out.println(mensagem);
            return new Scanner(System.in);
        }
        public static void menuInicial(){
            System.out.println("Bem vindo a Imobiliária Grande Família!");
            System.out.println("Digite a opção desejada");
            System.out.println("\n1 - Cadastrar novo imóvel");
            System.out.println("\n2 - Exibir imóveis cadastrados");
            System.out.println("\n3 - Remover morador do imóvel");
            System.out.println("\n4 - Sair do programa");
            System.out.println("-----------------------------------------");
        }
        //Cadastrar  morador
        public static Moradores cadastrarMorador(){
            String nomeMorador = capturaDados("Digite o nome do morador: ").nextLine();
            String cpfMorador = capturaDados("Digite o cpf do morador:").nextLine();
            String telefoneMorador = capturaDados("Digite o telefone do morador: ").nextLine();
            double rendaMorador = capturaDados("Digite a renda mensal do morador: R$").nextDouble();

            Moradores morador = new Moradores(nomeMorador, cpfMorador, telefoneMorador, rendaMorador);
            return morador;
        }
        // exibir lista de moradores
        public static List<Moradores>exibirListaMoradores(){
            for (Moradores referencia: exibirListaMoradores()) {

            }
            return exibirListaMoradores();
        }

        //Cadastrar Funcionario
        public static FuncionarioResponsavel cadastrarFuncionario(){
            String nomeFuncionario = capturaDados("Digite o nome do funcionário responsável: ").nextLine();
            String cpfFuncionario = capturaDados("Digite o CPF do funcionário responsável: ").nextLine();
            String telefoneFuncionario = capturaDados("Digite o telefone do funcionário: ").nextLine();
            String cateiraDeTrabalho = capturaDados("Digite o número da carteira de trabalho: ").nextLine();

            FuncionarioResponsavel novoFuncionario = new FuncionarioResponsavel(nomeFuncionario,cpfFuncionario,telefoneFuncionario, cateiraDeTrabalho);
            return novoFuncionario;
        }
        //Cadastrar  imóvel
        public static Imovel cadastrarImovel(){
            String endereco = capturaDados("Digite o endereço do imóvel: ").nextLine();
            double valorAluguel = capturaDados("Qual o valor do aluguel? R$").nextDouble();

            Imovel novoImovel = new Imovel(endereco,valorAluguel,cadastrarImovel(),cadastrarFuncionario());
            return novoImovel;
        }


    }