package hackerRank30Days;

public class Dia21 {
    public static void main(String[] args) {
        Integer[] arrayInt = {3, 4, 22, 666, 1, 0};
        String[] arrayStr = {"Eu","nem","devia","estar","estudando","hoje","é","sábado"};

        Printer printStr = new Printer();
        Printer printInt = new Printer();

        printInt.printArray(arrayInt);
        System.out.println("\n---------------------------\n");
        printStr.printArray(arrayStr);
    }
}

class Printer<T> {
    public void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
    }
}
