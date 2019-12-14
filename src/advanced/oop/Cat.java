package advanced.oop;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void yieldVoice(){
        System.out.println("Meow");
    }
}
