package atividade.java;

import java.util.Scanner;
import java.util.Random;

public class AtividadeJava {

    public static void main(String[] args) {

        //                      Atividade01 
//      double nota;
//        Scanner entrada = new Scanner(System.in);
//
//        do {
//            System.out.println("Digite a nota desejada (0 a 10): ");
//            nota = entrada.nextDouble();
//
//            if (nota < 0 || nota > 10) {
//                System.out.println("ERRO. Digite apenas números entre 0 e 10.");
//            }
//
//        } while (nota < 0 || nota > 10);
//
//        System.out.println("Sua nota é: " + nota);
        
        //                       Atividade02
//        int numero;
//        int soma = 0;
//        int qntd = 0;
//
//        Scanner entrada = new Scanner(System.in);
//
//        do {
//            System.out.println("Digite um número (0 para sair): ");
//            numero = entrada.nextInt();
//
//            if (numero != 0) {
//                soma += numero;
//                qntd++;
//            }
//
//        } while (numero != 0);
//
//        if (qntd > 0) {
//            float media = (float) soma / qntd;
//            System.out.println("Soma: " + soma);
//            System.out.println("Quantidade de números: " + qntd);
//            System.out.printf("Média: %.2f\n", media);
//        } else {
//            System.out.println("Nenhum número válido foi digitado.");
//        }
//
//        entrada.close();

//                               Atividade03
 
// 
//               Scanner entrada = new Scanner(System.in);
//               Random random = new Random();
//               
//               int numero_secreto = random.nextInt(100) + 1;
//               int palpite;
//               int tentativas = 0;
//               
//               System.out.println("Tente adivinhar o numero de 1 a 100");
//               
//               do{
//                   System.out.println("digite seu palpite");
//                   palpite = entrada.nextInt();
//                   tentativas++;
//                   
//                   if (palpite>numero_secreto){
//                       System.out.println("numero alto");
//                   }
//                   if (numero_secreto >=100){
//                       System.out.println("valor invalido, numero apenas menor que 100");
//                   }
//                   else if(palpite<numero_secreto){
//                       System.out.println("numero baixo");
//                   }
//               
//               } while (palpite !=numero_secreto);
//                       
//                       System.out.println("ganou em" +tentativas+ "tentativas");
////   

//                               Atividade04

//                      Scanner entrada = new Scanner(System.in);
//                      
//                      int n;
//                      
//                     
//                      
//                      
//                      do {
//                          
//                          System.out.println("Digite o numero desejado");
//                      n = entrada.nextInt();
//                      
//                      if (n < 0){
//                          System.out.println("valor invalido");
//                          
//                      }
//                      
//
//                      }
//                      while (n < 0);
//                            System.out.println("Numero valido" + n );
////                             
//    


                                // Atividade05
//
                           Scanner entrada = new Scanner(System.in);

                           senha = "senai123";
                           tentativas = 3;
                           
                         while (tentativas)  
                          do{
                          
                          if (senha){
                          
                              System.out.println("acesso concedido");
                          }
                          
                          }while (senha) 

//        }



    }
    }

