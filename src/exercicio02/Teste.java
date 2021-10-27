package exercicio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa p = new Pessoa("Carlos", LocalDate.parse("11/04/1995", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 1.85);
        p.setNome("Carlos");
        p.setAltura(1.85);
        Pessoa p2 = new Pessoa("Ariane", 25, 1.85);
        agenda.armazenaPessoa(p.getNome(), p.getIdade(), (float) p.getAltura());
        agenda.armazenaPessoa(p2.getNome(), p2.getIdade(), (float) p2.getAltura());
        agenda.removePessoa("Carlos");
        agenda.imprimeAgenda();


    }
}
