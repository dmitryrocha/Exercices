package DSguy.exFilaArray;

public class FilaArrayMain {
    public static void main(String[] args) {

        System.out.println("Criando uma fila vazia...");

        FilaArray fila = new FilaArray();
        fila.criarFila(6);

        System.out.println("Inserindo 6 valores à fila...");
        for (int i = 1; i <= 6; i++) {
            fila.inserir(i * 10);
        }

        System.out.println("Quem será o próximo a sair...");
        fila.olhadinha();

        System.out.println("Tirando os 6 valores da fila...");
        for (int i = 0; i <= 5; i++) {
            fila.remover();
            fila.imprimirFila();
        }

        System.out.println("Apagando a fila toda...");
        fila.deletar();

    }
}
