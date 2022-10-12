package za.ac.cput.factory;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SupplierFactoryTest {

    @Test
    @Order(1)
    void createSupplier() {
        Supplier supplier = SupplierFactory.createSupplier("5","ChemReacts");
        assertNotNull(supplier);
        System.out.println(supplier);
    }
    @Test
    @Order(2)
    void createSupplierError() {
        Supplier supplier = SupplierFactory.createSupplier("","ChemReacts");
        assertNotNull(supplier);
        System.out.println(supplier);
    }
}