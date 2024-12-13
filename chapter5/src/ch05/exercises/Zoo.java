package ch05.exercises;

import java.util.ArrayList;

public class Zoo {

    abstract static class Animal {
        public abstract String speak();

        public abstract String getSpecies();
    }

    static class Lion extends Animal {
        public String speak() {
            return "roar";
        }

        @Override
        public String getSpecies() {
            return "lion";
        }
    }

    static class Gibbon extends Animal {
        @Override
        public String getSpecies() {
            return "gibbon";
        }

        public String speak() {
            return "hoot";
        }
    }

    static class Elephant extends Animal {
        public String speak() {
            return "toot";
        }

        @Override
        public String getSpecies() {
            return "elephant";
        }
    }

    public void listen() {
        Lion lion = new Lion();
        Gibbon gibbon = new Gibbon();
        Elephant elephant = new Elephant();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(gibbon);
        animals.add(elephant);
        for (Animal animal : animals) {
            System.out.println("The " + animal.getSpecies() + " goes " + animal.speak());
        }

    }

    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        myZoo.listen();
    }
}

