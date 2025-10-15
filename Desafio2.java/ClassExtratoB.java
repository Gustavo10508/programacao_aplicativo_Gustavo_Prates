package desafio.dois;

public class ExtratoBancario {
    private final String[] extrato;
    private int indice;

    public ExtratoBancario(int tamanho) {
        extrato = new String[tamanho];
        indice = 0;
    }

    public void registrar(Movimentacao mov) {
        if (indice < extrato.length) {
            extrato[indice] = mov.toString();
            indice++;
        }
    }

    public void imprimir() {
        if (indice == 0) {
            System.out.println("Não há movimentações ainda.");
        } else {
            System.out.println("=== Extrato ===");
            for (int i = 0; i < indice; i++) {
                System.out.println((i + 1) + ") " + extrato[i]);
            }
        }
    }

    public boolean vazio() {
        return indice == 0;
    }
}
