package scope.versao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Favor digitar um número:");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
