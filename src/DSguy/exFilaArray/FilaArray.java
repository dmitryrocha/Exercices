package DSguy.exFilaArray;

public class FilaArray {

    private int[] array;
    private int posicao;
    private int inicio;

    public void criarFila(int tamanho){
        this.array = new int[tamanho];
        this.posicao = -1;
        this.inicio = -1;
        System.out.println("Fila de tamanho "+tamanho+" criada com sucesso.\n");
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void inserir(int valor) {
        if(estaCheia()) {
            System.out.println("A fila está cheia");
        } else if(estaVazia()) {
            array[getPosicao()+1] = valor;
            setPosicao(getPosicao()+1);
            setInicio(0);
            System.out.println("Valor "+valor+" adicionado na lista com suceso.\n");
        } else {
            setPosicao(getPosicao()+1);
            array[getPosicao()] = valor;
            System.out.println("Valor "+valor+" adicionado na lista com suceso.\n");
        }

    }

    public void remover() {
        if(estaVazia()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("Apagando o valor "+array[getInicio()]);
            setInicio(getInicio()+1);
            if(getInicio() > getPosicao()) {
                inicio = -1;
                posicao = -1;
            }
        }

    }

    public void olhadinha() {
        if(!estaVazia()) {
            System.out.println("O próximo a sair será "+array[getInicio()]);
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public void imprimirFila() {
        if(!estaVazia()) {
            for(int i = getInicio(); i < getPosicao()+1; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        } else {
            System.out.println("A fila está vazia");
        }
    }

    public boolean estaVazia() {
        return getInicio() == -1;

    }

    public boolean estaCheia() {
        return getPosicao() > array.length;
    }

    public void deletar() {
        array = null;
        System.out.println("Sua lista não existe mais.");
    }
}
