package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class ChocolateAniversario {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int d = 3;
        int m = 2;
        lista.add(1);
        lista.add(2);
        lista.add(1);
        lista.add(3);
        lista.add(2);

        System.out.println(birthday(lista, d, m));

    }

    static int birthday(List<Integer> s, int d, int m) {
        int soma = 0;
        int count = 0;
        if(m == 1){
            for (int i = 0; i < s.size(); i++) {
                if(s.get(i) == d) {
                    count++;
                }
            }
            return count;
        } else {
            for (int i = 0; i < s.size() - (m-1); i++) {
                int somador = i;
                for (int j = 0; j < m; j++) {
                    System.out.println("somando " + s.get(somador));
                    soma += s.get(somador);
                    somador++;
                }
                System.out.println("Acabou a soma e deu " + soma);
                if (soma == d) {
                    System.out.println("funcionou");
                    count++;
                }
                soma = 0;
            }
        }
        return count;
    }
}
