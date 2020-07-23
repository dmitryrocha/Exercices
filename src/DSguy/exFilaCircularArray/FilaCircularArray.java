package DSguy.exFilaCircularArray;

public class FilaCircularArray {
    int fila[];
    int inicio;
    int tamanho;
    int fim;

    public FilaCircularArray(int tamanho) {
        this.fila = new int[tamanho];
        this.tamanho = tamanho;
        this.fim = -1;
        inicio = -1;
        System.out.println("Fila de tamanho " + tamanho + " criada com sucesso.");
    }

    public void push(int valor) {
        if(fila == null) {
            System.out.println("A fila nunca foi iniciada.");
        } else if (filaEstaCheia()) {
            System.out.println("A lista está cheia.");
        } else {
            inicializarFila();
            if(fim+1 == tamanho) {
                fim = 0;
            } else {
                fim++;
            }
            fila[fim] = valor;
            System.out.println("Valor "+ valor +" inserido na fila com sucesso.");
        }
    }

    public void pop() {
        if(filaEstaVazia()) {
            System.out.println("A fila está vazia.");
        } else {
            int apagado = fila[inicio];
            fila[inicio] = 0;
            if(inicio == fim) {
                inicio = fim = -1;
            } else if(inicio+1 == tamanho) {
                inicio = 0;
            } else {
                inicio++;
            }

            System.out.println("Valor "+ apagado +" removido da fila com sucesso.");
        }
    }

    public void olhadinha() {
        if(!filaEstaVazia()) {
            System.out.println("O próximo valor a ser removido será "+fila[inicio]);
        } else {
            System.out.println("A fila está vazia");
        }
    }

    public void apagarFila() {
        System.out.println("A fila será apagada");
        fila = null;
        System.out.println("Sua fila foi apagada com sucesso.");
    }

    public void inicializarFila() {
        if(inicio == -1) {
            inicio = 0;
        }
    }

    public boolean filaEstaCheia() {
        if(fim+1 == inicio) {
            return true;
        } else if ((inicio == 0) && (fim + 1 == tamanho)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean filaEstaVazia() {
        if(fim == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirFila() {
        if(fila == null) {
            System.out.println("A fila não existe");
        } else if (filaEstaVazia()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("Imprimindo fila:\n");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(fila[i] + " ");
            }
            System.out.println("Sendo que a fila começa no " + fila[inicio] + " e termina no " + fila[fim]);
        }
    }

}
