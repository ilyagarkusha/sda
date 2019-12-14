package advanced.collections;

public class Friend {
    private String name = "Mike";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "friend " + name;
    }
}
