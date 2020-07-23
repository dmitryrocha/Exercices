package DSguy.exCircularLinkedList;

import DSguy.exLinkedList.NoLL;

public class CircularLL {
    NoCLL inicio;
    NoCLL fim;
    int tamanho;

    public NoCLL criarListaCircular(int valor) {
        NoCLL no = new NoCLL();
        no.setValor(valor);
        no.setProx(no);
        inicio = no;
        fim = no;
        tamanho = 1;
        return inicio;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


    public boolean jaExisteLista() {
        return inicio != null;
    }

    public void inserirCLL(int valor, int local) {
        NoCLL no = new NoCLL();
        no.setValor(valor);

        if (!jaExisteLista()) {
            System.out.println("Não existe lista");
            return;
        } else if (local == 0) {
            no.setProx(inicio);
            inicio = no;
            fim.setProx(inicio);
        } else if (local >= tamanho) {
            no.setProx(inicio);
            fim.setProx(no);
            fim = no;
        } else {
            NoCLL temp = inicio;
            int index = 0;
            while (index < local - 1) {
                temp = temp.getProx();
                index++;
            }
            no.setProx(temp.getProx());
            temp.setProx(no);
        }
        setTamanho(getTamanho() + 1);
    }

    public void imprimir() {
        if (jaExisteLista()) {
            NoCLL temp = inicio;
            for (int i = 0; i < getTamanho(); i++) {
                System.out.print(temp.getValor());
                if (i != getTamanho() - 1) {
                    System.out.print(" --> ");
                }
                temp = temp.getProx();
            }
        } else {
            System.out.println("A lista não existe");
        }
        System.out.println("\n");
    }

    public void buscarValor(int valor) {
        if (jaExisteLista()) {
            NoCLL temp = inicio;
            for (int i = 0; i < getTamanho(); i++) {
                if (temp.getValor() == valor) {
                    System.out.println("O valor estava no index " + i);
                    return;
                }
                temp = temp.getProx();
            }
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("Não existe lista!");
        }
    }

    public void apagarNo(int local) {
        NoCLL temp = inicio;
        if (!jaExisteLista()) {
            System.out.println("A lista não existe!");
        } else if (local == 0) {
            inicio = inicio.getProx();
            fim.setProx(inicio);
            setTamanho(getTamanho()-1);
            if (getTamanho() == 0) {
                temp.setProx(null);
                inicio = null;
                fim = null;
            }
        } else if (local >= getTamanho()) {
            for (int i = 0; i < local - 1; i++) {
                temp = temp.getProx();
            }
            if (temp == inicio) {
                inicio = fim = null;
                setTamanho(getTamanho() - 1);
                return;
            }
            fim.setProx(inicio);
            setTamanho(getTamanho() - 1);
        } else {
            for (int i = 0; i < local - 1; i++) {
                temp = temp.getProx();
            }
            temp.setProx(temp.getProx().getProx());
            setTamanho(getTamanho() - 1);
        }
    }

    void imprimirUsandoInicioFim() {
        if (jaExisteLista()) {
            System.out.println("Imprimindo fim...");
            System.out.println(fim.getValor());

            System.out.println("Imprimir o início usando a referência de início...");
            System.out.println(inicio.getValor());

            System.out.println("Imprimir o incio usando a referência do fim...");
            System.out.println(fim.getProx().getValor());

        } else {
            System.out.println("Lista não existe");
        }
    }

    public void deleteList() {
        fim.setProx(null);
        inicio = null;
        fim = null;
    }
}
