package hackerRank30Days;

import java.text.Collator;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dia28 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String delimitador = "@";

        List nomes = new ArrayList<>();
        //Collection<String> nomesUteis = new TreeSet<String>(Collator.getInstance());
        List<String> nomesUteis = new LinkedList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            String[] emailValido = emailID.split(delimitador);
            if(emailValido[1].equals("gmail.com")) {
                nomesUteis.add(firstName);
            }
        }


        java.util.Collections.sort(nomesUteis, Collator.getInstance());
        Iterator<String> iterator = nomesUteis.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }





    }
//    Li esta resposta no forum e achei bem completa

//    public static void alternativa() {
//        int num = scanner.nextInt();
//        String emailRegEx = ".+@gmail\\.com$";
//        Pattern pattern = Pattern.compile(emailRegEx);
//        List<String> list = new ArrayList();
//        for (int i = 0; i < num; i++){
//            String name = scanner.next();
//            String email = scanner.next();
//            Matcher matcher = pattern.matcher(email);
//            if (matcher.find()){
//                list.add(name);
//            }
//        }
//        Collections.sort(list);
//        for (String name : list){
//            System.out.println(name);
//        }
//    }
    
}
