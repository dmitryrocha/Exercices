package scope;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor digitar um número de 1 a 12:");
        int x = scanner.nextInt();
        if(x<1 || x>12) {
            do{
                System.out.println("O número digitado não está no intervalo entre 1 e 12. Favor tenatr novamente:");
                x = scanner.nextInt();
            } while(x<1 || x>12);
        }
        x(x);
    }

    public static void x(int x) {
        if(x<=12){
            System.out.println(x);
            x++;
            x(x);
        }
    }
}
