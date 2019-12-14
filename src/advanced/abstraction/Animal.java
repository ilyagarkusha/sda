package advanced.abstraction;

public abstract class Animal {
    private String name;

    public void eat(){
        System.out.println("inside Animal eat()");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
