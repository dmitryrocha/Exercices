package DSguy.exDoubleLinkedList;

public class DoubleLLMain {
    public static void main(String[] args) {
        String linha = "\n-----------------------------------\n";
        DoubleLL lista = new DoubleLL();
        lista.criarDoubleLL(5);
        lista.imprimirDLL();

        System.out.println(linha);

        lista.inserirNo(10, 1);
        lista.imprimirDLL();

        System.out.println(linha);

        lista.inserirNo(20,2);
        lista.inserirNo(30,3);
        lista.inserirNo(40,4);
        lista.imprimirDLL();

        System.out.println(linha);

        System.out.println("Procurar o nó com valor 40:");
        lista.buscarValor(40);

        System.out.println(linha);

        System.out.println("Procurar o nó de valor 400:");
        lista.buscarValor(400);

        System.out.println(linha);

        System.out.println("Imprimir a lista na ordem crescente:");
        lista.imprimirDLL();
        System.out.println("Imprimir na ordem inversa:");
        lista.imprimirReverso();

        System.out.println(linha);

        System.out.println("Apagar o node na localização 2:");
        System.out.println("Lista antes:");
        lista.imprimirDLL();
        lista.deleteNo(2);
        System.out.println("\nLista depois:");
        lista.imprimirDLL();

        System.out.println(linha);

        System.out.println("Apagar o node na localização 3:");
        System.out.println("Lista antes:");
        lista.imprimirDLL();
        lista.deleteNo(3);
        System.out.println("\nLista depois:");
        lista.imprimirDLL();

        System.out.println(linha);

        System.out.println("Deletar a lista toda:");
        System.out.println("Antes:");
        lista.imprimirDLL();
        lista.deletarLista();
        System.out.println("\nDepois:");
        lista.imprimirDLL();

    }

//        System.out.println("\n\nDeleting the node having location = 3: ");
//        System.out.println("List before deletion: ");
//        list.traverseLinkedList();
//        list.deletionOfNode(3);
//        System.out.println("List after deletion: ");
//        list.traverseLinkedList();
//
//
//        list.deleteLinkedList();
//        list.traverseLinkedList();

    }
