import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        // Testando a Validação de existência
        lista.inserirNoFinal(30);
        lista.inserirNoFinal(12);
        lista.inserirNoFinal(24);
        lista.inserirNoFinal(15);
        lista.inserirNoFinal(53);
        Scanner sc = new Scanner (System.in);
        System.out.println("Insira um número qualquer:");
        int chave = sc.nextInt();
        System.out.printf("Procurando pelo elemento [%d] na lista:", chave);
        System.out.println("");
        if (lista.buscar(chave)) {
            System.out.printf("Elemento [%d] encontrado.", chave);
        } else {
            System.out.printf("Elemento [%d] não encontrado.", chave);
        }
        System.out.println("");
        lista.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Inserção ordenada
        ListaSimples lista1 = new ListaSimples();
        System.out.println("Realizando o teste da inserção ordenada:");
        lista1.insercaoOrdenada(10);
        lista1.insercaoOrdenada(50);
        lista1.insercaoOrdenada(22);
        lista1.insercaoOrdenada(29);
        lista1.insercaoOrdenada(77);
        lista1.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Troca de prioridade
        System.out.println("Movendo o elemento 22 para o início da lista:");
        lista1.moverParaInicio(22);
        lista1.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Troca de lugar entre elementos
        System.out.println("Trocando os elementos 10 e 29 de posição:");
        lista1.trocarPosicao(10, 29);
        lista1.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Cópia de elementos
        System.out.println("Criando uma cópia da lista atual:");
        ListaSimples listaCopia = lista1.copiarLista();
        listaCopia.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Transferência de elementos
        ListaSimples lista3 = new ListaSimples();
        lista3.inserirNoInicio(40);
        lista3.inserirNoInicio(28);
        lista3.inserirNoInicio(30);
        ListaSimples lista4 = new ListaSimples();
        lista4.inserirNoInicio(13);
        lista4.inserirNoInicio(33);
        lista4.inserirNoInicio(123);
        System.out.println("Transferindo elementos de lista3 para lista4:");
        lista3.transferirElementos(lista4);
        lista4.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Partição de Lista
        ListaSimples listaPrincipal = new ListaSimples();
        listaPrincipal.inserirNoInicio(1);
        listaPrincipal.inserirNoInicio(2);
        listaPrincipal.inserirNoInicio(3);
        listaPrincipal.inserirNoInicio(4);
        listaPrincipal.inserirNoInicio(5);
        ListaSimples listaPar = new ListaSimples();
        ListaSimples listaImpar = new ListaSimples();
        listaPrincipal.particionarLista(listaPar, listaImpar);

        System.out.println("Testando a partição de lista");
        System.out.println("Lista principal:");
        listaPrincipal.exibirLista();
        System.out.println("Lista Pares:");
        listaPar.exibirLista();

        System.out.println("Lista Impares:");
        listaImpar.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Combinação de Listas
        // Alimentando 3 listas pra testar a função

        System.out.println("Testando a combinação de lista");
        ListaSimples lista11 = new ListaSimples();
        lista11.inserirNoFinal(1);
        lista11.inserirNoFinal(4);
        lista11.inserirNoFinal(7);

        ListaSimples lista22 = new ListaSimples();
        lista22.inserirNoFinal(2);
        lista22.inserirNoFinal(5);
        lista22.inserirNoFinal(8);

        ListaSimples lista33 = new ListaSimples();
        lista33.inserirNoFinal(3);
        lista33.inserirNoFinal(6);
        lista33.inserirNoFinal(9);

        // Mesclando as listas

        ListaSimples listaMesclada = lista11.mesclarListas(lista11, lista22, lista33);
        listaMesclada.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Diferença entre Duas Listas
        // Operação 9

        System.out.println("Testando a diferença entre duas listas");
        ListaSimples lista44 = new ListaSimples();
        lista44.inserirNoFinal(1);
        lista44.inserirNoFinal(2);
        lista44.inserirNoFinal(3);
        lista44.inserirNoFinal(6);

        ListaSimples lista55 = new ListaSimples();
        lista55.inserirNoFinal(2);
        lista55.inserirNoFinal(3);
        lista55.inserirNoFinal(4);
        lista55.inserirNoFinal(5);

        lista44.diferencaListas(lista44, lista55);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Teste da Interseção entre listas
        // Operação 10

        System.out.println("Teste da Interseção entre listas");
        System.out.println("Lista 1:");
        lista44.exibirLista();
        System.out.println("Lista 2:");
        lista55.exibirLista();
        System.out.println("Interseção entre as duas listas:");
        ListaSimples listaIntersecao = lista44.intersecao(lista55);
        listaIntersecao.exibirLista();
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Teste do Balance-Line
        // Operação 11

        System.out.println("Testando o Balance-Line");
        lista44.exibirLista();
        lista55.exibirLista();
        lista44.balanceLine(lista55);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a Ordenação de uma lista
        // Operação 12

        System.out.println("Teste da Ordenação de uma lista");

        ListaSimples listat1 = new ListaSimples();
        listat1.inserirNoFinal(9);
        listat1.inserirNoFinal(7);
        listat1.inserirNoFinal(3);
        listat1.inserirNoFinal(2);
        listat1.inserirNoFinal(5);

        System.out.println("Lista antes da ordenação:");
        listat1.exibirLista();
        listat1.ordenar();
        System.out.println("Lista após a ordenação:");
        listat1.exibirLista();

        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a pesquisa por índice
        // Operação 13

        System.out.println("Digite o índice do elemento que deseja acessar: ");
        int indice = sc.nextInt();
        ListaSimples listateste = new ListaSimples();
        listateste.inserirNoFinal(1);
        listateste.inserirNoFinal(2);
        listateste.inserirNoFinal(3);
        listateste.inserirNoFinal(4);

        System.out.println("Lista teste");

        listateste.exibirLista();
        try {
            int elemento = listateste.pesquisaPorIndice(indice); // Buscando o elemento pelo índice
            System.out.println("Elemento no índice " + indice + ": " + elemento);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        sc.close();

        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Testando a função de remover números menores que o solicitado
        // Operação 14

        System.out.println("Teste da remoção de um valor menor que o solicitado");
        ListaSimples lista76 = new ListaSimples();
        lista76.inserirNoFinal(5);
        lista76.inserirNoFinal(4);
        lista76.inserirNoFinal(3);
        lista76.inserirNoFinal(2);
        lista76.inserirNoFinal(1);

        System.out.print("Lista antes da remoção: ");
        lista76.exibirLista();
        int dado = (3);

        lista76.removerMenoresQue(dado);

        System.out.print("Lista após a remoção: ");
        lista76.exibirLista();
    }
}
