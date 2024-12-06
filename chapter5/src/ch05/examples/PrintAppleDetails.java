package ch05.examples;

public class PrintAppleDetails {
        public static void main(String[] args) {
            Apple a1 = new Apple();
            System.out.println("Apple a1:");
            System.out.println("  mass: " + a1.getMass());
            System.out.println("  diameter: " + a1.getDiameter());
            System.out.println("  position: (" + a1.getX() + ", " + a1.getY() +")");
    }
}
