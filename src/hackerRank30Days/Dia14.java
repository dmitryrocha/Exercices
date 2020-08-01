package hackerRank30Days;

import java.util.Scanner;

public class Dia14 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elementos;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elementos = a;
        this.maximumDifference = 0;
    }

    public void setMaximumDifference(int maximumDifference) {
        this.maximumDifference = maximumDifference;
    }

    public void computeDifference() {
        int diferenca = 0;
        int count = 0;
        int max = 0;
        for( int i = 0; i < elementos.length-1; i++) {
            for(int j = i; j < elementos.length - 1; j++) {
                count++;
                diferenca = elementos[i] - elementos[i+count];
                System.out.println("A diferença de "+elementos[i]+" e "+elementos[i+count]+" é "+diferenca);
                if(max<Math.abs(diferenca)){
                    max = Math.abs(diferenca);
                    setMaximumDifference(max);
                }
            }


            count = 0;
            diferenca = 0;
        }

    }
}
