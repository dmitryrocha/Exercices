package DSguy.exArray;

public class Array1D {
    private int[] arr = null;

    public Array1D(int tamanho) {
        arr = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void imprimir () {
        try {
            for(int i =0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        } catch (Exception e) {
            System.out.println("Deu erro");
        }
        System.out.println(" ");
    }

    public void inserir (int local, int valor) {
        try {
            if(arr[local] == Integer.MIN_VALUE) {
                arr[local] = valor;
                System.out.println("Valor "+valor+" inserido com sucesso");
            } else {
                System.out.println("Este local já está preenchido");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Local inválido");
        }
    }

    public void buscarCelula(int valor) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == valor) {
                System.out.println("Valor "+valor+" encontrado na célula "+i);
                return;
            }
        }
        System.out.println("Valor "+valor+" não encontrado no Array");

    }

    public void deletar (int valor) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == valor) {
                arr[i] = Integer.MIN_VALUE;
                System.out.println("Valor "+valor+" foi encontrado e deletado.");
                return;
            }
        }
        System.out.println("O valor "+valor+" não existe na array");
    }
}
