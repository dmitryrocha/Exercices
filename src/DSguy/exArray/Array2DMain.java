package DSguy.exArray;

import javax.naming.ldap.PagedResultsResponseControl;

public class Array2DMain {
    public static void main(String[] args) {
        String linha = "\n--------------------------------\n";
        Array2D arr2 = new Array2D(6,6);

        arr2.imprimir2D();
        System.out.println(linha);
        System.out.println("Inserir dados na Array...");

        arr2.inserir(333, 2, 4);
        arr2.inserir(22, 1,1);
        arr2.inserir(666,6,6);
        arr2.inserir(666,5,5);

        System.out.println(linha);

        arr2.imprimir2D();

        System.out.println(linha);
        System.out.println("Agora vou procurar algum valor na Array");
        arr2.buscarValor(1,1);
        arr2.buscarValor(5,5);
        arr2.buscarValor(10,10);
        arr2.buscarValor(3,5);

        System.out.println(linha);

        System.out.println("Aora vamos procurar valores");

        arr2.busca(666);
        arr2.busca(10);
        arr2.busca(22);

        System.out.println(linha);

        System.out.println("Agora vamos apagar alguns valores");
        arr2.imprimir2D();
        arr2.delete(1,1);
        arr2.delete(5,5);
        arr2.delete(5,4);
        arr2.imprimir2D();
    }
}
