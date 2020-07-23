package Comparator;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Laptop> laptops= new ArrayList<>();
        laptops.add(new Laptop(16, "Dell", 800));
        laptops.add(new Laptop(8,"Apple", 1200));
        laptops.add(new Laptop(12,"Acer", 700));

        Comparator<Laptop> compPreco = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                if(l1.getPrice() > l2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };

        Comparator<Laptop> compRam = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                if(l1.getRam() > l2.getRam())
                    return 1;
                else
                    return -1;
            }
        };

        System.out.println("Listar por RAM");
        Collections.sort(laptops, compRam);

        for (Laptop l : laptops) {
            System.out.println(l);
        }

        System.out.println("Listar por preço");
        Collections.sort(laptops, compPreco);

        for(Laptop l : laptops){
            System.out.println(l);
        }

    }


}
