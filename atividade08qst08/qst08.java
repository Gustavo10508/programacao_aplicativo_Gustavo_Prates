package atividade00808;

import java.util.Scanner;

public class Atividade00808Java {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Cachorro pet = null; // Nenhum cachorro cadastrado no início
            int opcao;
            
            do {
                System.out.println("\n=== MENU PET SHOP AMIGO FIEL ===");
                System.out.println("1. Cadastrar novo cachorro");
                System.out.println("2. Escolher serviço para o cachorro");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // consome quebra de linha
                
                switch (opcao) {
                    case 1 -> {
                        System.out.println("\n=== CADASTRO DE CACHORRO ===");
                        System.out.print("Nome do pet: ");
                        String nomePet = sc.nextLine();
                        
                        System.out.print("Raça: ");
                        String raca = sc.nextLine();
                        
                        System.out.print("Idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Nome do dono: ");
                        String nomeDono = sc.nextLine();
                        
                        System.out.print("Telefone de contato: ");
                        String contatoDono = sc.nextLine();
                        
                        pet = new Cachorro(nomePet, raca, idade, nomeDono, contatoDono);
                        System.out.println("\nCachorro cadastrado com sucesso!");
                    }
                    
                    case 2 -> {
                        if (pet == null) {
                            System.out.println("\n⚠️ Nenhum cachorro cadastrado! Cadastre primeiro.");
                        } else {
                            System.out.println("\n=== MENU DE SERVIÇOS ===");
                            System.out.println("1. Banho");
                            System.out.println("2. Tosa");
                            System.out.println("3. Banho e Tosa");
                            System.out.println("4. Consulta veterinária");
                            System.out.println("5. Vacinação");
                            System.out.print("Escolha o procedimento desejado: ");
                            int servicoOpcao = sc.nextInt();
                            
                            String servico;
                            switch (servicoOpcao) {
                                case 1 -> servico = "Banho";
                                case 2 -> servico = "Tosa";
                                case 3 -> servico = "Banho e Tosa";
                                case 4 -> servico = "Consulta veterinária";
                                case 5 -> servico = "Vacinação";
                                default -> servico = "Serviço inválido";
                            }
                            
                            System.out.println("\n=== FICHA DE ATENDIMENTO ===");
                            pet.exibirDados();
                            System.out.println("Serviço solicitado: " + servico);
                        }
                    }
                    
                    case 3 -> System.out.println("\nEncerrando o sistema... Até logo!");
                    
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }
                
            } while (opcao != 3);
        } 
    }
}
