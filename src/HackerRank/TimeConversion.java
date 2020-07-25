package HackerRank;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String horario = sc.next();
        String periodo = horario.substring(8);
        String semHora = horario.substring(2);
//        System.out.println(semHora);
//        System.out.println(periodo);
        if(periodo.equals("AM")) {
            if(horario.substring(0,2).equals("12")){
                System.out.print("00"+semHora.substring(0,6));
            } else{
                System.out.print(horario.substring(0,8));
            }
        } else {
            if(horario.substring(0,2).equals("12")){
                System.out.print("12"+semHora.substring(0,6));
            } else {
                int horaNova = Integer.parseInt(horario.substring(0,2));
                horaNova += 12;
                String horaNovaS = Integer.toString(horaNova);
                System.out.print(horaNovaS+semHora.substring(0,6));
            }
        }
//
//        if(horario.substring(0,2).equals("12")){
//            System.out.println("Não é meio dia");
//            horario.replaceFirst("12","00");
//            System.out.println(horario);
//        } else {
//            System.out.println("funcionou");
//        }

    }
}
