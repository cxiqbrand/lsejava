public class No {
    private int dado;
    private No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

}