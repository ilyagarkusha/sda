package advanced.tasks.task1;

public class Toyota extends Car {
    public Toyota(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Toyota is braking");
    }
}
