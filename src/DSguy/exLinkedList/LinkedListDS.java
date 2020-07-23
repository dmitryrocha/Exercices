package DSguy.exLinkedList;

public class LinkedListDS {
    private NoLL head;
    private NoLL tail;
    private int tamanho;

    public NoLL criarLista(int valor) {
        head = new NoLL();
        NoLL no = new NoLL();
        no.setValor(valor);
        no.setProximo(null);
        head = no;
        tail = no;
        tamanho = 1;
        return head;
    }

    public NoLL getHead() {
        return head;
    }

    public void setHead(NoLL head) {
        this.head = head;
    }

    public NoLL getTail() {
        return tail;
    }

    public void setTail(NoLL tail) {
        this.tail = tail;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void inserirNaLista(int valor, int local) {
        NoLL no = new NoLL();
        no.setValor(valor);
        if(!jaExisteLista()) {
            System.out.println("A lista não existe");
        } else if (local == 0) {
            no.setProximo(no);
            head = no;
        } else if (local >= tamanho) {
            no.setProximo(null);
            tail.setProximo(no);
            tail = no;
        } else {
            NoLL temporario = head;
            int index = 0;
            while (index < local - 1) {
                temporario = temporario.getProximo();
                index++;
            }
            NoLL proxNo = temporario.getProximo();
            temporario.setProximo(no);
            no.setProximo(proxNo);
        }
        setTamanho(getTamanho()+1);
    }

    public boolean jaExisteLista() {
        return head != null;
    }

    void imprimirLista() {
        if(jaExisteLista()) {
            NoLL temp = head;
            for (int i = 0; i < getTamanho(); i++) {
                System.out.print(temp.getValor());
                if(i != getTamanho() - 1) {
                    System.out.print(" --> ");
                }
                temp = temp.getProximo();
            }
        } else {
            System.out.println("A lista não existe");
        }
        System.out.println("\n");
    }

    void apagarListaInteira() {
        System.out.println("Deletando lista...");
        head = null;
        tail = null;
        System.out.println("Lista deletada com sucesso");
    }

    boolean procurarNo(int valor) {
        if(jaExisteLista()) {
            NoLL temp = head;
            for(int i = 0; i < getTamanho(); i++) {
                if(temp.getValor() == valor) {
                    System.out.println("Encontramos este valor na localização "+ i +"\n");
                    return true;
                }
                temp = temp.getProximo();
            }
        }
        System.out.println("Nó não encontrado!\n");
        return false;
    }

    public void apagarNo (int localizacao) {
        if(!jaExisteLista()) {
            System.out.println("A lista não existe!");
            return;
        } else if(localizacao == 0) {
            head = head.getProximo();
            setTamanho(getTamanho()-1);
            if (getTamanho() == 0) {
                tail = null;
            }
        } else if (localizacao >= getTamanho()) {
            NoLL temp = head;
            for(int i = 0; i < tamanho - 1; i++) {
                temp = temp.getProximo();
            }
            if (temp == head) {
                tail = head = null;
                setTamanho(getTamanho()-1);
                return;
            }
            temp.setProximo(null);
            tail = temp;
            setTamanho(getTamanho()-1);
        } else {
            NoLL temp = head;
            for(int i = 0; i < localizacao - 1; i++) {
                temp = temp.getProximo();
            }
            temp.setProximo(temp.getProximo().getProximo());
            setTamanho(getTamanho()-1);
        }
    }
}
