package hackerRank30Days;

public class Dia04 {

    private int idade;

    public Dia04 (int idadeInicial) {
        if(idadeInicial < 0) {
            System.out.println("Idade inválida");
            this.idade = 0;
        } else {
            this.idade = idadeInicial;
        }
    }

    public void anosPassando() {
        idade++;
        System.out.println("Idade nova " +idade);
    }

    public void toVeio() {
        if(idade < 13) {
            System.out.println("Tô novo");
        } else if(idade>=13 && idade < 18) {
            System.out.println("Virei adolescente");
        } else {
            System.out.println("Tô véio");
        }
    }

    public static void main(String[] args) {
        int T = 5;
        int idade = 10;
        Dia04 p = new Dia04(idade);
        for (int i = 0; i < T; i++) {



            p.toVeio();
            for (int j = 0; j < 3; j++) {
                p.anosPassando();
            }
            p.toVeio();
            System.out.println();
        }
    }
}
