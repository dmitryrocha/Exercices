package Set;

public class Produto {
    private String cod;
    private String nome;
    private Double preco;
    private int estoque;

    public Produto(String cod, String nome, Double preco, int estoque) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "cod='" + cod + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
