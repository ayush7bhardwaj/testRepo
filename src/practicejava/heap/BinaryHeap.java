package practicejava.heap;

public class BinaryHeap {

    private int[] heap;
    private int lastUsedIndex;
    private int sizeOfHeap;

    public BinaryHeap(int size) {
        this.sizeOfHeap = size + 1;
        this.heap = new int[this.sizeOfHeap];
        this.lastUsedIndex = 0;
    }

    public boolean isEmpty() {
        return lastUsedIndex == 0;
    }

    public boolean isFull() {
        return lastUsedIndex == sizeOfHeap - 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return heap[1];
        } else
            return -1;
    }

    public int sizeOfBinaryHeap() {
        return lastUsedIndex;
    }

    public void levelOrderTraversal() {
        if (!isEmpty()) {
            for (int i = 1; i <= lastUsedIndex; i++) {
                System.out.print(heap[i] + " ");
            }
            System.out.println("");
        } else
            System.out.println("Heap is empty");
    }

    private void heapify(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1)
            return;
        if (heapType == "MIN") {
            if (heap[index] < heap[parent]) {
                int temp = heap[index];
                heap[index] = heap[parent];
                heap[parent] = temp;
            }
        } else if (heapType == "MAX") {
            if (heap[index] > heap[parent]) {
                int temp = heap[index];
                heap[index] = heap[parent];
                heap[parent] = temp;
            }
        }
        heapify(parent, heapType);
    }

    private void insert(int item, String heapType) {
        if (!isFull()) {
            lastUsedIndex = lastUsedIndex + 1;
            heap[lastUsedIndex] = item;
            heapify(lastUsedIndex, heapType);
        } else
            System.out.println("Heap is full");
    }

    public void insertMinHeap(int item) {
        insert(item, "MIN");
    }

    public void insertMaxHeap(int item) {
        insert(item, "MAX");
    }

    private void heapifyTopToBottom(int index, String heapType) {
        int left = 2 * index;
        int right = 2 * index + 1;
        int swapChild = 0;
        if (lastUsedIndex < left) {
            return;
        }
        if (heapType == "MAX") {
            if (lastUsedIndex == left) {
                if (heap[index] < heap[left]) {
                    int temp = heap[left];
                    heap[left] = heap[index];
                    heap[index] = temp;
                }
                return;
            } else {
                if (heap[left] > heap[right])
                    swapChild = left;
                else
                    swapChild = right;
                if (heap[index] < heap[swapChild]) {
                    int temp = heap[swapChild];
                    heap[swapChild] = heap[index];
                    heap[index] = temp;
                }
            }
        } else if (heapType == "MIN") {
            if (lastUsedIndex == left) {
                if (heap[index] > heap[left]) {
                    int temp = heap[left];
                    heap[left] = heap[index];
                    heap[index] = temp;
                }
                return;
            } else {
                if (heap[left] < heap[right])
                    swapChild = left;
                else
                    swapChild = right;
                if (heap[index] > heap[swapChild]) {
                    int temp = heap[swapChild];
                    heap[swapChild] = heap[index];
                    heap[index] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    private int getRootOfBinaryHeap(String heapType) {
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return -1;
        } else {
            int item = heap[1];
            heap[1] = heap[lastUsedIndex];
            lastUsedIndex--;
            heapifyTopToBottom(1, heapType);
            return item;
        }
    }

    public int getRootOfBinaryMinHeap() {
        return getRootOfBinaryHeap("MIN");
    }

    public int getRootOfBinaryMaxHeap() {
        return getRootOfBinaryHeap("MAX");
    }
}