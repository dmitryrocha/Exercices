package hackerRank30Days;

import java.util.Scanner;

public class Dia13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        Book livro = new MyBook(title, author, price);
        livro.display();


    }
}

class Book {
    public String titulo;
    public String autor;

    public Book(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void display(){

    }
}

class MyBook extends Book {
    public int preco;

    public MyBook(String titulo, String autor, int preco) {
        super(titulo, autor);
        this.preco = preco;
    }

    public void display() {
        System.out.println("Autor: "+autor);
        System.out.println("Título: "+titulo);
        System.out.println("Preço: R$ "+preco+",00");
    }
}
