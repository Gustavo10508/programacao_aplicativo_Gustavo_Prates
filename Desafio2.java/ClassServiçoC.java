package javaapplication10;

public class ServicoCambio {
    private final double cotacao;

    public ServicoCambio(double cotacao) {
        this.cotacao = cotacao;
    }

    public double getCotacao() {
        return cotacao;
    }

    public double custoEmReais(double qtdUsd) {
        return qtdUsd * cotacao;
    }
}
