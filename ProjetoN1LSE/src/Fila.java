public class Fila {
    private No cabeca;
    private No cauda;

    public Fila() {
        this.cabeca = null;
        this.cauda = null;
    }

    // Inserindo no final da fila

    public void inserirNaFila(int dado) {
        No novoNo = new No(dado);
        if (cauda == null) {
            cabeca = cauda = novoNo;
            return;
        }
        cauda.setProximo(novoNo);
        cauda = novoNo;
    }

    // Removendo no início da fila

    public void removerDaFila() {
        if (cabeca == null) {
            System.out.println("Fila vazia.");
            return;
        }
        cabeca = cabeca.getProximo();
        if (cabeca == null) {
            cauda = null;
        }
    }

    // Função pra exibir a fila e realizar testes

    public void exibirFila() {
        No temp = cabeca;
        while (temp != null) {
            System.out.print(temp.getDado() + " -- ");
            temp = temp.getProximo();
        }
        System.out.println("null");
    }
}