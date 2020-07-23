package hackerRank30Days;

import java.util.Scanner;

public class Dia05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número?");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            int resultado = n*i;
            System.out.println(n+" x "+i+" = "+resultado);
        }
    }
}
