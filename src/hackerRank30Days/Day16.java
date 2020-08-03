package hackerRank30Days;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc. next();
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (Exception ex) {
            System.out.println("Bad String");
        }
    }
}
