package exercicio03;

import java.util.Scanner;

public class MainEx03 {

    public static void main(String[] args){
        Elevador elevador = new Elevador();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Testando exercício03... Elevador");
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

}
