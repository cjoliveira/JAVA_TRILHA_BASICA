package exercicio05;

import java.util.List;

public class Caminhao {

    private String tipo;
    private int totalPluviometros;
    List<Pluviometro> listaPluviometros;

    public Caminhao(String tipo, int totalPluviometros, List<Pluviometro> listaPluviometros) {
        this.tipo = tipo;
        this.totalPluviometros = totalPluviometros;
        this.listaPluviometros = listaPluviometros;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTotalPluviometros() {
        return totalPluviometros;
    }

    public List<Pluviometro> getListaPluviometros() {
        return listaPluviometros;
    }

}
