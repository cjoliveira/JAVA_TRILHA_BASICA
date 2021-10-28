package exercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Carlos", LocalDate.parse("11/04/1995", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 1.85);
        System.out.println(p.getIdade());
    }
}
