package DSguy.exDoubleLinkedList;

public class DoubleLL {
    NoDLL inicio;
    NoDLL fim;
    int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean jaExisteLista() {
        return inicio != null;
    }

    public NoDLL criarDoubleLL(int valor) {
        NoDLL no = new NoDLL();
        no.setValor(valor);
        inicio = no;
        fim = no;
        no.setProx(null);
        no.setAnt(null);
        setTamanho(1);
        return inicio;
    }


    public void inserirNo(int valor, int local) {
        NoDLL no = new NoDLL();
        no.setValor(valor);
        if(!jaExisteLista()) {
            System.out.println("A lista não foi criada ainda!");
            return;
        } else if (local == 0) {
            no.setProx(inicio);
            no.setAnt(null);
            inicio.setAnt(no);
            inicio = no;
        } else if (local >= getTamanho()) {
            no.setProx(null);
            no.setAnt(fim);
            fim.setProx(no);
            fim = no;
        } else {
            NoDLL tempNo = inicio;
            for (int i = 0; i < local-1; i++) {
                tempNo = tempNo.getProx();
            }
            no.setProx(tempNo.getProx());
            no.setAnt(tempNo);
            tempNo.setProx(no);
            no.getProx().setAnt(no);

        }
        setTamanho(getTamanho()+1);
    }

    public void imprimirDLL() {
        NoDLL no = inicio;
        if(jaExisteLista()) {
            for (int i = 0; i < getTamanho(); i++) {
                System.out.print(no.getValor());
                if (i != getTamanho() - 1) {
                    System.out.print(" --> ");
                }
                no = no.getProx();
            }
        } else {
            System.out.println("A lista não existe");
        }
    }

    public void imprimirReverso() {
        NoDLL no = fim;
        if(jaExisteLista()) {
            for (int i = 0; i < getTamanho(); i++) {
                System.out.print(no.getValor());
                if (i != getTamanho() - 1) {
                    System.out.print(" <-- ");
                }
                no = no.getAnt();
            }
        } else {
            System.out.println("A lista não existe");
        }
    }

    public void buscarValor(int valor) {
        if(jaExisteLista()) {
            NoDLL temp = inicio;
            for(int i = 0; i < getTamanho(); i++) {
                if(temp.getValor() == valor) {
                    System.out.println("O valor foi encontrado na localização "+ i);
                    return;
                }
                temp = temp.getProx();
            }
            System.out.println("Valor não encontrado");
        }
    }

    public void deleteNo (int local) {
        if(jaExisteLista()) {
            if (local <= 0) {
                if(getTamanho() == 1) {
                    inicio = fim = null;
                    return;
                } else {
                    inicio = inicio.getProx();
                    inicio.setAnt(null);
                }
            } else if (local >= getTamanho()-1) {
                if(getTamanho() <= 1) {
                    inicio = fim = null;
                    return;
                } else {
                    fim = fim.getAnt();
                    fim.setProx(null);
                }
            } else {
                NoDLL temp = inicio;
                int index = 0;
                while(index < local-1) {
                    temp = temp.getProx();
                    index++;
                }
                temp.setProx(temp.getProx().getProx());
                temp.getProx().setAnt(temp);
            }
            setTamanho(getTamanho()-1);


        } else {
            System.out.println("A lista não existe!");
        }
    }

    public void deletarLista() {
        if(!jaExisteLista()) {
            System.out.println("A lista não existe");
        } else {
            NoDLL temp = inicio;
            for (int i = 0; i < getTamanho()-1; i++) {
                temp = temp.getProx();
                temp.setAnt(null);
            }
            inicio = fim = null;
        }
    }
}
