public class Main {
    public static void main(String[] args) {

        // Testando a estrutura base da LSE

        System.out.println("// Teste da estrutura base da Lista Simples");
        ListaSimples lista = new ListaSimples();
        System.out.println("Adicionando elementos no início da lista: [10, 20]");
        System.out.println("Lista após o primeiro feed: ");
        // Inserir no inicio
        lista.inserirNoInicio(20);
        lista.inserirNoInicio(10);
        lista.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Adicionando elemento ao final da lista: [30]");
        // Inserir no final
        lista.inserirNoFinal(30);
        lista.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Inserindo elemento [40] após o número: [20]");
        // Inserir no meio
        lista.inserirNoMeio(40, 20);
        lista.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Removendo o elemento [20] da lista:");
        // Removendo um elemento
        lista.remover(20);
        lista.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Removendo o elemento [30] da lista:");
        lista.remover(30);
        lista.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("=======================");

        // Testando a Fila
        System.out.println("\n// Teste da Fila");
        Fila fila = new Fila();
        System.out.println("Adicionando elementos à fila: [10, 20, 30]");
        fila.inserirNaFila(10);
        fila.inserirNaFila(20);
        fila.inserirNaFila(30);
        System.out.println("Fila após inserção:");
        fila.exibirFila();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Removendo o primeiro elemento da fila [10]:");
        fila.removerDaFila();
        fila.exibirFila();

        // Testando a Pilha
        System.out.println("\n// Teste da Pilha");
        Pilha pilha = new Pilha();
        System.out.println("Adicionando elementos à pilha: [10, 20, 30]");
        pilha.inserirNaPilha(10);
        pilha.inserirNaPilha(20);
        pilha.inserirNaPilha(30);
        System.out.println("Pilha após inserção:");
        pilha.exibirPilha();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Apagando o topo da pilha: [30]");
        pilha.removerDaPilha();
        pilha.exibirPilha();

        // Testando o Deque
        System.out.println("\n// Teste do Deque");
        Deque deque = new Deque();
        System.out.println("Inserindo elementos em ORDEM no deque: (10 = início), (20 = final), (30 = início)");
        deque.adicionarNoInicio(10);
        deque.adicionarNoFinal(20);
        deque.adicionarNoInicio(30);
        deque.exibirDeque();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Deletando o primeiro elemento visual no deque: [30]");
        deque.removerDoInicio();
        deque.exibirDeque();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println("Removendo o último elemento do deque [20]:");
        deque.removerDoFinal();
        deque.exibirDeque();

        System.out.println("=======================");
    }
}