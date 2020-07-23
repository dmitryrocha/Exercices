package DSguy.exCircularLinkedList;

public class NoCLL {

    private int valor;
    private NoCLL prox;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoCLL getProx() {
        return prox;
    }

    public void setProx(NoCLL prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "valor=" + valor;
    }
}
