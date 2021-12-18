import java.util.Scanner;
import java.lang.Math;

public class Equations implements Runnable {
    
    static double g = 9.81;
    static Scanner scan = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Function ran");
    }

    public static double p(String prompt) {
        System.out.print("Enter " + prompt + "\n>>> ");
        return scan.nextDouble();
    }

    public static void d(String variable, double value) {
        System.out.println(variable + " = " + round(value));
    }

    public static double round(double value) {
        return (int)(value*100)/100.0;
    }

    public static void pmx1x() {
        double Vix = p("Vix");
        double t = p("t");

        double r = Vix*t;
        d("Δx", r);
    }

    public static void pmx1Vix() {
        double x = p("Δx");
        double t = p("t");

        double r = x/t;
        d("Vix", r);
    }

    public static void pmx1t() {
        double x = p("Δx");
        double Vix = p("Vix");

        double r = x/Vix;
        d("t", r);
    }

    public static void pmy1Vfy() {
        double Viy = p("Viy");
        double t = p("t");

        double r = Viy + g*t;
        d("Vfy", r);
    }

    public static void pmy1Viy() {
        double Vfy = p("Vfy");
        double t = p("t");

        double r = Vfy/(g*t);
        d("Viy", r);
    }

    public static void pmy1t() {
        double Vfy = p("Vfy");
        double Viy = p("Viy");

        double r = (Vfy - Viy)/g;
        d("t", r);
    }

    public static void pmy2y() {
        double Vfi = p("Vfi");
        double t = p("t");

        double r = Vfi*t + 0.5*g*(t*t);
        d("Δy", r);
    }

    public static void pmy2Viy() {
        double y = p("Δy");
        double t = p("t");

        double r = y/(0.5*g*(t*t));
        d("Viy", r);
    }

    public static void pmy2t() {
        double y = p("Δy");
        double Viy = p("Viy");

        double a = 0.5*g;
        double b = Viy;
        double c = -y;
        double r = -b - Math.sqrt(b*b - 4 *a*c)/(2*a);
        d("t", r);
    }

    public static void pmy3Vfy() {
        double Viy = p("Viy");
        double y = p("Δy");

        double r = Math.sqrt(Viy*Viy + 2*g*y);
        d("Vfy", r);
    }

    public static void pmy3Viy() {
        double Vfy = p("Vfy");
        double y = p("Δy");

        double r = Math.sqrt(Vfy*Vfy - 2*g*y);
        d("Vi", r);
    }

    public static void pmy3y() {
        double Vfy = p("Vfy");
        double Viy = p("Viy");

        double r = (Vfy*Vfy - Viy*Viy)/(2*g);
        d("Δy", r);
    }
}