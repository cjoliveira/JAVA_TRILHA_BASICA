package exercicio02;

import java.util.Scanner;

public class MainEx02 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("Testando exercício02... Agenda");
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

}
