package hackerRank30Days;

import java.util.Scanner;

public class Dia25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;

        while (count < t) {
            int n = sc.nextInt();
//            if(ehPrimo(n, 2)){
//                System.out.println("Primo");
//            } else {
//                System.out.println("Não primo");
//            }
            if(n == 2 || n == 3 || n == 5) {
                System.out.println("Primo");
            } else {
                if(acharPrimo(n)){
                    System.out.println("Primo");
                } else {
                    System.out.println("Não primo");
                }
            }
            count++;
        }
    }

    public static boolean acharPrimo(int n) {
        if(n == 1) {
            return false;
        }
        if(n%2 == 0) {
            return false;
        }
        if(n%3 == 0) {
            return false;
        }
        if(n%5 == 0) {
            return false;
        }

        for(int i = 7; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

//    funcionou com tudo, menos UMA hipótese, truncada

//    public static void acharPrimo(int n) {
//        if(n == 2) {
//            System.out.println("Primo");
//        } else {
//            int contador = 0;
//            for(int i = 2; i <= Math.sqrt(n); i++) {
//                if(n%i == 0) {
//                    contador  = 1;
//                    System.out.println("Não primo");
//                    break;
//                }
//            }
//            if(contador == 0) {
//                System.out.println("Primo");
//            }
//        }
//    }

//    funciona, mas não para números enormes
//
//    public static boolean ehPrimo(int n, int divisor){
//
//        if(n <= 2) {
//            return n == 2;
//        }
//        if(n % divisor == 0) {
//            return false;
//        }
//        if(divisor * divisor > n) {
//            return true;
//        }
//
//        return ehPrimo(n, divisor+1);
//
//    }
}
