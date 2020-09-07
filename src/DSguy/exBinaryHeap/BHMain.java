package DSguy.exBinaryHeap;

public class BHMain {
    public static void main(String[] args) {
        System.out.println("Criando heap");
        BinaryHeap heap = new BinaryHeap(10);

        heap.inserirNoHeap(100);
        heap.inserirNoHeap(90);
        heap.inserirNoHeap(80);
        heap.inserirNoHeap(70);
        heap.inserirNoHeap(60);
        heap.inserirNoHeap(50);
        heap.inserirNoHeap(40);
        heap.inserirNoHeap(30);

        heap.ordenarLevel();


    }
}
