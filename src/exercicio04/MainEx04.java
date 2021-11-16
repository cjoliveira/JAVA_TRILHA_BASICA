package exercicio04;

import java.util.Scanner;

public class MainEx04 {
    public static void main(String[] args){
        Televisao tv = new Televisao();
        ControleRemoto controle = new ControleRemoto(tv);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Testando exercício04... Controle Remoto TV");
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
                    controle.aumentaVolume();
                    System.out.println("sucess test");
                    break;
                case 2:
                    controle.diminuiVolume();
                    System.out.println("sucess test");
                    break;
                case 3:
                    controle.incrementaCanal();
                    System.out.println("sucess test");
                    break;
                case 4:
                    controle.diminuiCanal();
                    System.out.println("sucess test");
                    break;
                case 5:
                    System.out.print("Digite o canal que deseja: ");
                    int canal = entrada.nextInt();
                    controle.trocaCanal(canal);
                    System.out.println("sucess test");
                    break;
                case 6:
                    controle.consultaEstado();
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
}
