package advanced.oop;

public class SomeDog extends Animal{
    public SomeDog(String name) {
        super(name);
    }

    @Override
    public void yieldVoice() {
        System.out.println("Wof - wof");
    }
}
