package hackerRank30Days;

import java.io.*;
import java.util.*;

public class Dia24 {

    public static NodeD24 removeDuplicates(NodeD24 head) {
        //Write your code here
        if(head == null) {
            return null;
        } else {
            NodeD24 atual = head;
            while(atual != null) {
                NodeD24 corredor = atual;
                while(corredor.next != null) {
                    //System.out.println("Corredor.next = "+corredor.next.data+" e atual.data = "+atual.data);
                    if(corredor.next.data == atual.data) {
                        //System.out.println("\nVou trocar o próximo pelo próximo do próximo");
                        corredor.next  = corredor.next.next;
                    } else {
                        //System.out.println("\nvou passar direto\n");
                        corredor = corredor.next;
                    }
                }
                atual = atual.next;
            }

            return head;
        }
    }

    public static NodeD24 insert(NodeD24 head, int data) {
        NodeD24 p = new NodeD24(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            NodeD24 start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(NodeD24 head) {
        NodeD24 start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeD24 head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}


class NodeD24 {
    int data;
    NodeD24 next;

    NodeD24(int d) {
        data = d;
        next = null;
    }

}
