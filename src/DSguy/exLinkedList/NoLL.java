package DSguy.exLinkedList;

public class NoLL {
    private int valor;
    private NoLL proximo;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoLL getProximo() {
        return proximo;
    }

    public void setProximo(NoLL proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "valor=" + valor;
    }
}
