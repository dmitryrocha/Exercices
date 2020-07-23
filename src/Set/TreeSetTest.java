package Set;

import java.util.*;

class CelularNomeComparable implements Comparator<Celular> {
    public int compare(Celular c1, Celular c2){
        return c1.getNome().compareTo(c2.getNome());
    }
}

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","Alface",3.99,200);
        Produto produto2 = new Produto("124","Salsa",3.89,150);
        Produto produto3 = new Produto("001","Filé de Peito", 19.99,100);
        Produto produto4 = new Produto("012","Aipim sem casca",7.89,300);
        Celular celular1 = new Celular("iPhone", "12345");
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<Produto>();
        NavigableSet<Celular> celularNavigableSet = new TreeSet<Celular>(new CelularNomeComparable());
        celularNavigableSet.add(celular1);
        for(Celular cel1 : celularNavigableSet){
            System.out.println(cel1);
        }
    }
}
