package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","Alface",3.99,200);
        Produto produto2 = new Produto("124","Salsa",3.89,150);
        Produto produto3 = new Produto("001","Filé de Peito", 19.99,100);
        Produto produto4 = new Produto("012","Aipim sem casca",7.89,300);
        Set<Produto> produtoSet = new LinkedHashSet<Produto>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);

        for(Produto p: produtoSet){
            System.out.println(p);
        }
    }

}
