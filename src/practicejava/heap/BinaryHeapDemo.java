package practicejava.heap;

public class BinaryHeapDemo {
    public static void main(String[] args) {
        final BinaryHeap heap = new BinaryHeap(6);
        heap.insertMinHeap(10);
        heap.insertMinHeap(5);
        heap.insertMinHeap(15);
        heap.insertMinHeap(1);
        heap.insertMinHeap(3);
        heap.insertMinHeap(8);
        heap.levelOrderTraversal();

        heap.getRootOfBinaryMinHeap();
        heap.levelOrderTraversal();


    }
}
