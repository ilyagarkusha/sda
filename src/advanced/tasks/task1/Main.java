package advanced.tasks.task1;

public class Main {
    public static void accelerate(Car car) {
        car.accelerate();
    }

    public static void startEngine(Car car) {
        car.startEngine();
    }

    public static void brake(Car car) {
        car.brake();
    }

    public static void main(String[] args) {
        Car toyota = new Toyota(4, "Toyota");
        Car honda = new Honda(4, "Honda");
        Car mercedes = new Mercedes(8, "Mercedes");

        startEngine(toyota);
        startEngine(honda);
        startEngine(mercedes);
        System.out.println("-------------------------");
        accelerate(toyota);
        accelerate(honda);
        accelerate(mercedes);
        System.out.println("-------------------------");
        brake(toyota);
        brake(honda);
        brake(mercedes);
        System.out.println("-------------------------");

        Customer customerWithToyota = new Customer("Mike", toyota);
        Customer customerWithHonda = new Customer("David", honda);
        Customer customerWithMercedes = new Customer("Sandra", mercedes);

        CarWash carWash = new CarWash();

        carWash.washcar(customerWithToyota);
        carWash.washcar(customerWithHonda);
        carWash.washcar(customerWithMercedes);

    }

}
