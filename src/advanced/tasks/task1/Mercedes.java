package advanced.tasks.task1;

public class Mercedes extends Car {
    public Mercedes(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes started engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Mercedes is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes is braking");
    }
}
