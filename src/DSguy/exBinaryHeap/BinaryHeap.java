package DSguy.exBinaryHeap;

public class BinaryHeap {
    int[] array;
    int tamanhoArvore;

    //Construtor
    public BinaryHeap(int tamanho) {
        array = new int[tamanho + 1];
        this.tamanhoArvore = 0;
        System.out.println("Árvore criada");
    }

    public int tamanhoDoArray() {
        return array.length;
    }

    public int tamanhodaArvore() {
        return tamanhoArvore;
    }

    public boolean estaVazia() {
        if (tamanhoArvore <= 0) {
            System.out.println("Árvore vazia");
            return true;
        } else {
            System.out.println("Árvore não vazia");
            return false;
        }
    }

    public void deletarHeap() {
        array = null;
        System.out.println("O heap não existe mais!");
    }

    //Método insere valor no monte
    public void inserirNoHeap(int valor) {
        //Adiciona 1 pois tamanhoDaArvore sempr aponta para a última célula preenchida do array
        System.out.println("Inserir " + valor + " na árvore...");
        array[tamanhoArvore + 1] = valor;
        tamanhoArvore++;
        balancearFundoProTopo(tamanhoArvore);
        System.out.println("Valor " + valor + " inserido com sucesso");
        imprimirArvore();
    }

    public void peek() {
        if (tamanhoArvore == 0) {
            System.out.println("Monte vazio");
        } else {
            System.out.println("Primeiro da árvore é: " + array[1]);
        }
    }

    //Extrair cabeça da árvore
    public int extrairCabecaDaArvore() {
        if (tamanhoArvore == 0) {
            System.out.println("Árvore vazia");
            return -1;
        } else {
            peek();
            System.out.println("Extraíndo agora");
            int valorExtraido = array[1];
            array[1] = array[tamanhoArvore];
            tamanhoArvore--;
            balancearTopoProFundo(1);
            System.out.println("Valor extraído com sucesso");
            imprimirArvore();
            return valorExtraido;
        }
    }

    public void balancearFundoProTopo(int index) {
        int parente = index / 2;
        if (index <= 1) {
            return;
        }
        if (array[index] < array[parente]) {
            int temp = array[index];
            array[index] = array[parente];
            array[parente] = temp;
        }
        balancearFundoProTopo(parente);
    }

    public void balancearTopoProFundo(int index) {
        int esq = index*2;
        int dir = (index*2)+1;
        int diMenor = 0;

        //se nó não tiver filhos, nada pode ser feito
        if(tamanhoArvore < esq) {
            return;
        //se só tiver filho na esquerda, faz-se uma comparação e retorna
        } else if (tamanhoArvore == esq) {
            if(array[index] > array[esq]) {
                int temp = array[index];
                array[index] = array[esq];
                array[esq] = temp;
            }
            return;
        //Se tiver os dois filhos
        } else {
            //descobre-se qual o menor filho
            if(array[esq] < array[dir]){
                diMenor = esq;
            } else {
                diMenor = dir;
            }
            if(array[index] > array[diMenor]) {
                int temp = array[index];
                array[index] = array[diMenor];
                array[diMenor] = temp;
            }
        }
        balancearTopoProFundo(diMenor);
    }

    public void imprimirArvore() {
        System.out.println("Imprimindo todos os elementos da árvore");
        for(int i = 1; i <= tamanhoArvore; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
    }
}
