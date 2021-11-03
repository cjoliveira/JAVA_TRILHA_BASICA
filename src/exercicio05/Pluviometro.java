package exercicio05;

public class Pluviometro {
    private String tipo;
    private int capacidade;

    public Pluviometro(String tipo){
        this.tipo = tipo;
        if(tipo.equals("p")){
            this.capacidade = 50;
        }else if(tipo.equals("m")){
            this.capacidade = 100;
        }else {
            this.capacidade = 200;
        }
    }

    public String getTipo() {
        return tipo;
    }
    public int getCapacidade() {
        return capacidade;
    }

}
