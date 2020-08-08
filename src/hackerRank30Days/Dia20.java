package hackerRank30Days;


public class Dia20 {
    public static void main(String[] args) {
        int[] array = {5,4,2,1};
        int [] array2 = {1,2,3};
        int[] array3 = {3,2,1};

        System.out.println("Arrumar a primeira:");
        arrumador(array);
        System.out.println("Arrumar a segunda:");
        arrumador(array2);
        System.out.println("Arrumar a terceira:");
        arrumador(array3);

    }

    public static void arrumador (int[] array) {
        int mudadas = 0;

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    mudadas++;
                }
            }
        }
        System.out.println("Array is sorted in "+mudadas+ " swaps.");
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[array.length-1]);
    }
}
