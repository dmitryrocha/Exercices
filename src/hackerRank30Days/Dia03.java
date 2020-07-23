package hackerRank30Days;

public class Dia03 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, -5, 101, 20, 6};
//
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] >= 1 && arr[i] <= 100) {
//                System.out.println("número "+ arr[i] +" passou");
//            } else {
//                System.out.println("número "+ arr[i] +" não passou");
//            }
//        }
        int n = 5;
        int espacos = 4;
        int count = 1;
        boolean mudou = false;
        String degrau = "";
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == espacos) {
                    mudou = true;
                }
                if (mudou) {
                    degrau += "#";
                } else {
                    degrau+= " ";
                }
            }
            System.out.println(degrau);
            degrau = null;
            degrau = "";
            espacos--;
            mudou = false;
        }

    }
}
