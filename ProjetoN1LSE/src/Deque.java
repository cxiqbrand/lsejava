        public class Deque {
            private No cabeca;
            private No cauda;

            // Adicionar no início do deque

            public void adicionarNoInicio(int dado) {
                No novoNo = new No(dado);
                if (cabeca == null) {
                    cabeca = cauda = novoNo;
                    return;
                }
                novoNo.setProximo(cabeca);
                cabeca = novoNo;
            }

            // Adicionar no final do deque

            public void adicionarNoFinal(int dado) {
                No novoNo = new No(dado);
                if (cauda == null) {
                    cabeca = cauda = novoNo;
                    return;
                }
                cauda.setProximo(novoNo);
                cauda = novoNo;
            }

            // Remover no início do deque

            public void removerDoInicio() {
                if (cabeca == null) {
                    System.out.println("Deque vazio.");
                    return;
                }
                cabeca = cabeca.getProximo();
                if (cabeca == null) {
                    cauda = null;
                }
            }

            // Remover no final do deque

            public void removerDoFinal() {
                if (cauda == null) {
                    System.out.println("Deque vazio.");
                    return;
                }
                if (cabeca == cauda) {
                    cabeca = cauda = null;
                    return;
                }
                No temp = cabeca;
                while (temp.getProximo() != cauda) {
                    temp = temp.getProximo();
                }
                temp.setProximo(null);
                cauda = temp;
            }

            // Função pra exibir o deque e realizar testes

            public void exibirDeque() {
                No temp = cabeca;
                while (temp != null) {
                    System.out.print(temp.getDado() + " -- ");
                    temp = temp.getProximo();
                }
                System.out.println("null");
            }
        }