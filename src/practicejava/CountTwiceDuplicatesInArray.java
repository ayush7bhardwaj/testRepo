import java.util.HashSet;
import java.util.Set;

public class CountTwiceDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {2,4,5,8,11,4,2,6};
        int[] countArray = new int[array.length];
        Set<Integer> dup = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!dup.contains(array[i])) {
                dup.add(array[i]);
            }

        }
    }
}
