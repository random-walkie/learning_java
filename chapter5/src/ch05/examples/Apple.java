package ch05.examples;

class Apple {
    private float mass;
    private float diameter = 1.0f;
    private int x, y;

    public boolean isTouching(Apple other) {
        double xdiff = x - other.x;
        double ydiff = y - other.y;
        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return distance < diameter / 2 + other.diameter / 2;
        //equivalent to lengthier:
        // if (distance < diameter / 2 + other.diameter / 2) {
        //            return true;
        //        } else {
        //            return false;
        //        }
    }

    // setter and getter methods for mass
    public void setMass(float newMass) {
        mass = newMass;
    }

    public float getMass() {
        return mass;
    }

    // set and getter methods for diameter
    public void setDiameter(float newDiameter) {
        diameter = newDiameter;
    }

    public float getDiameter() {
        return diameter;
    }

    // set and getter methods for x
    public void setX(int newX) {
        x = newX;
    }
    public int getX() {
        return x;
    }

    // set and getter methods for y
    public void setY(int newY) {
        y = newY;
    }

    public int getY() {
        return y;
    }

    // other apple-related variables and methods
    public void printDetails() {
        System.out.println("  mass: " + mass);
        System.out.println("  diameter: " + diameter);
        System.out.println("  position: (" + x + ", " + y +")");
    }
}
