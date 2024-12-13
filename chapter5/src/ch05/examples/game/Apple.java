package ch05.examples.game;

class Apple {
    private float mass;
    private float diameter = 1.0f;
    private int x, y;
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

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

    public static String[] getAppleSizes() {
        // Return names for our constants
        return new String[] { "SMALL", "MEDIUM", "LARGE" };
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
        String[] niceNames = getAppleSizes();
        if (diameter < 5.0f) {
            System.out.println("This is a " + niceNames[SMALL] + " apple.");
        } else if (diameter < 10.0f) {
            System.out.println("This is a " + niceNames[MEDIUM] + " apple.");
        } else {
            System.out.println("This is a " + niceNames[LARGE] + " apple.");
        }
    }
}
