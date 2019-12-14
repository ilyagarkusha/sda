package advanced.generics.warehousedemo;

public abstract class Product {
    private String name;
    private int quantity;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
