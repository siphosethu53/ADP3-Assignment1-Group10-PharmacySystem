package Test;

import Entity.Supplier;
import Factory.SupplierFactory;
import Repository.SupplierRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class SupplierRepositoryTest {
    private static SupplierRepository repository = SupplierRepository.getRepository();
    private static Supplier supplier = SupplierFactory.createSupplier("BetaPharm","2 Pepper Street","0216543214","BetaPharm@gmail.com");

    @Test
    void a_create() {
        Supplier created = repository.create(supplier);
        assertEquals(supplier.getSuppId() , created.getSuppId());
        System.out.print("Created : " + supplier);
    }

    @Test
    void b_read() {
        Supplier scan = repository.read(supplier.getSuppId());
        assertNotNull(scan);
        System.out.print("Read : " + scan );
    }

    @Test
    void d_update() {
        Supplier updated = new Supplier.Builder()
                .copy(supplier)
                .suppName("DeltePharm")
                .suppAddress("7 Arrow Road")
                .suppContact("0216334547")
                .suppEmail("DeltaPharm@gmail.com")
                .build();
        assertNotNull(repository.update(updated));
        System.out.print("Updated : " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(supplier.getSuppId());
        assertTrue(success);
        System.out.println("Deleted : " + success);
    }

    @Test
    void c_getAll() {
        System.out.println("Show All : ");
        System.out.println(repository.getAll());
    }
}