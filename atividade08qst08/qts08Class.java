package atividade00808;

public class Cachorro {
    private String nomePet;
    private String raca;
    private int idade;
    private String nomeDono;
    private String contatoDono;

    // Construtor
    public Cachorro(String nomePet, String raca, int idade, String nomeDono, String contatoDono) {
        this.nomePet = nomePet;
        this.raca = raca;
        this.idade = idade;
        this.nomeDono = nomeDono;
        this.contatoDono = contatoDono;
    }

    // Método para exibir os dados do cachorro
    public void exibirDados() {
        System.out.println("\n=== Cadastro Pet Shop Amigo Fiel ===");
        System.out.println("Nome do pet: " + nomePet);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Nome do dono: " + nomeDono);
        System.out.println("Contato do dono: " + contatoDono);
    }
}
