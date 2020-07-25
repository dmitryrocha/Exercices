package hackerRank30Days;

import java.util.Scanner;

public class Dia06 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vezes isso vai acontecer?");
        int rodadas = sc.nextInt();
        int count = 0;
        while(rodadas!=count){
            System.out.println("Escreva a palavra");
            //if(sc.hasNext()) break;
            String palavra1 = sc.next();
            StringBuilder pares = new StringBuilder();
            StringBuilder impares = new StringBuilder();
            for(int i = 0; i < palavra1.length(); i++){
                if(i%2==0){
                    pares.append(palavra1.substring(i, i + 1));
                } else {
                    impares.append(palavra1.substring(i, i+1));
                }
            }
            System.out.println(pares +" "+impares);
            count++;

        }


    }
}
