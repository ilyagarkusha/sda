package advanced.generics.warehousedemo;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Alcohol vodka = new Alcohol("Vodka");
        Furniture chair = new Furniture("Chair");
        Food milk = new Food("Milk");

        warehouse.addToStock(vodka, 100);
        warehouse.addToStock(chair, 5);
        warehouse.addToStock(milk, 200);
        System.out.println("-----------------");

        warehouse.removeFromStock(milk, 50);
        warehouse.removeFromStock(vodka, 10);
        warehouse.removeFromStock(chair, 2);
        warehouse.addToStock(milk,10);
        System.out.println("-----------------");

        warehouse.getStockList();
        System.out.println("-----------------");

        warehouse.getStockRemaining();
    }
}
