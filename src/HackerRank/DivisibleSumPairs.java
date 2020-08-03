package HackerRank;

public class DivisibleSumPairs {
    static int divisiveis (int n, int k, int[] ar) {
        int soma = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(j < n-1) {
                    soma = ar[i]+ar[j+1];
                    System.out.println("A Soma de ar["+i+"] e ar["+(j+1)+"] dá "+soma);
                    if(soma%k==0) {
                        System.out.println("A soma foi divisível por 3");
                        count++;
                    }
                }
                soma = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        int[] ar = {1,3,2,6,1,2};

        int resultado = divisiveis(n,k,ar);
        System.out.println(resultado);
    }
}
