//package atividade008;
//
//import java.util.Scanner;
//
//public class Atividade008 {
//
//    // QUESTÃO 01
//    public static double calcDelt(double a, double b, double c){
//        return (b * b) - (4 * a * c);
//    }
//
//    // QUESTÃO 02
//    public static int soma1(int a, int b) {
//        return a + b;
//    }
//    public static int sub2(int a, int b) {
//        return a - b;
//    }
//    public static int multi(int a, int b) {
//        return a * b;
//    }
//    public static int div(int a, int b) {
//        return a / b;
//    }
//
//    // QUESTÃO 03.01
//    public static void calendarioOp(int escolha) {
//        switch (escolha) {
//            case 1 -> System.out.println("JANEIRO");
//            case 2 -> System.out.println("FEVEREIRO");
//            case 3 -> System.out.println("MARÇO");
//            case 4 -> System.out.println("ABRIL");
//            case 5 -> System.out.println("MAIO");
//            case 6 -> System.out.println("JUNHO");
//            case 7 -> System.out.println("JULHO");
//            case 8 -> System.out.println("AGOSTO");
//            case 9 -> System.out.println("SETEMBRO");
//            case 10 -> System.out.println("OUTUBRO");
//            case 11 -> System.out.println("NOVEMBRO");
//            case 12 -> System.out.println("DEZEMBRO");
//            default -> System.out.println("O número deve ser entre 1 e 12");
//        }
//    }
//
//    // QUESTÃO 03.02
//    public static String anoDia(int select) {
//        String[] calen = {
//            "Janeiro", "Fevereiro", "Março", "Abril",
//            "Maio", "Junho", "Julho", "Agosto",
//            "Setembro", "Outubro", "Novembro", "Dezembro"
//        };
//        if (select >= 1 && select <= 12) {
//            return calen[select - 1];
//        } else {
//            return "Mês inválido";
//        }
//    }
//
//    // QUESTÃO 04
//    public static double calculaMedia(double[] valores) {
//        double soma = 0;
//        for (double v : valores) {
//            soma += v;
//        }
//        return soma / valores.length;
//    }
//
//    public static int contaAcimaMedia(double[] valores, double media) {
//        int cont = 0;
//        for (double v : valores) {
//            if (v > media) cont++;
//        }
//        return cont;
//    }
//
//    // QUESTÃO 05
//    public static int posicaoMenorPeso(double[] pesos) {
//        int pos = 0;
//        for (int i = 1; i < pesos.length; i++) {
//            if (pesos[i] < pesos[pos]) {
//                pos = i;
//            }
//        }
//        return pos;
//    }
//
//    // QUESTÃO 06
//    public static int[] fibonacciSeq(int n) {
//        int[] fib = new int[n];
//        if (n > 0) fib[0] = 0;
//        if (n > 1) fib[1] = 1;
//        for (int i = 2; i < n; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//        return fib;
//    }
//
//    // QUESTÃO 07
//    public static int buscaNome(String[] nomes, String nomeProcurado) {
//        for (int i = 0; i < nomes.length; i++) {
//            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    // ----------- MAIN -----------
//    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//
//        // QUESTÃO 01 - Delta
//        System.out.println("=== Questão 01 - Cálculo de Delta ===");
//        double delta1 = calcDelt(2, 5, 9);
//        double delta2 = calcDelt(4, 8, 7);
//        System.out.println("Delta 1: " + delta1);
//        System.out.println("Delta 2: " + delta2 + "\n");
//
//        // QUESTÃO 02 - Operações matemáticas
//        System.out.println("=== Questão 02 - Operações matemáticas ===");
//        System.out.println("==MENU==\n1.Soma\n2.Subtração\n3.Multiplicação\n4.Divisão");
//        int op = entrada.nextInt();
//        int num1, num2, resul;
//        switch (op) {
//            case 1 -> {
//                System.out.print("Insira o primeiro valor: ");
//                num1 = entrada.nextInt();
//                System.out.print("Insira o segundo valor: ");
//                num2 = entrada.nextInt();
//                resul = soma1(num1, num2);
//                System.out.println("Resultado da soma: " + resul + "\n");
//            }
//            case 2 -> {
//                System.out.print("Insira o primeiro valor: ");
//                num1 = entrada.nextInt();
//                System.out.print("Insira o segundo valor: ");
//                num2 = entrada.nextInt();
//                resul = sub2(num1, num2);
//                System.out.println("Resultado da subtração: " + resul + "\n");
//            }
//            case 3 -> {
//                System.out.print("Insira o primeiro valor: ");
//                num1 = entrada.nextInt();
//                System.out.print("Insira o segundo valor: ");
//                num2 = entrada.nextInt();
//                resul = multi(num1, num2);
//                System.out.println("Resultado da multiplicação: " + resul + "\n");
//            }
//            case 4 -> {
//                System.out.print("Insira o primeiro valor: ");
//                num1 = entrada.nextInt();
//                System.out.print("Insira o segundo valor: ");
//                num2 = entrada.nextInt();
//                if (num2 == 0) {
//                    System.out.println("Divisão por zero não é permitida.\n");
//                } else {
//                    resul = div(num1, num2);
//                    System.out.println("Resultado da divisão: " + resul + "\n");
//                }
//            }
//            default -> System.out.println("Opção inválida.\n");
//        }
//
//        // QUESTÃO 03.01 - Calendário com switch
//        System.out.println("=== Questão 03.01 - Calendário switch ===");
//        int escolha;
//        do {
//            System.out.print("Insira o número referente ao mês (1-12): ");
//            escolha = entrada.nextInt();
//        } while (escolha < 1 || escolha > 12);
//        calendarioOp(escolha);
//        System.out.println();
//
//        // QUESTÃO 03.02 - Calendário array
//        System.out.println("=== Questão 03.02 - Calendário array ===");
//        System.out.print("Insira um número entre 1 e 12: ");
//        int mes = entrada.nextInt();
//        System.out.println("Mês correspondente: " + anoDia(mes) + "\n");
//
//        // QUESTÃO 04 - Estatística de salários
//        System.out.println("=== Questão 04 ===");
//        System.out.print("Quantos funcionários sua empresa possui? ");
//        int qntd = entrada.nextInt();
//        double[] salarios = new double[qntd];
//        for (int i = 0; i < qntd; i++) {
//            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
//            salarios[i] = entrada.nextDouble();
//        }
//        double mediaSalarios = calculaMedia(salarios);
//        int acimaMedia = contaAcimaMedia(salarios, mediaSalarios);
//        System.out.printf("A média salarial é: R$ %.2f\n", mediaSalarios);
//        System.out.println(acimaMedia + " funcionário(s) ganham acima da média.\n");
//
//        // QUESTÃO 05 - Menor peso
//        System.out.println("=== Questão 05 ===");
//        double[] pesos = new double[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
//            pesos[i] = entrada.nextDouble();
//        }
//        int posMenor = posicaoMenorPeso(pesos);
//        System.out.println("Menor peso: " + pesos[posMenor] + ", posição: " + posMenor + "\n");
//
//        // QUESTÃO 06 - Fibonacci
//        System.out.println("=== Questão 06 ===");
//        System.out.print("Digite um número para mostrar a sequência Fibonacci: ");
//        int nFib = entrada.nextInt();
//        int[] fibSeq = fibonacciSeq(nFib);
//        System.out.print("Sequência Fibonacci: ");
//        for (int num : fibSeq) {
//            System.out.print(num + " ");
//        }
//        System.out.println("\n");
//
//        // QUESTÃO 07 - Busca nome
//        entrada.nextLine(); // limpar buffer
//        System.out.println("=== Questão 07 ===");
//        String[] nomes = new String[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Digite o nome " + (i + 1) + ": ");
//            nomes[i] = entrada.nextLine();
//        }
//        System.out.print("Digite um nome para buscar: ");
//        String busca = entrada.nextLine();
//        int posNome = buscaNome(nomes, busca);
//        if (posNome == -1) {
//            System.out.println("Nome não encontrado.\n");
//        } else {
//            System.out.println("Nome encontrado na posição: " + posNome + "\n");
//        }
//        
//        
//        
//        
//    }
//}
//  
