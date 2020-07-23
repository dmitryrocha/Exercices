package Threads;

public class MinhaThreadSoma implements Runnable{

    private String nome;
    private int[] nums;
    private SyncCalc calc = new SyncCalc();

    public MinhaThreadSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome+" iniciada");
        int soma = calc.somaArray(this.nums);
        System.out.println("O resultado da soma para a thread "+this.nome+" é: "+soma);
        System.out.println(this.nome+" terminada");
    }
}
