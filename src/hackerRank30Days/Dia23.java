package hackerRank30Days;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dia23 {

    static void levelOrder(NodeD23 root){
        Queue<NodeD23> fila = new LinkedList<>();
        fila.add(root);
        while(!fila.isEmpty()) {
            NodeD23 no = fila.remove();
            System.out.print(no.data+" ");
            if(no.left != null) {
                fila.add(no.left);
            }
            if(no.right != null) {
                fila.add(no.right);
            }
        }

    }

    public static NodeD23 insert(NodeD23 root,int data){
        if(root==null){
            return new NodeD23(data);
        }
        else{
            NodeD23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        NodeD23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

class NodeD23{
    NodeD23 left,right;
    int data;
    NodeD23(int data){
        this.data=data;
        left=right=null;
    }
}
