    public class ListaSimples {
        private No cabeca;

        // Função pra obter a cabeça da lista
        public No getCabeca() {
            return cabeca;
        }

        // Construtor da lista, inicia-se a cabeça como null

        public ListaSimples() {
            this.cabeca = null;
        }

        // Inserir no início da lista

        public void inserirNoInicio(int dado) {
            No novoNo = new No(dado);
            novoNo.setProximo(cabeca);
            cabeca = novoNo;
        }

        // Inserir no final da lista
        public void inserirNoFinal(int dado) {
            No novoNo = new No(dado);
            if (cabeca == null) {
                cabeca = novoNo;
            } else {
                No temp = cabeca;
                while (temp.getProximo() != null) {
                    temp = temp.getProximo();
                }
                temp.setProximo(novoNo);
            }
        }

        // Insere no meio da lista, através do valor informado

        public void inserirNoMeio(int dado, int valorAux) {
            No novoNo = new No(dado);
            No temp = cabeca;

            // Loop pra buscar a variável utilizada como um auxiliador

            while (temp != null) {
                if (temp.getDado() == valorAux) {
                    novoNo.setProximo(temp.getProximo());
                    temp.setProximo(novoNo);
                    return;
                }
                temp = temp.getProximo();
            }
            System.out.println("Elemento informado não encontrado.");
        }

        // Remover algum dado da lista

        public void remover(int dado) {
            if (cabeca == null) {
                System.out.println("Lista vazia, impossível remover algo.");
                return;
            }

            // Verifica se o nó a ser removido é o primeiro da lista

            if (cabeca.getDado() == dado) {
                cabeca = cabeca.getProximo();
                return;
            }

            // Loop pra buscar o elemento

            No temp = cabeca;
            while (temp.getProximo() != null) {
                if (temp.getProximo().getDado() == dado) {
                    temp.setProximo(temp.getProximo().getProximo());
                    return;
                }
                temp = temp.getProximo();
            }
            System.out.println("Elemento não encontrado na lista.");
        }

        // Loop pra buscar um elemento específico na lista
        // Operação 1
        public boolean buscar(int dado) {
            No temp = cabeca;
            while (temp != null) {
                if (temp.getDado() == dado) {
                    return true;
                }
                temp = temp.getProximo();
            }
            return false;
        }

        // Função pra conseguir chamar no main e realizar os testes da lista simples

        public void exibirLista() {
            if (cabeca == null) {
                System.out.println("Lista = null (vazia)");
                return;
            }

            No temp = cabeca;
            while (temp != null) {
                System.out.print(temp.getDado() + " -- ");
                temp = temp.getProximo();
            }
            System.out.println("null");
        }

        // Operação 2
        public void insercaoOrdenada(int dado){
            No novoNo = new No(dado);

            // Caso a lista esteja vazia ou o novo nó seja menor que a cabeça, insere o elemento no início

            if (cabeca == null || cabeca.getDado()>= dado){
                novoNo.setProximo(cabeca);
                cabeca = novoNo;
                return;
            }

            // Loop pra percorrer a lista e identificar o local de inserção

            No temp = cabeca;
            while (temp.getProximo() != null && temp.getProximo().getDado() < dado){
                temp = temp.getProximo();
            }

            novoNo.setProximo(temp.getProximo());
            temp.setProximo(novoNo);

        }

        // Operação 3
        public void moverParaInicio(int dado) {
            if (cabeca == null || cabeca.getDado() == dado) {
                return;
            }

            No anterior = null;
            No atual = cabeca;

            // Loop pra buscar os dados informados

            while (atual != null && atual.getDado() != dado) {
                anterior = atual;
                atual = atual.getProximo();
            }

            if (atual == null) {
                System.out.println("Elemento não encontrado na lista.");
                return;
            }

            // Retira o nó da sua posição atual e insere no início

            anterior.setProximo(atual.getProximo());
            atual.setProximo(cabeca);
            cabeca = atual;
        }

        // Operação 4
        public void trocarPosicao(int dado1, int dado2) {
            if (cabeca == null) {
                return;
            }

            No anterior1 = null, anterior2 = null;
            No no1 = cabeca, no2 = cabeca;

            // Loop pra buscar os dados informados

            while (no1 != null && no1.getDado() != dado1) {
                anterior1 = no1;
                no1 = no1.getProximo();
            }

            while (no2 != null && no2.getDado() != dado2) {
                anterior2 = no2;
                no2 = no2.getProximo();
            }

            if (no1 == null || no2 == null) {
                System.out.println("Um ou ambos elementos não foram encontrados.");
                return;
            }

            // Se no1 não é o primeiro nó da lista, o próximo nó de anterior1 (precendente de no1) deve apontar para no2
            // sendo assim, permitindo a troca.

            if (anterior1 != null) {
                anterior1.setProximo(no2);
            } else {
                cabeca = no2;
            }

            // Se no2 não é o primeiro nó da lista, o próximo nó de anterior2 (precendente de no2) deve apontar para no1
            // sendo assim, permitindo a troca.

            if (anterior2 != null) {
                anterior2.setProximo(no1);
            } else {
                cabeca = no1;
            }

            // Realiza a troca da posição dos nós

            No temp = no1.getProximo();
            no1.setProximo(no2.getProximo());
            no2.setProximo(temp);
        }

        // Operação 5
        public ListaSimples copiarLista() {
            ListaSimples novaLista = new ListaSimples();
            No temp = cabeca;

            // Percorre a lista alvo e insere cada elemento no final de uma nova lista, criando uma cópia
            // da lista original

            while (temp != null) {
                novaLista.inserirNoFinal(temp.getDado());
                temp = temp.getProximo();
            }

            return novaLista;
        }

        // Operação 6
        public void transferirElementos(ListaSimples outraLista) {
            No temp = cabeca;

            // Loop para transferir os elementos de uma lista para outra, porém, fazendo a verificação se o elemento já
            // existe na nova lista, caso retorne false, ele é adicionado na nova lista

            while (temp != null) {
                if (!outraLista.buscar(temp.getDado())) {
                    outraLista.inserirNoFinal(temp.getDado());
                }
                temp = temp.getProximo();
            }
        }

        // Operação 7
        public void particionarLista(ListaSimples listaPares, ListaSimples listaImpares) {
            No temp = cabeca;
            while (temp != null) {

                // Se o número da lista for divisível por 2, adiciona o mesmo na lista dos pares

                if (temp.getDado() % 2 == 0) {
                    listaPares.inserirNoFinal(temp.getDado());

                    // Caso não seja divisível por 2, adiciona o mesmo na lista dos impares.
                } else {
                    listaImpares.inserirNoFinal(temp.getDado());
                }
                temp = temp.getProximo();
            }
        }

        // Operação 8
        public ListaSimples mesclarListas(ListaSimples lista11, ListaSimples lista22, ListaSimples lista33) {
            ListaSimples listaMesclada = new ListaSimples();
            No no1 = lista11.cabeca;
            No no2 = lista22.cabeca;
            No no3 = lista33.cabeca;

            // Enquanto houver elementos em pelo menos uma das listas

            while (no1 != null || no2 != null || no3 != null) {

                // Verifica se a lista 1 tem elementos e se é menor ou igual ao da lista 2 e 3

                if (no1 != null && (no2 == null || no1.getDado() <= no2.getDado()) && (no3 == null || no1.getDado() <= no3.getDado())) {
                    listaMesclada.inserirNoFinal(no1.getDado());
                    no1 = no1.getProximo();
                }

                // Verifica se a lista 2 tem elementos e se é menor ou igual ao da lista 1 e 3

                else if (no2 != null && (no1 == null || no2.getDado() <= no1.getDado()) && (no3 == null || no2.getDado() <= no3.getDado())) {
                    listaMesclada.inserirNoFinal(no2.getDado());
                    no2 = no2.getProximo();
                }
                // Verifica se a lista 3 tem elementos e se é menor ou igual ao da lista 1 e 2

                else if (no3 != null) {
                    listaMesclada.inserirNoFinal(no3.getDado());
                    no3 = no3.getProximo();
                }
            }

            return listaMesclada;
        }

        // Operação 9

        public void diferencaListas(ListaSimples lista44, ListaSimples lista55) {

            // Ambos os loops possuem a mesma lógica e função, percorrem as duas listas e verificam qual número aparece
            // em somente uma das listas, tornando-o exclusivo da mesma.

            System.out.print("Elementos exclusivos da Lista44: ");
            No no44 = lista44.cabeca;
            while (no44 != null) {
                boolean encontrado = false;
                No no55 = lista55.cabeca;
                while (no55 != null) {
                    if (no44.getDado() == no55.getDado()) {
                        encontrado = true;
                        break;
                    }
                    no55 = no55.getProximo();
                }
                if (!encontrado) {
                    System.out.print(no44.getDado() + " -- ");
                }
                no44 = no44.getProximo();
            }
            System.out.println("null");
            System.out.print("Elementos exclusivos da Lista55: ");
            No no55 = lista55.cabeca;
            while (no55 != null) {
                boolean encontrado = false;
                No no44Check = lista44.cabeca;
                while (no44Check != null) {
                    if (no55.getDado() == no44Check.getDado()) {
                        encontrado = true;
                        break;
                    }
                    no44Check = no44Check.getProximo();
                }
                if (!encontrado) {
                    System.out.print(no55.getDado() + " -- ");
                }
                no55 = no55.getProximo();
            }
            System.out.println("null");
        }

        // Interseção entre duas listas utilizada no Balance-Line
        // Operação 10

        public ListaSimples intersecao(ListaSimples outraLista) {
            ListaSimples listaIntersecao = new ListaSimples();
            No temp1 = this.cabeca;
            while (temp1 != null) { // Loop para percorrer os nós da lista atual
                No temp2 = outraLista.getCabeca();
                while (temp2 != null) { // Loop para percorrer os nós da outra lista
                    if (temp1.getDado() == temp2.getDado()) { // Faz a verificação de se os dados dos nós são iguais
                        listaIntersecao.inserirNoFinal(temp1.getDado()); // Caso sejam iguais, já insere o dado do nó na lista de interseção
                        break;
                    }
                    temp2 = temp2.getProximo(); // Nó da outra lista
                }
                temp1 = temp1.getProximo(); // Nó da lista atual
            }
            return listaIntersecao;
        }

        // Função do Balance-Line
        // Operação 11
        public void balanceLine(ListaSimples outraLista) {

            // Criação das listas para armazenar os dados que serão obtidos

            ListaSimples intersecao = new ListaSimples();
            ListaSimples apenasPrimeira = new ListaSimples();
            ListaSimples apenasSegunda = new ListaSimples();
            No atual = this.cabeca;


            while (atual != null) { // Enquanto houver elementos na lista
                if (outraLista.buscar(atual.getDado())) { // Busca todos os elementos da lista atual na outra lista
                    intersecao.inserirNoFinal(atual.getDado()); // Caso ele seja encontrado na outra lista, adiciona-se a intersecao
                } else {
                    apenasPrimeira.inserirNoFinal(atual.getDado()); // Caso contrário, ele encontra-se somente na primeira lista
                }
                atual = atual.getProximo();
            }

            atual = outraLista.cabeca; // Coloca o nó na cabeça da outra lista
            while (atual != null) {
                if (!this.buscar(atual.getDado())) { // Percorre os elementos da outra lista pra ver se está presente nessa lista de agora
                    apenasSegunda.inserirNoFinal(atual.getDado()); // Caso o elemento não seja encontrado na lista de agora, significa que é exclusivo daa segunda lista
                }
                atual = atual.getProximo();
            }

            System.out.println("Interseção:");
            intersecao.exibirLista();
            System.out.println("Elementos exclusivos da primeira lista:");
            apenasPrimeira.exibirLista();
            System.out.println("Elementos exclusivos da segunda lista:");
            apenasSegunda.exibirLista();
        }

        // Função para ordenar uma lista, utilizando uma função criada anteriormente, a insercaoOrdenada
        // Operação 12
        public void ordenar() {
            ListaSimples listaOrdenada = new ListaSimples(); // Nova lista para armazenar os elementos ordenados
            No temp = cabeca;

            // Percorre a lista original e insere os elementos na nova lista através da insercaoOrdenada

            while (temp != null) {
                listaOrdenada.insercaoOrdenada(temp.getDado());
                temp = temp.getProximo();
            }

            cabeca = listaOrdenada.cabeca; // Atualiza a cabeça da lista original para a lista ordenada
        }

        // Função para exibir um elemento da lista através do seu índice
        // Operação 13

        public int pesquisaPorIndice(int indice) throws IndexOutOfBoundsException {
            No temp = cabeca;
            int contador = 0;

            // Loop pra chegar no índice solicitado

            while (temp != null) {
                if (contador == indice) {
                    return temp.getDado();
                }
                contador++;
                temp = temp.getProximo();
            }
            throw new IndexOutOfBoundsException("Índice inexistente."); // Mensagem de erro caso o índice esteja fora da realidade da lista
        }

        // Função para remover números menores que o solicitado
        // Operação 14

        public void removerMenoresQue(int dado) {
            // Verifica se a lista está vazia
            if (cabeca == null) {
                System.out.println("A lista está vazia.");
                return;
            }

            // Remove elementos do início da lista que são menores que `dado`
            while (cabeca != null && cabeca.getDado() < dado) {
                cabeca = cabeca.getProximo();
            }

            // Remove elementos subsequentes que são menores que `dado`
            No atual = cabeca;
            while (atual != null && atual.getProximo() != null) {
                if (atual.getProximo().getDado() < dado) {
                    atual.setProximo(atual.getProximo().getProximo());
                } else {
                    atual = atual.getProximo();
                }
            }
        }
    }