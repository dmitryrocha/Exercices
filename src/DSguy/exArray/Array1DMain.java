package DSguy.exArray;

public class Array1DMain {
    public static void main(String[] args) {
        String linhas = "----------------------------------";
        System.out.println("Criando uma array de tamhno 10");
        Array1D arrayzinha = new Array1D(10);

        System.out.println("Imprimindo a array...");
        arrayzinha.imprimir();
        System.out.println(linhas);

        System.out.println("Inserindo valores:");
        System.out.println("Valor 10, na posição 0");
        arrayzinha.inserir(0,10);
        System.out.println("Inserindo valores:");
        System.out.println("Valor 290, na posição 1");
        arrayzinha.inserir(1,290);
        System.out.println("Inserindo valores:");
        System.out.println("Valor 33, na posição 5");
        arrayzinha.inserir(5,33);
        System.out.println("Inserindo um valor em célula ocupada");
        arrayzinha.inserir(0,20);
        System.out.println(linhas);
        System.out.println("Imprimindo a array...");
        arrayzinha.imprimir();
        System.out.println(linhas);
        System.out.println("Buscando valores na array");
        arrayzinha.buscarCelula(290);
        arrayzinha.buscarCelula(3);
        System.out.println(linhas);
        System.out.println("Deletar valor na array");
        arrayzinha.deletar(10);
        arrayzinha.deletar(10);
        System.out.println(linhas);
        System.out.println("Imprimindo a array de novo");
        arrayzinha.imprimir();



    }
}
