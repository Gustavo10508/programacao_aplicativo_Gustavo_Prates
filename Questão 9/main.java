import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contato[] contatos = new Contato[5];
        int total = 0;
        int opcao;

        do {
            System.out.println("=== AGENDA DE CONTATOS ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Editar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                if (total < contatos.length) {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    contatos[total] = new Contato(nome, telefone, email);
                    total++;
                } else {
                    System.out.println("Agenda cheia.");
                }
            } else if (opcao == 2) {
                for (int i = 0; i < total; i++) {
                    System.out.println((i + 1) + " - " + contatos[i]);
                }
            } else if (opcao == 3) {
                System.out.print("Número do contato: ");
                int n = sc.nextInt();
                sc.nextLine();
                if (n > 0 && n <= total) {
                    System.out.print("Novo nome: ");
                    contatos[n - 1].setNome(sc.nextLine());
                    System.out.print("Novo telefone: ");
                    contatos[n - 1].setTelefone(sc.nextLine());
                    System.out.print("Novo email: ");
                    contatos[n - 1].setEmail(sc.nextLine());
                }
            } else if (opcao == 4) {
                System.out.print("Número do contato: ");
                int n = sc.nextInt();
                if (n > 0 && n <= total) {
                    for (int i = n - 1; i < total - 1; i++) {
                        contatos[i] = contatos[i + 1];
                    }
                    total--;
                }
            }
        } while (opcao != 5);
    }
}
