package walmart;

import java.util.*;

public class InventoryManager {
    private List<Product> inventory = new ArrayList<>();

    public void addProduct(Product p) {
        inventory.add(p);
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public double calculateProfitMargin(Product p) {
        return ((p.getSellingPrice() - p.getCostPrice()) / p.getCostPrice()) * 100;
    }

    public List<Product> getTopSellingProducts() {
        inventory.sort((a, b) -> b.getUnitsSold() - a.getUnitsSold());
        return inventory.subList(0, Math.min(5, inventory.size()));
    }
}