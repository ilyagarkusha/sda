package advanced.abstraction;

import advanced.inheritance.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.eat();

        //Shape circle = new Circle(12, "smiling circle");

        Eagle aEagle = new Eagle("Tornado");
        aEagle.eat();

        comannd(cat);
        comannd(aEagle);


    }

    public static void comannd(Animal aAnimal) {
        aAnimal.eat();
    }
}
