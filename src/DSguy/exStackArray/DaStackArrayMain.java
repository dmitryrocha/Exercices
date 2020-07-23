package DSguy.exStackArray;

public class DaStackArrayMain {
    public static void main(String[] args) {
        System.out.println("Vamos criar a pilha");
        DsStackArray dsPilha = new DsStackArray(5);

        System.out.println("Preenchendo a pilha");
        for (int i = 0; i <= 5; i++) {
            dsPilha.push(i*10);
        }

        System.out.println("Dando uma olhadinha em quem está no topo da pilha");
        dsPilha.olhadinha();

        System.out.println("Tirando um da pilha e dando uma olhadinha");
        dsPilha.pop();
        dsPilha.olhadinha();

        System.out.println("Apagando a lista");
        dsPilha.delete();
    }
}
