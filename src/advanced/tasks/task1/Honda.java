package advanced.tasks.task1;

public class Honda extends Car {
    public Honda(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda start engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Honda is braking");
    }
}
