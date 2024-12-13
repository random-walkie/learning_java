package ch05.examples.game;

public class PrintAppleDetails2 {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        System.out.println("Apple a1:");
        System.out.println("  mass: " + a1.getMass());
        System.out.println("  diameter: " + a1.getDiameter());
        System.out.println("  position: (" + a1.getX() + ", " + a1.getY() +")");
        // fill in some information on a1
        a1.setMass(10.0f);
        a1.setX(20);
        a1.setY(42);
        System.out.println("Updated a1:");
        System.out.println("  mass: " + a1.getMass());
        System.out.println("  diameter: " + a1.getDiameter());
        System.out.println("  position: (" + a1.getX() + ", " + a1.getY() +")");
    }

}
