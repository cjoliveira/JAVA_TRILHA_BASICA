package exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainEx01 {

    public static void main(String[] args){
        System.out.println("Testando exercício01... Digite os dados necessários: ");
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

}
