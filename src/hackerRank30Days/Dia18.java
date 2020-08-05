package hackerRank30Days;

import java.util.*;

public class Dia18 {

    private static Queue<Character>fila = new LinkedList<>();
    private static Stack<Character>pilha = new Stack<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();



        char[] s = input.toCharArray();

        Dia18 p = new Dia18();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }



        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    public void pushCharacter(char ch) {
        pilha.push(ch);
    }

    public void enqueueCharacter(char ch) {
        fila.add(ch);
    }

    public char popCharacter(){
        char letra = ' ';
        if(!fila.isEmpty()) {
            letra = fila.poll();
        }
        return letra;
    }

    public char dequeueCharacter(){
        char letra = ' ';
        if(!pilha.empty()){
            letra = pilha.peek();
            pilha.pop();
        }
        return letra;
    }

}

