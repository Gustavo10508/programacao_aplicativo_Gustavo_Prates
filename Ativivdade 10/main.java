package sistemaalunos;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConexaoDAO dao = new ConexaoDAO();

        while (true) {
            System.out.println("\n=== SISTEMA DE GERENCIAMENTO DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Deletar aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    dao.cadastrarAluno(new Aluno(id, nome));
                }
                case 2 -> {
                    List<Aluno> alunos = dao.listarAlunos();
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        alunos.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("Digite o ID do aluno a atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = sc.nextLine();
                    dao.atualizarAluno(new Aluno(id, nome));
                }
                case 4 -> {
                    System.out.print("Digite o ID do aluno a deletar: ");
                    int id = sc.nextInt();
                    dao.deletarAluno(id);
                }
                case 0 -> {
                    System.out.println("Encerrando o sistema...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
