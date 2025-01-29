package practicejava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ite {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());


    }
}
