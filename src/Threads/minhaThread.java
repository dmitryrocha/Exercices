package Threads;

public class minhaThread extends Thread {

    private String nome;

    private  int tempo;

    public minhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    public void run() {
        try {
        for(int i = 0; i < 12; i++) {
            System.out.println(nome + " contador " + i);

            Thread.sleep(tempo);
        }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

