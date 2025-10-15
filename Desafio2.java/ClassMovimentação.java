package desafio.dois;

public class Movimentacao {
    private final String descricao;
    private final double valor;

    public Movimentacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + ": " + (valor >= 0 ? "+R$ " : "-R$ ") + String.format("%.2f", Math.abs(valor));
    }
}
