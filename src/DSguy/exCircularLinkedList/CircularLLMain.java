package DSguy.exCircularLinkedList;

public class CircularLLMain {
    public static void main(String[] args) {
        String linhas = "--------------------------------------------";
        CircularLL lista = new CircularLL();
        lista.criarListaCircular(5);
        lista.inserirCLL(10,1);
        lista.inserirCLL(20,2);
        lista.inserirCLL(30,3);
        lista.inserirCLL(40,4);

        System.out.println("Imprimir lista completa");
        lista.imprimir();
        System.out.println(linhas);

        lista.inserirCLL(35, 4);
        System.out.println("Imprimir a lista após adicionar:");
        lista.imprimir();
        System.out.println(linhas);
        System.out.println("Tamanho atual da lista "+ lista.getTamanho());
        System.out.println();
        System.out.println(linhas);

        lista.inserirCLL(1,0);
        System.out.println("Imprimir a lista");
        lista.imprimir();
        System.out.println(linhas);

        lista.inserirCLL(100,10);
        System.out.println("Imprimir a lista");
        lista.imprimir();

        System.out.println(linhas);
        System.out.println("Imprimir as referências de início e fim");
        lista.imprimirUsandoInicioFim();

        System.out.println(linhas);

        System.out.println("Procurar pelo valor 40:");
        lista.buscarValor(40);
        System.out.println(linhas);

        System.out.println("Procurar pelo valor 200");
        lista.buscarValor(200);

        System.out.println(linhas);
        System.out.println("Apagar usando a localização 2:\nAntes de deletar");
        lista.imprimir();
        lista.apagarNo(2);
        System.out.println("Depois de apagar...\n");
        lista.imprimir();

        System.out.println(linhas);
        System.out.println("Apagar usando a localização 0:\nAntes de deletar");
        lista.imprimir();
        lista.apagarNo(0);
        System.out.println("Depois de apagar...\n");
        lista.imprimir();

        System.out.println(linhas);
        System.out.println("Apagar usando a localização 15:\nAntes de deletar");
        lista.imprimir();
        lista.apagarNo(15);
        System.out.println("Depois de apagar...\n");
        lista.imprimir();

        System.out.println(linhas);
        System.out.println("Apagar usando a localização 15:\nAntes de deletar");
        lista.imprimir();
        lista.apagarNo(15);
        System.out.println("Depois de apagar...\n");
        lista.imprimir();

        System.out.println(linhas);
        System.out.println("Apagar a lista toda");
        lista.deleteList();
        System.out.println("Agora imprimir a lista");
        lista.imprimir();

    }
}
