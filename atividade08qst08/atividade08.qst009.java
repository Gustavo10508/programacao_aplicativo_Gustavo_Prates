package atividadealuno;

public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return (notaProva1 * 2.5 + notaProva2 * 2.5 + notaTrabalho * 2) / 7;
    }

    public double finalNecessaria() {
        double media = media();
        if (media >= 7.0) {
            return 0;
        } else {
            return 10 - media;
        }
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media());
        double precisa = finalNecessaria();
        if (precisa == 0) {
            System.out.println("Aprovado! Não precisa de prova final.");
        } else {
            System.out.println("Precisa de: " + precisa + " pontos na prova final.");
        }
    }
}
