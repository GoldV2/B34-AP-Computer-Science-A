import java.util.ArrayList;

public class SpecialArray {
    
    int[] array;
    int len;
    boolean isAscending = true;
    boolean isDescending = true;
    double average;
    int min;
    int max;
    ArrayList<Integer> localMins;
    ArrayList<Integer> localMaxs;

    public SpecialArray(int[] array) {
        this.array = array;
        this.len = this.array.length;
        this.determineOrder();
        this.calculateAverage();
        this.determineMinMax();
        this.determineLocalMinMax();
    }

    private void determineOrder() {
        boolean firstChecked = false;
        int lastChecked = 0;
        for (int value : this.array) {
            if (!firstChecked) {
                firstChecked = true; 
                lastChecked = value;
                continue;
            }
             
            if (value < lastChecked) {
                this.isAscending = false;
            }
            else if (value > lastChecked) {
                this.isDescending = false;
            }
         }
    }

    private void calculateAverage() {
        int sum = 0;
        for (int value : this.array) {
            sum += value;
        }

        this.average = sum/this.len;
    }

    private void determineMinMax() {
        boolean firstChecked = false;
        int currentMax = -10000000;
        int currentMin = 10000000;
        for (int value : this.array) {
            if (!firstChecked) {
                firstChecked = true;

                currentMax = value;
                currentMin = value;
                continue;
            }
            
            if (value > currentMax) {
                currentMax = value;
            }
            else if (value < currentMin) {
                currentMin = value;
            }
        }

        this.max = currentMax;
        this.min = currentMin;
    }

    private void determineLocalMinMax() {
        ArrayList<Integer> localMins = new ArrayList<Integer>();
        ArrayList<Integer> localMaxs = new ArrayList<Integer>();

        if (this.array[0] < this.array[1]) {
            localMins.add(this.array[0]);
        }
        else if (this.array[0] > this.array[1]) {
            localMaxs.add(this.array[0]);
        }

        for (int i=1; i < this.len -1; i++) {
            if (this.array[i] < this.array[i-1] && this.array[i] < this.array[i+1]) {
                localMins.add(i);
            }
            else if (this.array[i] > this.array[i-1] && this.array[i] > this.array[i+1]) {
                localMaxs.add(i);
            }
        }

        if (this.array[this.len-1] < this.array[this.len-2]) {
            localMins.add(this.array[this.len-1]);
        }
        else if (this.array[this.len-1] > this.array[this.len-2]) {
            localMaxs.add(this.array[this.len-1]);
        }

        this.localMins = localMins;
        this.localMaxs = localMaxs;

    }

    public String toString() {
        System.out.print("Array: ");
        for (int value : this.array) {
            System.out.print(value + ", ");
        }
        System.out.println();
        System.out.println("Length: " + this.len);
        System.out.println("Is ascending: " + this.isAscending);
        System.out.println("Is descending: " + this.isDescending);
        System.out.println("Average: " + this.average);
        System.out.println("Max: " + this.max);
        System.out.println("Min: " + this.min);
        System.out.println("Local minima: " + this.localMins);
        System.out.println("Local maxima: " + this.localMaxs);
        return "";
    }

}
