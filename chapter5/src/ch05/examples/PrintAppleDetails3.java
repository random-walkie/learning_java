package ch05.examples;

public class PrintAppleDetails3 {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        System.out.println("Apple a1:");

        // We can use our new method!
        a1.printDetails();

        // fill in some information on a1
        a1.setMass(10.0f);
        a1.setX(20);
        a1.setY(42);
        System.out.println("Updated a1:");
        // And look! We can easily reuse the same method
        a1.printDetails();
    }
}
