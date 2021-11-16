package exercicio04;


public class Televisao{

    private int canalAtual;
    private int volumeAtual;
    private int totalCanais; // Ideia: Criar uma lista com todos canais, podendo até consumir de outra classe ou de algum lugar
    private int volumeMax;

    public Televisao(){
        this.canalAtual = 12;
        this.volumeAtual = 10;
        this.totalCanais = 100; // Podia ser um parametro do construtor
        this.volumeMax = 100;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public int getTotalCanais() {
        return totalCanais;
    }

    public int getVolumeMax() {
        return volumeMax;
    }


}
