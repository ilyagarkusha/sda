package advanced.oop;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void yieldVoice() {
        System.out.println("Voice of animal");
    }
}
