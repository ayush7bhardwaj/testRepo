package practicejava;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i<array.length - 1; i++) {
            for (int j = 0; j<array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void display(int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] array = {15,26,5,1,3};
        bubbleSort(array);
        display(array);
    }
}
