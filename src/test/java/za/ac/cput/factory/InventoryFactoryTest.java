package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Inventory;

import static org.junit.jupiter.api.Assertions.*;

class InventoryFactoryTest {

    @Test
    void createInventory() {
        Inventory inventory = InventoryFactory.createInventory(25, 66);
        assertNotNull(inventory);
        assertEquals(66, inventory.getMedicineStockAmount());
        System.out.println(inventory);
    }
}