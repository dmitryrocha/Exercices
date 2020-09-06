package AVLTree;

import java.util.Scanner;

public class AVLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean terminar = false;
        AVLTree arvore = new AVLTree(new No(sc.nextInt()));
        arvore.calcularBalanceamento();


        System.out.println(arvore.printArvore(0));

        while(!terminar) {
            arvore = arvore.inserir(new No(sc.nextInt()));
            arvore.calcularBalanceamento();
            System.out.println(arvore.printArvore(0));
        }
    }
}
