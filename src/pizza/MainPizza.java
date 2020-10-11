package pizza;

public class MainPizza {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizza1 = new Pizza();
        pizza1.adicionarIngrediente("queijo");
        pizza1.adicionarIngrediente("peperoni");
        pizza1.adicionarIngrediente("pimenta");
        pizza1.adicionarIngrediente("loucura");
        System.out.println("A pizza custou R$"+pizza1.getPreco());
        carrinho.adicionarPizzaAoCarrinho(pizza1);
        System.out.println("O valor parcial da sua compra é R$ "+carrinho.valorParcial());

        Pizza pizza2 = new Pizza();
        pizza2.adicionarIngrediente("calabresa");
        pizza2.adicionarIngrediente("queijo");
        pizza2.adicionarIngrediente("alho e óleo");
        pizza2.adicionarIngrediente("peperoni");
        pizza2.adicionarIngrediente("goiabada");
        pizza2.adicionarIngrediente("alfafa");
        pizza2.adicionarIngrediente("minério de ferro");
        pizza2.adicionarIngrediente("queijo");
        System.out.println("A pizza custou R$"+pizza2.getPreco());
        carrinho.adicionarPizzaAoCarrinho(pizza2);
        System.out.println("O valor parcial da sua compra é R$ "+carrinho.valorParcial());

        Pizza pizza3 = new Pizza();
        pizza3.adicionarIngrediente("queijo");
        pizza3.adicionarIngrediente("presunto");
        System.out.println("A pizza custou R$"+pizza3.getPreco());
        carrinho.adicionarPizzaAoCarrinho(pizza3);
        System.out.println("O valor parcial da sua compra é R$ "+carrinho.valorParcial());

        System.out.println("\n\n");
        carrinho.checkOut();
    }
}
