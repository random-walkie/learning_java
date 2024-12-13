package ch05.examples;

public class PrintAppleDetails {
        public static void main(String[] args) {
            String niceNames[] = Apple.getAppleSizes();
            Apple a1 = new Apple();
            System.out.println("Apple a1:");
            System.out.println("  mass: " + a1.getMass());
            System.out.println("  diameter: " + a1.getDiameter());
            System.out.println("  position: (" + a1.getX() + ", " + a1.getY() +")");
            if (a1.getDiameter() < 5.0f) {
                System.out.println("This is a " + niceNames[Apple.SMALL] + " apple.");
            } else if (a1.getDiameter() < 10.0f) {
                System.out.println("This is a " + niceNames[Apple.MEDIUM] + " apple.");
            } else {
                System.out.println("This is a " + niceNames[Apple.LARGE] + " apple.");
            }
    }
}
