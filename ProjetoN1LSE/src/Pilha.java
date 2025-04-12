public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    // Adicionar no topo da pilha

    public void inserirNaPilha(int dado) {
        No novoNo = new No(dado);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    // Remover do topo da pilha

    public void removerDaPilha() {
        if (topo == null) {
            System.out.println("Pilha vazia.");
            return;
        }
        topo = topo.getProximo();
    }

    // Função pra exibir a pilha e realizar testes

    public void exibirPilha() {
        No temp = topo;
        while (temp != null) {
            System.out.print(temp.getDado() + " -- ");
            temp = temp.getProximo();
        }
        System.out.println("null");
    }
}