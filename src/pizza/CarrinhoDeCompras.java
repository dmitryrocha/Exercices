package pizza;

import java.util.HashMap;
import java.util.List;

public class CarrinhoDeCompras {
    private static HashMap<Pizza, Integer> adicionarPizza = new HashMap<Pizza, Integer>();
    private static HashMap<String, Integer> adicionarIngrediente = new HashMap<String, Integer>();
    private static Integer valorFinal = 0;

    public void adicionarPizzaAoCarrinho(Pizza pizza) {
        List<String> ingredientesDaPizza = pizza.getIngredientesDaPizza();
        if(ingredientesDaPizza.isEmpty()) {
            System.out.println("Sua pizza não tem ingredientes. Favor tentar novamente");
        } else {
            valorFinal+= pizza.getPreco();
            adicionarPizza.put(pizza, pizza.getPreco());
            for (int i = 0; i < ingredientesDaPizza.size(); i++) {

                String ingrediente = ingredientesDaPizza.get(i);
                if(adicionarIngrediente.containsKey(ingrediente)){
                    int qtdIngrediente = adicionarIngrediente.get(ingrediente);

                    adicionarIngrediente.put(ingrediente, qtdIngrediente+1);
                } else {
                    adicionarIngrediente.put(ingrediente, 1);
                }
            }
        }
    }

    public void checkOut() {
        System.out.println("Obrigado por comprar pizzas conosco");
        System.out.println("O total da sua compra foi de R$ "+valorParcial());
        System.out.println("---------------------------------------------------");
        System.out.println("Os ingredientes usados foram: ");
        for(String ingrediente: adicionarIngrediente.keySet()){
            System.out.println("O ingrediente "+ingrediente+" foi usado "+adicionarIngrediente.get(ingrediente)+" vez(es)");
        }
    }

    public Integer valorParcial() {
        return this.valorFinal;
    }


}
