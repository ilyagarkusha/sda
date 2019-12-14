package advanced.tasks.task1;

public class CarWash {
    private int price;

    private int getPrice(Customer customer) {
        if (customer.getCarModel().equals("Toyota")) return 10;
        else if (customer.getCarModel().equals("Honda")) return 15;
        else if (customer.getCarModel().equals("Mercedes")) return 30;
        else {
            return 20;
        }
    }

    public void washcar(Customer customer) {
        System.out.println("Hello " + customer.getName() + "!" + " Your "
                + customer.getCarModel() + " washing price is "
                + getPrice(customer) + "$");
    }
}
