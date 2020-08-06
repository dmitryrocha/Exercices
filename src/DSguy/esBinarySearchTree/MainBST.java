package DSguy.esBinarySearchTree;

public class MainBST {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(100);
        arvore.inserir(80);
        arvore.inserir(70);
        arvore.inserir(90);
        arvore.inserir(50);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(200);
        arvore.inserir(150);
        arvore.inserir(300);
        arvore.inserir(250);
        arvore.inserir(400);

        arvore.imprimirNaPreOrdem(arvore.raiz);
        System.out.println("");
        arvore.imprimirNaOrdem(arvore.raiz);
        System.out.println(" ");
        arvore.imprimirNaPosOrdem(arvore.raiz);
        System.out.println(" ");
        arvore.imprimirNoPorNivel(arvore.raiz);


    }
}
