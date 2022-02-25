import java.util.Scanner;
import java.lang.Math;

public class TDArray {
    
    private int n;
    private int m;
    private int random;
    private int[][] array;
    private int[] rowSums;
    private int[] colSums;

    public TDArray(int n, int m, int random) {
        this.n = n;
        this.m = m;
        this.random = random;
        this.populate();
    }

    private void populate() {
        if  (this.n == -1) {
            this.n = random(1, 10);
            this.m = random(1, 10);
        }

        this.array = new int[this.n][this.m];

        if (this.random == 1) {
            this.manuallySet();
        }

        else {
            this.randomlySet();
        }

        this.calculateSums();
    }

    private void randomlySet() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                int val = random(0, 10);
                this.array[i][j] = val;
            }
        }
    }

    private void manuallySet() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.print("Set ("+i+", "+j+"): ");
                this.array[i][j] = scan.nextInt();
            }
        }
        scan.close();
    }

    private void calculateSums() {
        rowSums = new int[n];
        colSums = new int[m];
        
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                rowSums[i] += this.array[i][j];
                colSums[j] += this.array[i][j];
            }
        }
    }

    public void transpose() {
        int temp = this.n;
        this.n = this.m;
        this.m = temp;

        int[][] newArray = new int[this.n][this.m];
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                newArray[i][j] = this.array[j][i];
            }
        }

        this.array = newArray;
        this.calculateSums();
    }

    private int random(int a, int b) {
        return a + (int)(Math.random() * ((b - a) + 1));
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.n; i++) {
            String row = "";
            for (int j = 0; j < this.m; j++) {
                row += this.leftAlign(String.valueOf(this.array[i][j]));
            }

            str += row + " = "+this.rowSums[i]+"\n";
        }

        String equalRow = "";
        String sumRow = "";
        for (int sum : this.colSums) {
            equalRow += this.leftAlign("=");
            sumRow += this.leftAlign(String.valueOf(sum));
        }
        str += equalRow + "\n";
        str += sumRow;
        return str;
    }

    private String leftAlign(String val) {
        int alignBy = this.determineAlignBy();

        int dif = alignBy - val.length();
        for (int i = 0; i < dif; i++) {
            val += " ";
        }

        return val;
    }

    private int determineAlignBy() {
        int longest = 0;
        for (int[] row : this.array) {
            for (int val : row) {
                int len = String.valueOf(val).length();
                longest = Math.max(len, longest);
            }
        }

        for (int val : rowSums) {
            int len = String.valueOf(val).length();
            longest = Math.max(len, longest);
        }
        
        for (int val : colSums) {
            int len = String.valueOf(val).length();
            longest = Math.max(len, longest);
        }

        return longest + 1;
    }
}
