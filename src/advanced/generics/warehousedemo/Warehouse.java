package advanced.generics.warehousedemo;

import java.util.ArrayList;

public class Warehouse<T extends Product> {
        ArrayList<T> stock = new ArrayList<T>();

        public ArrayList<T> addToStock(T product, int quantity) {
            if (!stock.contains(product)) {
                product.setQuantity(quantity);
                stock.add(product);
                System.out.println(product.getName() + " added to stock. Now we have " + product.getQuantity());
            }
            else if (stock.contains(product)){
                product.setQuantity(product.getQuantity()+ quantity);
                System.out.println("Added " + quantity + " of " + product.getName() + ". Now we have " + product.getQuantity());
            }
            return stock;
        }

        public ArrayList<T> removeFromStock(T product, int quantity) {
            if (product.getQuantity() > quantity){
                int resQunt = product.getQuantity() - quantity;
                product.setQuantity(resQunt);
                System.out.println("Removed " + quantity + " of " + product.getName() + ". Now we have " + product.getQuantity());
            }
            else if (product.getQuantity() == quantity){
                stock.remove(product);
                System.out.println(product.getName() + " removed from stock");
            }
            else if (product.getQuantity() < quantity){
                System.out.println("Now we have only " + product.getQuantity() + " please insert right quantity");
            }

            return stock;
    }

        public void getStockList() {
            System.out.println("Retrieve the name of each product:");
            for(T product : stock) {
                System.out.println(product.getName());
            }
        }

        public void getStockRemaining() {
            System.out.println("Remaining quantity for each product in stock ");
            for(T product : stock) {
            System.out.println(product.getName() + " " + product.getQuantity());
        }
    }
}
