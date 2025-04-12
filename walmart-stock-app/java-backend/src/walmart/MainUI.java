package walmart;

import javax.swing.*;
import java.awt.*;

public class MainUI {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        manager.addProduct(new Product("TV", 300, 500, 120));
        manager.addProduct(new Product("Laptop", 700, 1200, 80));

        JFrame frame = new JFrame("Walmart Inventory Dashboard");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea area = new JTextArea();
        for (Product p : manager.getInventory()) {
            area.append(p.getName() + " - Margin: " + String.format("%.2f", manager.calculateProfitMargin(p)) + "%\n");
        }

        frame.add(area);
        frame.setVisible(true);
    }
}