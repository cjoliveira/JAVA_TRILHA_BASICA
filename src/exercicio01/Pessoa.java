package exercicio01;


import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(String nome, LocalDate dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void imprimeDadosPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + String.format("%.2f", this.altura) + "m");
    }

    public int getIdade(){
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        // Calcula o periodo entre uma data e outro, muito util, varios métodos
        return Period.between(this.dataNascimento, hoje).getYears();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
