package advanced.tasks.task1;

public class Car {
    private int numberOfCylinders;
    private boolean engineTypeIsGas;
    private int numberOfWheels;
    private String name;

    public Car(int numberOfCylinders, String name) {
        this.numberOfCylinders = numberOfCylinders;
        this.name = name;
        this.numberOfWheels = 4;
        this.engineTypeIsGas = true;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public boolean isEngineTypeIsGas() {
        return engineTypeIsGas;
    }

    public void setEngineTypeIsGas(boolean engineTypeIsGas) {
        this.engineTypeIsGas = engineTypeIsGas;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }
}
