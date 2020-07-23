package DSguy.exStackArray;

public class DsStackArray {

    int[] array;
    int topo;

    public DsStackArray(int tamanho) {
        this.array = new int[tamanho];
        this.topo = -1;
        System.out.println("Sua pilha foi criada");
    }

    public boolean listaEstaVazia() {
        if(topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean listaEstaCheia() {
        if(topo == array.length-1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int valor) {
        if(listaEstaCheia()) {
            System.out.println("A lista já está cheia ");
        } else {
            array[topo+1] = valor;
            topo++;
            System.out.println("Valor " + valor + " inserido com sucesso");
        }
    }

    public void pop() {
        if(listaEstaVazia()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("Apagando o valor "+array[topo]+"...");
            array[topo] = 0;
            topo--;
        }
    }

    public void olhadinha() {
        if(listaEstaVazia()) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("O topo da pilha tem " +array[topo]);
        }
    }

    public void delete() {
        array = null;
        System.out.println("Sua lista foi apagada");
    }
}
