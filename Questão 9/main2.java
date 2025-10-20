import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro[] livros = new Livro[5];
        int total = 0;
        int opcao;

        do {
            System.out.println("=== BIBLIOTECA ===");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (total < livros.length) {
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    livros[total] = new Livro(titulo, autor);
                    total++;
                } else {
                    System.out.println("Limite de livros atingido.");
                }
            } else if (opcao == 2) {
                for (int i = 0; i < total; i++) {
                    System.out.println((i + 1) + " - " + livros[i]);
                }
            } else if (opcao == 3) {
                System.out.print("Número do livro: ");
                int n = sc.nextInt();
                if (n > 0 && n <= total) {
                    livros[n - 1].setEmprestado(true);
                }
            } else if (opcao == 4) {
                System.out.print("Número do livro: ");
                int n = sc.nextInt();
                if (n > 0 && n <= total) {
                    livros[n - 1].setEmprestado(false);
                }
            }
        } while (opcao != 5);
    }
}
