package advanced.inheritance;

public class Car extends Vehicle {
    private double maxSpeed = 2.2;


    public int getParentsHiddenField() {
        return   super.maxSpeed;
    }
}
