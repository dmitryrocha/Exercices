package DSguy.exArray;

public class Array2D {

    private int[][] arr;

    public Array2D (int lin, int col) {
        arr = new int[lin][col];
        for(int linha = 0; linha< arr.length; linha++) {
            for (int coluna = 0; coluna < arr[0].length; coluna++) {
                arr[linha][coluna] = Integer.MIN_VALUE;
            }
        }
    }

    public void imprimir2D(){
        System.out.println("Imprimindo a array 2D:");
        for(int i = 0; i< arr.length; i++) {
            for ( int j = 0;  j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public void inserir (int valor, int linha, int coluna) {
        try {
            if(arr[linha][coluna] == Integer.MIN_VALUE) {
                arr[linha][coluna] = valor;
                System.out.println("Valor "+valor+" foi inserido com sucesso na posição linha "+linha+"/coluna"+coluna);
            } else {
                System.out.println("O espaço já estava preenchido");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Localização inválida");
        }
    }

    public void buscarValor (int linha, int coluna) {
        try {
            System.out.println("o valor nesta célula é "+arr[linha][coluna]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Valor de localização inválido");
        }
    }

    public void busca (int valor) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == valor) {
                    System.out.println("Seu valor foi encontrado na linha "+i+"/coluna "+j);
                    return;
                }
            }
        }
        System.out.println("O valor "+ valor +" não existe nao array");
    }

    public void delete (int linha, int coluna) {
        try {
            if(arr[linha][coluna] == Integer.MIN_VALUE) {
                System.out.println("Não existe valor registrado aqui");
            } else {
                System.out.println("O valor "+arr[linha][coluna]+" foi apagado com sucesso");
                arr[linha][coluna] = Integer.MIN_VALUE;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Localização inválida");
        }
    }

}
