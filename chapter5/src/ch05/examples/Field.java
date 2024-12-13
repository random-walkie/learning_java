package ch05.examples;

public class Field {
    Apple a1 = new Apple();
    Apple a2 = new Apple();

    public void setupApples() {
        a1.setDiameter(3.0f);
        a1.setMass(5.0f);
        a1.setX(20);
        a1.setY(40);
        a2.setDiameter(8.0f);
        a2.setMass(10.0f);
        a2.setX(15);
        a2.setY(40);
    }

    public void detectCollisions() {
        if (a1.isTouching(a2)) {
            System.out.println("Collision detected!");
        } else {
            System.out.println("Apples are not touching.");
        }
    }
}
