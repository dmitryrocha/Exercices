package DSguy.exLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListDS lista = new LinkedListDS();

        lista.criarLista(5);
        lista.imprimirLista();

        lista.inserirNaLista(10, 1);
        lista.imprimirLista();

        lista.inserirNaLista(20,2);
        lista.imprimirLista();

        lista.inserirNaLista(30, 3);
        lista.imprimirLista();

        lista.inserirNaLista(40,4);
        lista.imprimirLista();

        System.out.println();

        System.out.println("\nProcurar pelo valor 40 na lista...");
        lista.procurarNo(40);

        System.out.println("\nProcurar pelo valor 500 na lista...");
        lista.procurarNo(500);

        System.out.println("\nApagando um nó, enviando a localização 0:");
        System.out.println("Antres de apagar:");
        lista.imprimirLista();
        lista.apagarNo(0);
        System.out.println("Após apagar:");
        lista.imprimirLista();
        System.out.println(" ");

        System.out.println("\nApagando um nó, enviando a localização 100:");
        System.out.println("Antres de apagar:");
        lista.imprimirLista();
        lista.apagarNo(100);
        System.out.println("Após apagar:");
        lista.imprimirLista();
        System.out.println(" ");

        System.out.println("Apagar a lista toda");
        lista.apagarListaInteira();
        lista.imprimirLista();

    }
}
