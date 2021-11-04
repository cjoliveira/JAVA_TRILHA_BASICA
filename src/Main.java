import exercicio01.Pessoa;
import exercicio02.Agenda;
import exercicio03.Elevador;
import exercicio04.ControleRemoto;
import exercicio04.Televisao;
import exercicio05.SelecionadorCaminhao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual exercício exercício que desja testar? ");
        System.out.print("""
                1) Pessoa
                2) Agenda
                3) Elevador
                4) Controle Remoto/TV
                5) Caminhão mais apto
                0) Encerrar programa         -> """);
        int opcao = entrada.nextInt();
        System.out.println("");
        while(opcao!=0){
            switch(opcao){
                case 1:
                    System.out.println("Testando exercício01... Digite os dados necessários: ");
                    executaTesteExercicio01();
                    break;
                case 2:
                    System.out.println("Testando exercício02... Agenda");
                    executaTesteExercicio02();
                    break;
                case 3:
                    System.out.println("Testando exercício03... Elevador");
                    executaTesteExercicio03();
                    break;
                case 4:
                    System.out.println("Testando exercício04... Controle Remoto TV");
                    executaTesteExercicio04();
                    break;
                case 5:
                    System.out.println("Testando exercício05... Caminhão mais apto");
                    executaTesteExercicio05();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
            System.out.print("\nContinuando teste dos exercicios... Escolha um deles ou 0 para sair: ");
            opcao = entrada.nextInt();
            if (opcao == 0){
                System.out.println("Encerrando programa...");
            }
        }
    }

    private static void executaTesteExercicio01() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.next();
        System.out.print("Data de nascimento: ");
        String dataNascimento = entrada.next();
        System.out.print("Altura: ");
        double altura = entrada.nextDouble();
        Pessoa p = new Pessoa(nome, LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")), altura);
        p.imprimeDadosPessoa();
    }

    private static void executaTesteExercicio02(){
        Scanner entrada = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("Criando agenda... Escolha uma das opções abaixo:");
        System.out.print("""
                1) Armazenar pessoa
                2) Remover pessoa
                3) Buscar pessoa pelo nome
                4) Imprimir dados da agenda
                5) Imprime dados da pessoa do indice a ser lido
                0) Sair do teste                                       -> """);
        int opcao = entrada.nextInt();
        while(opcao!=0){
            switch(opcao){
                case 1:
                    System.out.print("\nNome: ");
                    String nome = entrada.next();
                    System.out.print("Idade: ");
                    int idade = entrada.nextInt();
                    System.out.print("Altura: ");
                    float altura = entrada.nextFloat();
                    agenda.armazenaPessoa(nome, idade, altura);
                    System.out.println("Armazenado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome: ");
                    nome = entrada.next();
                    agenda.removePessoa(nome);
                    System.out.println("Removido com sucesso!");
                    break;
                case 3:
                    System.out.print("Nome: ");
                    nome = entrada.next();
                    System.out.println("O id do nome buscado é: " + agenda.buscaPessoa(nome));
                    break;
                case 4:
                    agenda.imprimeAgenda();
                    break;
                case 5:
                    System.out.print("Digite o indice que deseja imprimir: ");
                    int id = entrada.nextInt();
                    agenda.imprimePessoa(id);
                    break;
                default:
                    System.out.print("Opção inválida, tente novamente.");
                    break;
            }
            System.out.print("\nContinuando teste... Escolha uma das opções: ");
            opcao = entrada.nextInt();
            if (opcao == 0){
                System.out.println("Saindo...");
            }
        }

    }

    private static void executaTesteExercicio03(){
        Elevador elevador = new Elevador();
        Scanner entrada = new Scanner(System.in);
        System.out.println("-> Inicialize o Elevador.");
        System.out.print("Capacidade total do elevador: ");
        int capacidadeTotal = entrada.nextInt();
        System.out.print("Total de andares do predio: ");
        int totalAndares = entrada.nextInt();
        elevador.incializa(capacidadeTotal, totalAndares);
        System.out.println("Agora, selecione uma das opções: ");
        System.out.print("""
                1) Entrar
                2) Sair
                3) Subir
                4) Descer
                5) Imprimir dados
                0) Encerrar Exercício             -> """);
        int opcao = entrada.nextInt();
        while(opcao!=0){
            switch(opcao){
                case 1:
                    elevador.entra();
                    System.out.println("sucess test");
                    break;
                case 2:
                    elevador.sai();
                    System.out.println("sucess test");
                    break;
                case 3:
                    elevador.sobe();
                    System.out.println("sucess test");
                    break;
                case 4:
                    elevador.desce();
                    System.out.println("sucess test");
                    break;
                case 5:
                    System.out.println("Andar atual: " + elevador.getAndarAtual());
                    System.out.println("Capacidade do Elevador: " + elevador.getCapacidadeElevador());
                    System.out.println("Quantidade de pessoas no Elevador: " + elevador.getQtdPessoasNoElevador());
                    System.out.println("Total de andares no prédio: " + elevador.getTotalAndares());
                    System.out.println("sucess test");
                    break;
                default:
                    System.out.print("Opção inválida, tente novamente.");
                    System.out.println("sucess test");
                    break;
            }
            System.out.print("\nContinue... Escolha uma opção: ");
            opcao = entrada.nextInt();
            if(opcao == 0){
                System.out.println("Saindo...");
            }
        }
    }

    private static void executaTesteExercicio04(){
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione uma das opções: ");
        System.out.print("""
                1) Aumentar som
                2) Diminuir som
                3) Aumentar canal
                4) Diminuir canal
                5) Trocar para canal indicado
                6) Consultar estado
                0) Encerrar Exercício             -> """);
        int opcao = entrada.nextInt();
        while(opcao!=0){
            switch(opcao){
                case 1:
                    controle.aumentaVolume(tv);
                    System.out.println("sucess test");
                    break;
                case 2:
                    controle.diminuiVolume(tv);
                    System.out.println("sucess test");
                    break;
                case 3:
                    controle.incrementaCanal(tv);
                    System.out.println("sucess test");
                    break;
                case 4:
                    controle.diminuiCanal(tv);
                    System.out.println("sucess test");
                    break;
                case 5:
                    System.out.print("Digite o canal que deseja: ");
                    int canal = entrada.nextInt();
                    controle.trocaCanal(tv, canal);
                    System.out.println("sucess test");
                    break;
                case 6:
                    controle.consultaEstado(tv);
                    System.out.println("sucess test");
                    break;
                default:
                    System.out.print("Opção inválida, tente novamente.");
                    break;
            }
            System.out.print("\nContinue... Escolha uma opção: ");
            opcao = entrada.nextInt();
            if(opcao == 0){
                System.out.println("Saindo...");
            }
        }
    }

    private static void executaTesteExercicio05(){
        SelecionadorCaminhao.selecionaMaisApto();
    }

}
