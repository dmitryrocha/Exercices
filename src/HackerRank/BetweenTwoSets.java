package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        arr.add(1);
        //arr.add(4);
        //brr.add(16);
        //brr.add(32);
        brr.add(100);
        int total = Resolucao.getTotalX(arr, brr);
        System.out.println("Total é "+total);
    }

}
class Resolucao {
    public static int getTotalX(List<Integer>a, List<Integer> b) {
        int count = 0;
        boolean todos = false;
        List<Integer> possiveis = new ArrayList<>();
        for(int i = a.get(0); i <= b.get(b.size()-1); i++){
            for(int j = 0; j < a.size(); j++) {
                System.out.print("tentando dividir "+i+ " por "+a.get(j)+" ");
                if(i%a.get(j) == 0) {
                    System.out.println("passa");
                    todos = true;
                } else {
                    System.out.println("não passa");
                    todos = false;
                    break;
                }
            }
            if (todos) {
                System.out.println("Adicionou "+i+" a possíveis");
                possiveis.add(i);
                count++;
            }
            todos = false;
        }
        System.out.println("possiveis tem tamanho "+possiveis.size());
        count = 0;
        for(int i = 0; i < possiveis.size(); i++) {
            for(int j = 0; j < b.size(); j++) {
                System.out.println("tentando "+b.get(j)+" dividido por "+ possiveis.get(i));
                if(b.get(j)%possiveis.get(i) == 0){
                    System.out.println("passa");
                    todos = true;
                } else {
                    System.out.println("não passa");
                    todos = false;
                    break;
                }
            }
            if(todos){
                count++;
            }
            todos = false;
        }
//        for(int i =a.get(0); i < b.get(0); i++) {
//            for(int j = 0; j < a.size(); j++){
//                if(i%a.get(j) == 0) {
//                    todos = true;
//                } else {
//                    todos = false;
//                }
//            }
//            if(todos) {
//                possiveis.add(i);
//            }
//            todos = false;
//        }
//        for(int i = 0; i < possiveis.size(); i++){
//            for(int j = 0 ; j < b.size(); j++) {
//                if(b.get(j)%possiveis.get(i) == 0){
//                    System.out.println(b.get(j)+" é divisível por "+possiveis.get(i));
//                    todos = true;
//                } else {
//                    System.out.println(b.get(j)+" não é divisível por "+possiveis.get(i));
//                    todos = false;
//                }
//            }
//            if(todos) {
//                count++;
//            }
//            todos = false;
//        }


        return count;
    }
}
