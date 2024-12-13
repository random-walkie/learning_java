package ch04.examples;

public class Euclid {
    public static int euclid(int a, int b) {
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 2701;
        int b = 222;
        System.out.println("The GCD of " + a + " and " + b + " is " + euclid(a, b));
    }
}
