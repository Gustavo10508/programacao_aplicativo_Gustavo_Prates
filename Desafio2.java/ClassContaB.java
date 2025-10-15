package desafio.dois;

public class ContaBancaria {
    private double saldoReais;
    private double saldoDolares;

    public ContaBancaria(double saldoInicialReais, double saldoInicialDolares) {
        this.saldoReais = saldoInicialReais;
        this.saldoDolares = saldoInicialDolares;
    }

    public double getSaldoReais() {
        return saldoReais;
    }

    public double getSaldoDolares() {
        return saldoDolares;
    }

    public void depositar(double valor) {
        if (valor > 0 && valor < 5000) {
            saldoReais += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido! Deve ser entre R$0 e R$5000.");
        }
    }

    public void comprarDolar(double qtdUsd, double custoEmReais) {
        saldoReais -= custoEmReais;
        saldoDolares += qtdUsd;
    }
}
