package atividade.dez;

public class Prova {
    private Gabarito gabarito;
    private char[] respostasAluno;
    private int numeroQuestao;

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
        this.respostasAluno = new char[15];
        this.numeroQuestao = 0;
    }

    public void respostaAluno(char resposta) {
        if (numeroQuestao < 15) {
            respostasAluno[numeroQuestao] = resposta;
            numeroQuestao++;
        }
    }

    public int acertos() {
        int acertos = 0;
        for (int i = 0; i < numeroQuestao; i++) {
            if (respostasAluno[i] == gabarito.respostaQuestao(i)) {
                acertos++;
            }
        }
        return acertos;
    }

    public double nota() {
        double nota = 0;
        for (int i = 0; i < numeroQuestao; i++) {
            if (respostasAluno[i] == gabarito.respostaQuestao(i)) {
                if (i < 10) nota += 0.5;
                else nota += 1.0;
            }
        }
        return nota;
    }

    public double maior(Prova outra) {
        if (this.acertos() > outra.acertos()) return this.nota();
        else if (outra.acertos() > this.acertos()) return outra.nota();
        else return Math.max(this.nota(), outra.nota());
    }
}
