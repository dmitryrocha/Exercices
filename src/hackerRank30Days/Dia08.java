package hackerRank30Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dia08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas pessoas vão ser inseridas:");
        int n = in.nextInt();
        Map<String, Integer> telefones = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            System.out.println("Qual o nome?");
            String name = in.next();
            System.out.println("Qual o telefone? (apenas números)");
            int phone = in.nextInt();
            telefones.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
//            Set<String> indice = telefones.keySet();
//            boolean passou = false;
//            for(String nome: indice) {
//                if(nome.equals(s)) {
//                    String nome1 = nome;
//                    int telefone = telefones.get(nome);
//                    System.out.println(nome1+ " - " +telefone);
//
//                    passou = true;
//                    break;
//                }
//            }
//            if(!passou) {
//                System.out.println("Não encontrado");
//            }
//            passou = false;
            if(telefones.get(s)==null){
                System.out.println("Not found");
            } else {
                System.out.println(s+"="+telefones.get(s));
            }
        }
        in.close();
    }
}
