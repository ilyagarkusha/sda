package advanced.collections;

public class Person {
    private String name = "John";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "person " + name;
    }
}
