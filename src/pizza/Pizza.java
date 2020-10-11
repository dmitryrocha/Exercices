package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    public List<String> ingredientesDaPizza = new ArrayList<String>();

    public void adicionarIngrediente(String ingrediente) {
        if(ingredientesDaPizza.contains(ingrediente)) {
            System.out.println("A pizza já possui o ingrediente "+ingrediente);
        } else {
            ingredientesDaPizza.add(ingrediente);
        }
    }

    public int getPreco() {
        int qtd = ingredientesDaPizza.size();
        if(qtd <= 0) {
            System.out.println("Sua pizza não possui ingredientes");
            return 0;
        }else if(qtd>0 && qtd<=2) {
            return 15;
        } else if(qtd>2 && qtd<=5) {
            return 20;
        } else {
            return 23;
        }
    }

    public List<String> getIngredientesDaPizza() {
        return ingredientesDaPizza;
    }
}

