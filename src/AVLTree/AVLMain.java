package AVLTree;

import java.util.Scanner;

public class AVLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminar = false;
        AVLTree arvore = new AVLTree();


        while(!terminar) {
            arvore = arvore.inserir(new No(sc.nextInt()));
            arvore.calcularBalanceamento();
            arvore = arvore.verificacaBalanceamento();
            System.out.println(arvore.printArvore(0));
        }
    }
}
