package advanced.tasks.task1;

public class Customer {
    private String name;
    private  String carModel;

    public Customer(String name, Car car) {
        this.name = name;
        this.carModel = car.getName();
    }

    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }
}
