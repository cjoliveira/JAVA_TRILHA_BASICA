package exercicio05;

import java.util.Arrays;

public enum TipoCaminhao {
    ALFA("Alfa"),
    BETA("Beta"),
    ENCERRA("fim"),
    REPETE("repete");

    private final String tipo;

    TipoCaminhao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static TipoCaminhao getTipoByString(String tipo){
        return Arrays.stream(values()).filter(item -> item.tipo.equalsIgnoreCase(tipo)).findFirst().orElseThrow();
    }
}
