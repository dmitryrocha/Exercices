package DSguy.exFilaCircularArray;

public class FilaCircularArrayMain {

    public static void main(String[] args) {

        System.out.println("Criando uma fila vazia de tamanho 6...");
        FilaCircularArray fila = new FilaCircularArray(6);

        System.out.println("\nPreenchendo a fila...");
        for (int i = 1; i <= 5; i++) {
            fila.push(i * 10);
        }

        fila.push(60);
        fila.pop();
        fila.imprimirFila();
        fila.push(60);
        fila.imprimirFila();
        fila.apagarFila();
        fila.imprimirFila();

    }

}
