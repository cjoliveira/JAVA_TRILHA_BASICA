package exercicio05;

import java.util.Scanner;

// Abstrata, pois não precisaremos criar nenhum objeto dela. EXEMPLO DE COMPOSIÇÃO ESSE

public abstract class Controle {

    public static String leString(){
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    public static int leInteiro(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}
