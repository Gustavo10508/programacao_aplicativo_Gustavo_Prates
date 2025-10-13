import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = in.nextInt();
            }
        }

        // 2
        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = in.nextInt();
        }
        int maior = numeros[0];
        int pos = 0;
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                pos = i;
            }
        }
        System.out.println("Maior valor: " + maior + " posição: " + pos);

        // 3
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um valor: ");
            vet1[i] = in.nextInt();
            vet2[i] = vet1[i];
        }
        System.out.print("Vetor 1: ");
        for (int i = 0; i < 5; i++) System.out.print(vet1[i] + " ");
        System.out.println();
        System.out.print("Vetor 2: ");
        for (int i = 0; i < 5; i++) System.out.print(vet2[i] + " ");
        System.out.println();

        // 4
        double[] reais = new double[20];
        double soma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número real: ");
            reais[i] = in.nextDouble();
            soma += reais[i];
        }
        double media = soma / 20;
        System.out.println("Média: " + media);
        System.out.println("Valores menores que a média:");
        for (int i = 0; i < 20; i++) {
            if (reais[i] < media) System.out.println(reais[i]);
        }

        // 5
        in.nextLine();
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = in.nextLine();
            boolean temDigito = false;
            for (int i = 0; i < senha.length(); i++) {
                if (senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
                    temDigito = true;
                }
            }
            if (senha.length() >= 8 && temDigito) {
                System.out.println("Senha válida");
                break;
            } else {
                if (senha.length() < 8) System.out.println("mínimo 8");
                if (!temDigito) System.out.println("falta dígito");
            }
        } while (true);

        // 6
        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        int vogais = 0, consoantes = 0, espacos = 0, outros = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) vogais++;
            else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) consoantes++;
            else if (c == ' ') espacos++;
            else outros++;
        }
        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros: " + outros);

        // 7
        System.out.print("Digite um texto: ");
        String texto = in.nextLine();
        System.out.print("Digite uma palavra: ");
        String palavra = in.nextLine();
        int inicio = 0;
        int cont = 0;
        while (true) {
            int posicao = texto.indexOf(palavra, inicio);
            if (posicao == -1) break;
            cont++;
            inicio = posicao + 1;
        }
        if (cont == 0) System.out.println("Palavra não encontrada");
        else System.out.println("A palavra aparece " + cont + " vezes");

        // 8
        System.out.print("Cadastre um nome de usuário: ");
        String usuario = in.nextLine();
        int tentativas = 3;
        String login;
        do {
            System.out.print("Digite o nome de login: ");
            login = in.nextLine();
            if (login.equalsIgnoreCase(usuario)) {
                System.out.println("Acesso concedido");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) System.out.println("Acesso negado - tentativas restantes: " + tentativas);
            }
            if (tentativas == 0) System.out.println("Conta bloqueada");
        } while (tentativas > 0);

        in.close();
    }
}
