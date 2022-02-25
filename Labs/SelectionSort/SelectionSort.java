import java.util.ArrayList;
import java.lang.Math;

public class SelectionSort {
    public static mySort(ArrayList<Integer>) {
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            ints.add((int)(Math.random() * 11));
        }
        System.out.println(ints);

        for (int i = 0; i < ints.size(); i++) {
            Integer smallest = ints.get(i);
            int smallestIndex = i;
            for (int j = i+1; j < ints.size(); j++) {
                if (ints.get(j) < smallest) {
                    smallest = ints.get(j);
                    smallestIndex = j;
                }
            }
            Integer temp = ints.get(i);
            ints.set(i, ints.get(smallestIndex));
            ints.set(smallestIndex, temp);
        }
        System.out.println(ints);
    }
}