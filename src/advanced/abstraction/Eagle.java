package advanced.abstraction;

public class Eagle extends Animal {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("inside Eagle eat()");
    }
}
