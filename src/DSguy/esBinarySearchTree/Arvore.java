package DSguy.esBinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Arvore {

    NoBST raiz;

    public NoBST getRaiz() {
        return raiz;
    }

    public Arvore() {
        raiz = null;
    }

    public void inserir(int valor){
        raiz = inserir(raiz, valor);
    }

    public NoBST inserir(NoBST no, int valor) {
        if(no == null) {
            System.out.println("O valor  "+valor+" foi inserido na árvore");
            return criarNovoNo(valor);
        } else if(valor <= no.getValor()) {
            no.setEsquerda(inserir(no.getEsquerda(), valor));
            return no;
        } else {
            no.setDireita(inserir(no.getDireita(), valor));
            return no;
        }
    }

    public NoBST criarNovoNo(int valor) {
        NoBST no = new NoBST();
        no.setValor(valor);
        return no;
    }

    public void imprimirNaPosOrdem(NoBST raiz) {
        if(raiz == null) {
            System.out.println("Não existe árvore");
        } else {
            System.out.println("Imprimindo na pós-ordem:");
            imprimirPosOrdem(raiz);
        }
    }

    private void imprimirPosOrdem(NoBST raiz) {
        if(raiz == null) {
            return;
        } else {
            imprimirOrdem(raiz.getEsquerda());
            imprimirOrdem(raiz.getDireita());
            System.out.print(raiz.getValor()+" ");
        }
    }

    public void imprimirNoPorNivel(NoBST raiz) {
        if(raiz == null) {
            System.out.println("Não existe árvore");
        } else {
            System.out.println("Imprimindo por nível:");
            imprimirPorNivel(raiz);
        }
    }

    private void imprimirPorNivel(NoBST raiz) {
        Queue<NoBST> fila = new LinkedList<>();
        fila.add(raiz);
        while(!fila.isEmpty()){
            NoBST no = fila.remove();
            System.out.print(no.getValor()+" ");
            if(no.getEsquerda() != null){
                fila.add(no.getEsquerda());
            }
            if(no.getDireita() != null) {
                fila.add(no.getDireita());
            }
        }
    }

    public void imprimirNaOrdem(NoBST raiz) {
        if(raiz == null) {
            System.out.println("Não existe árvore");
        } else {
            System.out.println("Imprimindo na ordem:");
            imprimirOrdem(raiz);
        }
    }

    private void imprimirOrdem(NoBST raiz) {
        if(raiz == null) {
            return;
        } else {
            imprimirOrdem(raiz.getEsquerda());
            System.out.print(raiz.getValor()+" ");
            imprimirOrdem(raiz.getDireita());
        }
    }

    private void imprimirPreOrdem(NoBST raiz) {
        if(raiz == null) {
            return;
        } else {
            System.out.print(raiz.getValor()+" ");
            imprimirPreOrdem(raiz.getEsquerda());
            imprimirPreOrdem(raiz.getDireita());
        }
    }

    public void imprimirNaPreOrdem(NoBST raiz) {
        if(raiz == null) {
            System.out.println("Não existe árvore");
        } else {
            System.out.println("Imprimindo na pré-ordem");
            imprimirPreOrdem(raiz);
        }
    }

    public void deleteNo(int valor) {
        System.out.println("Deletando o nó de valor "+valor);
    }

    public NoBST deleteNo(NoBST raiz, int valor) {
        if(raiz == null) {
            System.out.println("Valor não encontrado na árvore");
            return null;
        } else {
            if(valor < raiz.getValor()) {
                raiz.setEsquerda(deleteNo(raiz.getEsquerda(), valor));
            } else if(valor > raiz.getValor()) {
                raiz.setDireita(deleteNo(raiz.getDireita(), valor));
            } else {
                if(raiz.getEsquerda() != null && raiz.getDireita() != null) {
                    NoBST temp = raiz;
                    NoBST menorAdireita = menorAdireita(temp.getDireita());
                    raiz.setValor(menorAdireita.getValor());
                    raiz.setDireita(deleteNo(raiz.getDireita(), menorAdireita.getValor()));
                } else if( raiz.getEsquerda() != null) {
                    raiz = raiz.getEsquerda();
                } else if (raiz.getDireita() != null) {
                    raiz = raiz.getDireita();
                } else {
                    raiz = null;
                }
            }
        }
        return raiz;
    }

    public static NoBST menorAdireita(NoBST raiz) {
        if(raiz.getEsquerda() == null) {
            return raiz;
        } else {
            return menorAdireita(raiz.getEsquerda());
        }
    }

    public void deletarArvoreToda() {
        raiz = null;
    }

}
