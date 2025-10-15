package atividade.dez;

public class TesteProva {
    public static void main(String[] args) {
        Gabarito g = new Gabarito();
        Prova p1 = new Prova(g);
        Prova p2 = new Prova(g);

        // respostas do aluno 1
        for (int i = 0; i < 15; i++) {
            p1.respostaAluno('A');
        }

        // respostas do aluno 2
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) p2.respostaAluno('B');
            else p2.respostaAluno('A');
        }

        System.out.println("Aluno 1: " + p1.acertos() + " acertos, nota = " + p1.nota());
        System.out.println("Aluno 2: " + p2.acertos() + " acertos, nota = " + p2.nota());

        System.out.println("Maior nota: " + p1.maior(p2));
    }
}
