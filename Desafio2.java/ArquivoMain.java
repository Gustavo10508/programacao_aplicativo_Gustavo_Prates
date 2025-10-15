package desafio.dois;

import java.util.Scanner;

public class CaixaRapidoRefatorado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria(100.0, 0.0);
        ServicoCambio cambio = new ServicoCambio(5.32);
        ExtratoBancario extrato = new ExtratoBancario(50);
        SimuladorEmprestimo simulador = new SimuladorEmprestimo();

        int opcao = -1;
        String opcao2;

        while (opcao != 0) {
            System.out.println("""
                               ===CAIXA RAPIDO===
                               1-Saldo
                               2-Deposito
                               3-Extrato
                               4-Simular Emprestimo
                               5-Comprar Dollar
                               0-Sair""");
            System.out.println("\nInsira a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Seu saldo em REAIS: R$" + conta.getSaldoReais());
                    System.out.println("Seu saldo em DOLAR: US$" + conta.getSaldoDolares() + "\n");
                    voltarOuEncerrar(entrada);
                }

                case 2 -> {
                    System.out.println("Insira o valor do deposito: ");
                    double valor = entrada.nextDouble();
                    entrada.nextLine();
                    conta.depositar(valor);
                    extrato.registrar(new Movimentacao("Depósito", valor));
                    voltarOuEncerrar(entrada);
                }

                case 3 -> {
                    extrato.imprimir();
                    System.out.println("\nSaldo atual:");
                    System.out.println("Reais: R$ " + conta.getSaldoReais());
                    System.out.println("Dólar: US$ " + conta.getSaldoDolares());
                    voltarOuEncerrar(entrada);
                }

                case 4 -> {
                    System.out.println("Insira o valor do emprestimo: ");
                    double emprestimo = entrada.nextDouble();
                    System.out.println("Insira o salário bruto: ");
                    double salario = entrada.nextDouble();
                    System.out.println("Insira o número de parcelas: ");
                    int parcelas = entrada.nextInt();
                    entrada.nextLine();
                    simulador.simular(emprestimo, salario, parcelas);
                    voltarOuEncerrar(entrada);
                }

                case 5 -> {
                    System.out.println("Seu saldo em reais: R$ " + conta.getSaldoReais());
                    System.out.println("Qual a quantidade de dólar deseja comprar? Cotação: " + cambio.getCotacao());
                    double compra = entrada.nextDouble();
                    entrada.nextLine();

                    double custo = cambio.custoEmReais(compra);
                    if (custo > conta.getSaldoReais()) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        System.out.print("Confirmar compra? (S/N): ");
                        String conf = entrada.nextLine();
                        if (conf.equalsIgnoreCase("S")) {
                            conta.comprarDolar(compra, custo);
                            extrato.registrar(new Movimentacao("Compra de dólar (-)", -custo));
                            extrato.registrar(new Movimentacao("Depósito em dólar (+)", compra));
                            System.out.println("Compra realizada com sucesso!");
                        }
                    }
                    voltarOuEncerrar(entrada);
                }

                case 0 -> System.out.println("Sistema encerrado...");
            }
        }
    }

    private static void voltarOuEncerrar(Scanner entrada) {
        System.out.println("""
                           Deseja voltar ao menu inicial, digite: (V)
                           Deseja encerrar o programa, digite: (E)""");
        String opcao = entrada.nextLine();
        if (opcao.equalsIgnoreCase("E")) {
            System.out.println("Sistema encerrado...");
            System.exit(0);
        }
    }
}
