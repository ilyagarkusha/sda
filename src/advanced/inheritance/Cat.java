package advanced.inheritance;

import advanced.abstraction.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("inside Cat eat()");
    }
}
