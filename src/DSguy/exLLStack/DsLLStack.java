package DSguy.exLLStack;

public class DsLLStack {
    private StackNo inicio;
    private StackNo fim;
    private int tamanho = 0;

    public StackNo criarLista(int valor) {
        StackNo no = new StackNo();
        no.setValor(valor);
        inicio = fim = no;
        tamanho = 1;
        return inicio;
    }

    public StackNo getInicio() {
        return inicio;
    }

    public void setInicio(StackNo inicio) {
        this.inicio = inicio;
    }

    public StackNo getFim() {
        return fim;
    }

    public void setFim(StackNo fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void push(int valor) {
        if(!existeLista()) {
            System.out.println("A lista não foi criada");
        } else {
            StackNo no = new StackNo();
            no.setValor(valor);
            fim.setProx(no);
            fim = no;
            setTamanho(getTamanho()+1);
        }
    }

    public void pop() {
        if(!existeLista()) {
            System.out.println("Não existe lista");
        } else {
            StackNo temp = inicio;
            for (int i = 0; i < tamanho - 2; i++) {
                temp = temp.getProx();
            }
            if (temp == inicio) {
                inicio = fim = null;
                setTamanho(getTamanho()-1);
                return;
            }
            temp.setProx(null);
            fim = temp;
            setTamanho(getTamanho()-1);
        }
    }

    public void delete() {
        System.out.println("Apagando a lista...");
        inicio = null;
        fim = null;
        setTamanho(0);
        System.out.println("Lista apagada com sucesso.");
    }

    public boolean existeLista() {
        if(getTamanho() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void olhadinha() {
        System.out.println(fim.getValor());
    }
}
