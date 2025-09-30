/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);

        // Desafio JAVA 01
        int opcao;
        String opcao2;                  
        double reais, dolar, deposito;

        opcao = -1;
        reais = 100.00;
        dolar = 0.00;

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
                            System.out.println("Valor inserido com sucesso!");
                        } else {
                            System.out.println("""
                                               Valor invalido!!!
                                               O deposito deve ser maior que R$ 0,00 e ate R$ 5.000,00.
                                               Digite novamente.""");

                            System.out.println("""
                                               Deseja voltar ao menu inicial, digite: (V)
                                               Deseja encerrar o programa, digite: (E)""");
                        }
                    } while (deposito <= 0 || deposito >= 5000);

                    System.out.println("""
                                       Deseja voltar ao menu inicial, digite: (V)
                                       Deseja encerrar o programa, digite: (E)""");

                    opcao2 = entrada.nextLine();

                    if (opcao2.equalsIgnoreCase("E")) {
                        opcao = 0;
                        System.out.println("Sistema encerrado...");
                    }
                }
                
                
                
                
            }
        }
    }
}
