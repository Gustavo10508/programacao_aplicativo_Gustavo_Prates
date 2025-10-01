/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication10 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Desafio JAVA 01
        int opcao, indiExtrato;
        String opcao2;
        double reais, dolar, deposito, emprestimo, salario;
        double[] extrato = new double[10];

        opcao = -1;
        reais = 100.00;
        dolar = 0.00;
        indiExtrato = 0;

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
                    System.out.println("Seu saldo em REAIS e de: R$" + reais
                            + "\nSeu saldo em DOLAR e: US$" + dolar + "\n");

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
                    do {
                        System.out.println("Insira o valor do deposito: ");
                        deposito = entrada.nextDouble();
                        entrada.nextLine();

                        if (deposito > 0 && deposito < 5000) {
                            reais = deposito + reais;

                            if (indiExtrato < extrato.length) {
                                extrato[indiExtrato] = deposito;
                                indiExtrato++;
                            } else {
                                System.out.println("Extrato cheio! Não é possível armazenar mais depósitos.");
                            }

                            System.out.println("Valor inserido com sucesso!");
                            System.out.println("O valor depositado e de R$" + deposito + "\n");

                        } else {
                            System.out.println("""
                                               Valor invalido!!!
                                               O deposito deve ser maior que R$ 0,00 e ate R$ 5.000,00.
                                               Digite novamente.\n""");

                            System.out.println("""
                                               Deseja voltar ao menu inicial, digite: (V)
                                               Deseja encerrar o programa, digite: (E)/n""");
                        }
                    } while (deposito <= 0 || deposito >= 5000);

                    System.out.println("""
                                       Deseja voltar ao menu inicial, digite: (V)
                                       Deseja encerrar o programa, digite: (E)\n""");

                    opcao2 = entrada.nextLine();

                    if (opcao2.equalsIgnoreCase("E")) {
                        opcao = 0;
                        System.out.println("Sistema encerrado...");
                    }
                }

                case 3 -> {
                    if (indiExtrato == 0) {
                        System.out.println("Nenhum extrato");
                    } else {
                        for (int i = indiExtrato - 1; i >= 0; i--) {
                            System.out.println((indiExtrato - i) + ") " + extrato[i]);
                        }

                        System.out.println("""
                                           Deseja voltar ao menu inicial, digite: (V)
                                           Deseja encerrar o programa, digite: (E)\n""");

                        opcao2 = entrada.nextLine();

                        if (opcao2.equalsIgnoreCase("E")) {
                            opcao = 0;
                            System.out.println("Sistema encerrado...");
                        }
                    }
                }

                case 4 -> {
                    System.out.println("Insira o valor do emprestimo");
                    emprestimo = entrada.nextDouble();

                    if (emprestimo < 200 && emprestimo > 1000000) {
                        System.out.println("Valor invalido\nO valor deve ser maior que 200 e menor que 100.000,00");
                    }

                    if (emprestimo >= 200 && emprestimo <= 1000000) {
                        System.out.println("Insira o salario bruto");
                        salario = entrada.nextDouble();
                        System.out.println("insira o numero de parcelas");
                    }

                    
                }
            }
        }
    }
}
