package DSguy.exLLStack;

import DSguy.exStackArray.DsStackArray;

public class DsLLStackMain {
    public static void main(String[] args) {
        System.out.println("Vamos criar a pilha com o primeiro valor sendo 10");
        DsLLStack dsLL = new DsLLStack();
        dsLL.criarLista(10);

        System.out.println("Preenchendo a pilha");
        for (int i = 0; i <= 5; i++) {
            dsLL.push(i*100);
            System.out.println("Valor "+i*100+" inserido com sucesso.");
        }

        System.out.println("Dando uma olhadinha em quem está no topo da pilha");
        dsLL.olhadinha();

        System.out.println("Tirando um da pilha e dando uma olhadinha");
        dsLL.pop();
        dsLL.olhadinha();

        System.out.println("Tirando um da pilha e dando uma olhadinha");
        dsLL.pop();
        dsLL.olhadinha();

        System.out.println("Tirando um da pilha e dando uma olhadinha");
        dsLL.pop();
        dsLL.olhadinha();

        System.out.println("Apagando a lista");
        dsLL.delete();

        System.out.println("Testando se existe lista");
        System.out.println(dsLL.existeLista());
    }
}
