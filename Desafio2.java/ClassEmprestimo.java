package javaapplication10;

import java.util.Random;

public class SimuladorEmprestimo {
    private final double jurosPorParcela = 0.02;
    private final int[] permitidas = {6, 12, 18, 24, 30, 36, 40, 48, 56, 60, 72};

    public boolean parcelaValida(int qt) {
        for (int p : permitidas) {
            if (p == qt) return true;
        }
        return false;
    }

    public void simular(double emprestimo, double salario, int parcelas) {
        if (emprestimo < 200 || emprestimo > 1000000) {
            System.out.println("Valor inválido! Deve ser entre R$200 e R$1.000.000");
            return;
        }

        if (!parcelaValida(parcelas)) {
            System.out.println("Número de parcelas inválido!");
            return;
        }

        double jurosTotais = emprestimo * jurosPorParcela * parcelas;
        double montante = emprestimo + jurosTotais;
        double valorParcela = montante / parcelas;
        double limiteParcela = salario * 0.30;

        if (limiteParcela >= valorParcela) {
            int protocolo = 100000 + new Random().nextInt(900000);
            System.out.println("\nEmpréstimo disponível. Protocolo EM" + protocolo);
            System.out.printf("Valor da parcela: R$ %.2f x %d\n", valorParcela, parcelas);
            System.out.println("Valor do empréstimo: R$ " + emprestimo);
            System.out.printf("Valor total a pagar: R$ %.2f\n", montante);
        } else {
            System.out.println("Empréstimo indisponível (parcela maior que 30% do salário).");
        }
    }
}
