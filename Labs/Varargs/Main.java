public class Main {
    public static void main(String[] args) {
        System.out.println("With varargs:");
        System.out.println(varArg(1.3, 2.3, 3.3, 4.3, 5.3, 6.3, 7.3, 8.3));

        System.out.println("With single args:");
        double[] a = {1.3, 2.3, 3.3, 4.3, 5.3, 6.3, 7.3, 8.3};
        System.out.println(singleArg(a));
    }

    public static double varArg(double... a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total/a.length;
    }

    public static double singleArg(double[] a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total/a.length;
    }
}