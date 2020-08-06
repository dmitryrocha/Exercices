package hackerRank30Days;

import java.util.Scanner;

public class Dia19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número:");
        int n = sc.nextInt();
        CalculadoraInterface calc = new CalculadoraInterface();
        int soma = calc.somaDoDivisor(n);
        System.out.println("Eu implementei: "+calc.getClass().getInterfaces()[0].getName());
        System.out.println("A soma foi "+soma);
    }
}

class CalculadoraInterface implements AdvancedArithmetic {

    @Override
    public int somaDoDivisor(int n) {
        int soma = 0;
        for(int i = 1; i <= n; i++) {
            if(n%i==0) {
                soma += i;
            }
        }
        return soma;
    }
}

interface AdvancedArithmetic {
    int somaDoDivisor(int n);
}
