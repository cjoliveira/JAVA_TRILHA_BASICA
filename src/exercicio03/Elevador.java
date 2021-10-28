package exercicio03;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdPessoasNoElevador;

    public void incializa(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    public void entra(){
        if(qtdPessoasNoElevador<capacidadeElevador){
            qtdPessoasNoElevador++;
        }else{
            System.out.println("Elevador cheio, uma pessoa não pode entrar");
        }
    }

    public void sai(){
        if(qtdPessoasNoElevador>0){
            qtdPessoasNoElevador--;
        }else{
            System.out.println("Não há pessoas para sair do elevador");
        }
    }

    public void sobe(){
        if(andarAtual<totalAndares){
            andarAtual++;
        }else{
            System.out.println("Já estamos no último andar, não podemos subir");
        }
    }

    public void desce(){
        if(andarAtual>0){
            andarAtual--;
        }else{
            System.out.println("Já estamos no térreo, não podemos descer");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoasNoElevador() {
        return qtdPessoasNoElevador;
    }

    public void setQtdPessoasNoElevador(int qtdPessoasNoElevador) {
        this.qtdPessoasNoElevador = qtdPessoasNoElevador;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }
}
