package hackerRank30Days;

import java.util.Scanner;

public class Dia22 {

//    Solução alternativa
//
//    public static int getHeight(NoHR root){
//        int alturaEsquerda = 0;
//        int alturaDireita = 0;
//
//        if(root.left != null) {
//            alturaEsquerda = getHeight(root.left) + 1;
//        }
//        if(root.right != null) {
//            alturaDireita = getHeight(root.right) + 1;
//        }
//
//        return(alturaEsquerda > alturaDireita ? alturaEsquerda : alturaDireita);
//    }

    public static int getHeight(NoHR root){
        NoHR temp = root;
        int altura = 0;
        int aux = 0;
        boolean sair = false;
        while(!sair) {
            if(temp.left != null) {
                temp = temp.left;
                aux++;
            } else if (temp.right != null) {
                temp = temp.right;
                aux++;
            } else {
                sair = true;
            }
        }
        temp = root;
        altura = aux;
        aux = 0;
        sair = false;
        while(!sair) {
            if(temp.right != null){
                temp = temp.right;
                aux++;
            } else if (temp.left != null) {
                temp = temp.left;
                aux++;
            } else {
                sair = true;
            }

        }
        if(altura > aux) {
            return altura;
        } else {
            return  aux;
        }
    }

    public static NoHR insert(NoHR root, int data){
        if(root==null){
            return new NoHR(data);
        }
        else{
            NoHR cur;
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
        NoHR root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

class NoHR {
    NoHR left,right;
    int data;
    NoHR(int data){
        this.data=data;
        left=right=null;
    }
}
