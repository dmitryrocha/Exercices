package hackerRank30Days;

import java.util.Scanner;

public class Dia15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        System.out.println("Qual o tamanho da lista?");
        int N = sc.nextInt();

        while(N-- > 0) {
            System.out.println("Digite um elemento inteiro:");
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        System.out.println("Esta é sua lista");
        display(head);
        sc.close();

    }
    public static Node insert(Node head,int data) {
        Node inicio = new Node(data);
        if(head == null) {
            return inicio;
        } else {
            Node prox = head;
            while(prox.next !=null) {
                prox = prox.next;
            }
            prox.next = inicio;
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
