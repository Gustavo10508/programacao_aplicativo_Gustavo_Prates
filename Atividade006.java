package atividade.java;

import java.util.Scanner;
import java.util.Random;

public class AtividadeJava {

    @SuppressWarnings("empty-statement")
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
               Scanner entrada = new Scanner(System.in);
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



                                // Atividade05

                            
//                            String senhaCorreta = "senai123";
//                            String senhaDigitada;
//                            int tentativas = 3;
//                            
//                            do{
//                            
//                            System.out.println("Digite sua senha");
//                            senhaDigitada = entrada.nextLine();
//                            if (senhaDigitada.equals(senhaCorreta)){
//                            
//                                System.out.println("senha correta" );
//                                break;
//                                
//                            }
//                            else{
//                                tentativas--;
//                                System.out.println("senha invalida" + tentativas);
//                            }
//                            }while ( tentativas>0); 
//                            
//                            if (tentativas ==0)
//                                
//                                System.out.println("voce esgotou suas tentativas");
////                            
//                            
                                   
//                                 Atividade06

//  Scanner entrada = new Scanner(System.in);             
//
//        System.out.println("Digite o número para ver a tabuada:");
//        int numero = Integer.parseInt(entrada.nextLine());
//
//        int resultado;
//
//        for (int i = 0; i <= 10; i++) {
//            resultado = numero * i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }
//
//        entrada.close();
    
                             // Atividade07
    
//                           int num,resultado, resultado2;
//                           resultado=0;
//                           resultado2=0;       
//                           System.out.println("insira o numero: ");
//                           num = entrada.nextInt();
//                           
//                           for (int i = 0; i <=num; i++) {
//                               if(i%2==0){
//                            resultado += i;
//                               }
//                               else{ resultado2 +=i;}
//                               
//                           }
//                           System.out.println("soma dos numeros pares ate "+ num+ ":"+resultado);
//                           System.out.println("soma dos numeros impares ate "+ num+ ":"+resultado2);
//            
//                          entrada.close(); 
//                        
    
    
    
                                        //Atividade 08
                                        
                                        
//                                int num;
//                                System.out.println("Insira um número:");
//                                num = entrada.nextInt();
//
//                                for (int i = 2; i <= num; i++) {
//                                    boolean ehPrimo = true;
//
//                                    for (int divisor = 2; divisor < i; divisor++) {
//                                        if (i % divisor == 0) {
//                                            ehPrimo = false;
//                                            break;
//                                        }
//                                    }
//
//                                    if (ehPrimo) {
//                                        System.out.print(i + " ");
//                                    }
//                                }
    }


}
    
    
    
    
    
    
    
    

package atividade.java;

import java.util.Scanner;
import java.util.Random;

public class AtividadeJava {

    @SuppressWarnings("empty-statement")
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
               Scanner entrada = new Scanner(System.in);
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



                                // Atividade05

                            
//                            String senhaCorreta = "senai123";
//                            String senhaDigitada;
//                            int tentativas = 3;
//                            
//                            do{
//                            
//                            System.out.println("Digite sua senha");
//                            senhaDigitada = entrada.nextLine();
//                            if (senhaDigitada.equals(senhaCorreta)){
//                            
//                                System.out.println("senha correta" );
//                                break;
//                                
//                            }
//                            else{
//                                tentativas--;
//                                System.out.println("senha invalida" + tentativas);
//                            }
//                            }while ( tentativas>0); 
//                            
//                            if (tentativas ==0)
//                                
//                                System.out.println("voce esgotou suas tentativas");
////                            
//                            
                                   
//                                 Atividade06

//  Scanner entrada = new Scanner(System.in);             
//
//        System.out.println("Digite o número para ver a tabuada:");
//        int numero = Integer.parseInt(entrada.nextLine());
//
//        int resultado;
//
//        for (int i = 0; i <= 10; i++) {
//            resultado = numero * i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }
//
//        entrada.close();
    
                             // Atividade07
    
//                           int num,resultado, resultado2;
//                           resultado=0;
//                           resultado2=0;       
//                           System.out.println("insira o numero: ");
//                           num = entrada.nextInt();
//                           
//                           for (int i = 0; i <=num; i++) {
//                               if(i%2==0){
//                            resultado += i;
//                               }
//                               else{ resultado2 +=i;}
//                               
//                           }
//                           System.out.println("soma dos numeros pares ate "+ num+ ":"+resultado);
//                           System.out.println("soma dos numeros impares ate "+ num+ ":"+resultado2);
//            
//                          entrada.close(); 
//                        
    
    
    
                                        //Atividade 08
                                        
                                        
//                                int num;
//                                System.out.println("Insira um número:");
//                                num = entrada.nextInt();
//
//                                for (int i = 2; i <= num; i++) {
//                                    boolean ehPrimo = true;
//
//                                    for (int divisor = 2; divisor < i; divisor++) {
//                                        if (i % divisor == 0) {
//                                            ehPrimo = false;
//                                            break;
//                                        }
//                                    }
//
//                                    if (ehPrimo) {
//                                        System.out.print(i + " ");
//                                    }
//                                }
    }


}
    
    
    
    
    
    
    
    

package atividade.java;

import java.util.Scanner;
import java.util.Random;

public class AtividadeJava {

    @SuppressWarnings("empty-statement")
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
               Scanner entrada = new Scanner(System.in);
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



                                // Atividade05

                            
//                            String senhaCorreta = "senai123";
//                            String senhaDigitada;
//                            int tentativas = 3;
//                            
//                            do{
//                            
//                            System.out.println("Digite sua senha");
//                            senhaDigitada = entrada.nextLine();
//                            if (senhaDigitada.equals(senhaCorreta)){
//                            
//                                System.out.println("senha correta" );
//                                break;
//                                
//                            }
//                            else{
//                                tentativas--;
//                                System.out.println("senha invalida" + tentativas);
//                            }
//                            }while ( tentativas>0); 
//                            
//                            if (tentativas ==0)
//                                
//                                System.out.println("voce esgotou suas tentativas");
////                            
//                            
                                   
//                                 Atividade06

//  Scanner entrada = new Scanner(System.in);             
//
//        System.out.println("Digite o número para ver a tabuada:");
//        int numero = Integer.parseInt(entrada.nextLine());
//
//        int resultado;
//
//        for (int i = 0; i <= 10; i++) {
//            resultado = numero * i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }
//
//        entrada.close();
    
                             // Atividade07
    
//                           int num,resultado, resultado2;
//                           resultado=0;
//                           resultado2=0;       
//                           System.out.println("insira o numero: ");
//                           num = entrada.nextInt();
//                           
//                           for (int i = 0; i <=num; i++) {
//                               if(i%2==0){
//                            resultado += i;
//                               }
//                               else{ resultado2 +=i;}
//                               
//                           }
//                           System.out.println("soma dos numeros pares ate "+ num+ ":"+resultado);
//                           System.out.println("soma dos numeros impares ate "+ num+ ":"+resultado2);
//            
//                          entrada.close(); 
//                        
    
    
    
                                        //Atividade 08
                                        
                                        
//                                int num;
//                                System.out.println("Insira um número:");
//                                num = entrada.nextInt();
//
//                                for (int i = 2; i <= num; i++) {
//                                    boolean ehPrimo = true;
//
//                                    for (int divisor = 2; divisor < i; divisor++) {
//                                        if (i % divisor == 0) {
//                                            ehPrimo = false;
//                                            break;
//                                        }
//                                    }
//
//                                    if (ehPrimo) {
//                                        System.out.print(i + " ");
//                                    }
//                                }
    }


}
    
    
    
    
    
    
    
    

