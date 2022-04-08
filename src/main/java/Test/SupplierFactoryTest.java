package Test;

import Entity.Supplier;
import Factory.SupplierFactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SupplierFactoryTest {

    @Test
   public void test() {
        Supplier supplier = SupplierFactory.createSupplier("AlphaPharm","2 Sheldon Road","0213664747","alphapharm@gmail.com");
        assertNotNull(supplier);
        System.out.print(supplier.toString());
    }
}