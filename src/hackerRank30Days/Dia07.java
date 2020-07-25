package hackerRank30Days;

import java.util.Random;
import java.util.Scanner;

public class Dia07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Qual o tamanho do Array");
        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i]+ " ");
        }

        System.out.println(" ");

        for(int i = n; i > 0; i--) {
            System.out.print(arr[i-1]+" ");

        }
    }
}
