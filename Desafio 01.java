package javaapplication10;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao = -1, parcelas, protocolo, indiExtrato = 0;
        String opcao2;
        double reais = 100.00, dolar = 0.0, compra, cot = 5.32, deposito, emprestimo, salario = 0, porcento, juros = 0.02;
        String[] extrato = new String[50]; // histórico textual

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
                    System.out.println("Seu saldo em REAIS: R$" + reais);
                    System.out.println("Seu saldo em DOLAR: US$" + dolar + "\n");
                    System.out.println("""
                                       Deseja voltar ao menu inicial, digite: (V)
                                       Deseja encerrar o programa, digite: (E)""");
                    opcao2 = entrada.nextLine();
                    if (opcao2.equalsIgnoreCase("E")) {
                        opcao = 0;
                        System.out.println("Sistema encerrado...");
                    }
                }

                case 2 -> {
                    double depositoLocal;
                    do {
                        System.out.println("Insira o valor do deposito: ");
                        depositoLocal = entrada.nextDouble();
                        entrada.nextLine();
                        if (depositoLocal > 0 && depositoLocal < 5000) {
                            reais += depositoLocal;
                            if (indiExtrato < extrato.length) {
                                extrato[indiExtrato] = "Depósito: R$ " + depositoLocal;
                                indiExtrato++;
                            }
                            System.out.println("Depósito realizado com sucesso!");
                        } else {
                            System.out.println("Valor inválido! Deve ser entre R$0 e R$5000.");
                        }
                    } while (depositoLocal <= 0 || depositoLocal >= 5000);
                    System.out.println("""
                                       Deseja voltar ao menu inicial, digite: (V)
                                       Deseja encerrar o programa, digite: (E)""");
                    opcao2 = entrada.nextLine();
                    if (opcao2.equalsIgnoreCase("E")) {
                        opcao = 0;
                        System.out.println("Sistema encerrado...");
                    }
                }

                case 3 -> {
                    if (indiExtrato == 0) {
                        System.out.println("Não há movimentações ainda.");
                    } else {
                        System.out.println("=== Extrato ===");
                        for (int i = 0; i < indiExtrato; i++) {
                            System.out.println((i + 1) + ") " + extrato[i]);
                        }
                    }
                    System.out.println("\nSaldo atual:");
                    System.out.println("Reais: R$ " + reais);
                    System.out.println("Dólar: US$ " + dolar);

                    System.out.println("""
                                       Deseja voltar ao menu inicial, digite: (V)
                                       Deseja encerrar o programa, digite: (E)""");
                    opcao2 = entrada.nextLine();
                    if (opcao2.equalsIgnoreCase("E")) {
                        opcao = 0;
                        System.out.println("Sistema encerrado...");
                    }
                }

                case 4 -> {
                    do {
                        System.out.println("Insira o valor do emprestimo: ");
                        emprestimo = entrada.nextDouble();
                        entrada.nextLine();
                        if (emprestimo < 200 || emprestimo > 1000000) {
                            System.out.println("Valor inválido! Deve ser entre R$200 e R$1.000.000");
                        } else {
                            System.out.println("Insira o salário bruto: ");
                            salario = entrada.nextDouble();
                            entrada.nextLine();

                            do {
                                System.out.println("Insira o número de parcelas (6,12,18,24,30,36,40,48,56,60,72): ");
                                parcelas = entrada.nextInt();
                                entrada.nextLine();
                                if (parcelas == 6 || parcelas == 12 || parcelas == 18 || parcelas == 24
                                        || parcelas == 30 || parcelas == 36 || parcelas == 40
                                        || parcelas == 48 || parcelas == 56 || parcelas == 60 || parcelas == 72) {

                                    double jurosTotais = emprestimo * juros * parcelas;
                                    double montante = emprestimo + jurosTotais;
                                    double valorParcela = montante / parcelas;
                                    porcento = salario * 0.30;

                                    if (porcento >= valorParcela) {
                                        Random random = new Random();
                                        protocolo = 100000 + random.nextInt(900000);
                                        System.out.println("\nEmpréstimo disponível. Protocolo EM" + protocolo);
                                        System.out.printf("Valor da parcela: R$ %.2f x %d\n", valorParcela, parcelas);
                                        System.out.println("Valor do empréstimo: R$ " + emprestimo);
                                        System.out.printf("Valor total a pagar: R$ %.2f\n", montante);
                                    } else {
                                        System.out.println("Empréstimo indisponível (parcela maior que 30% do salário).");
                                    }
                                } else {
                                    System.out.println("Número de parcelas inválido!");
                                }
                            } while (parcelas != 6 && parcelas != 12 && parcelas != 18 && parcelas != 24
                                    && parcelas != 30 && parcelas != 36 && parcelas != 40
                                    && parcelas != 48 && parcelas != 56 && parcelas != 60 && parcelas != 72);
                        }
                    } while (emprestimo < 200 || emprestimo > 1000000);

                    System.out.println("""
                                       Deseja voltar ao menu inicial, digite: (V)
                                       Deseja encerrar o programa, digite: (E)""");
                    opcao2 = entrada.nextLine();
                    if (opcao2.equalsIgnoreCase("E")) {
                        opcao = 0;
                        System.out.println("Sistema encerrado...");
                    }
                }

                case 5 -> {
                    String opcao3, conf;
                    double valor;
                    System.out.println("Seu saldo em reais: R$ " + reais);
                    System.out.println("Qual a quantidade de dólar deseja comprar? Cotação: " + cot);
                    compra = entrada.nextDouble();
                    entrada.nextLine();

                    if (compra * cot > reais) {
                        System.out.println("Saldo insuficiente!");
                        System.out.println("Deseja simular novamente (R), voltar ao menu (V) ou encerrar (E)?");
                        opcao3 = entrada.nextLine();
                        if (opcao3.equalsIgnoreCase("R")) opcao = 5;
                        if (opcao3.equalsIgnoreCase("E")) opcao = 0;
                    } else {
                        System.out.println("Para confirmar digite (S) e para cancelar digite (N)");
                        conf = entrada.nextLine();
                        if (conf.equalsIgnoreCase("S")) {
                            valor = compra * cot;
                            reais -= valor;
                            dolar += compra;
                            if (indiExtrato < extrato.length) {
                                extrato[indiExtrato] = "Compra de dólar: -R$ " + valor + " (US$ " + compra + ")";
                                indiExtrato++;
                            }
                            System.out.println("Compra realizada com sucesso!");
                        }
                        System.out.println("Reais: R$ " + reais + "\nDólar: US$ " + dolar);
                        System.out.println("Deseja simular novamente (R), voltar ao menu (V) ou encerrar (E)?");
                        opcao3 = entrada.nextLine();
                        if (opcao3.equalsIgnoreCase("R")) opcao = 5;
                        if (opcao3.equalsIgnoreCase("E")) opcao = 0;
                    }
                }
            }
        }
    }
}
