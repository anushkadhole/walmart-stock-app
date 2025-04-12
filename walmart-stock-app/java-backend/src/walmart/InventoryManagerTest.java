package walmart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {
    @Test
    public void testProfitMarginCalculation() {
        Product p = new Product("TV", 100, 200, 50);
        InventoryManager manager = new InventoryManager();
        double margin = manager.calculateProfitMargin(p);
        assertEquals(100.0, margin, 0.1);
    }
}