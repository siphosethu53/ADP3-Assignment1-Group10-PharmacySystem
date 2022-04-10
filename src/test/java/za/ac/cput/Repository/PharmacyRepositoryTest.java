package za.ac.cput.Repository;

/* PharmacyRepositoryTest.java
   Test for the PharmacyRepositoryTest
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Pharmacy;
import za.ac.cput.Factory.PharmacyFactory;
import za.ac.cput.Repository.PharmacyRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class PharmacyRepositoryTest {
    private static PharmacyRepository repository = PharmacyRepository.getRepository();
    private static Pharmacy pharmacy = PharmacyFactory.createPharmacy
            (1, "Nawaaz Bai", "Rockyway", "0794236652", 1);


    @Test
    void a_create() {
        Pharmacy created = repository.create(pharmacy);
        assertEquals(pharmacy.getPharmID(), created.getPharmID());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Pharmacy read = repository.read(pharmacy.getPharmID());
        assertNotNull(read);
        System.out.println("read:" + read);
    }

    @Test
    void c_update() {
        Pharmacy updated = new Pharmacy.Builder().copy(pharmacy).setPharmName("Chad")
                .setPharmContact("0743126352")
                .setInventoryID(2)
                .setCashierID(2)
                .setPharmAddress("RockyRoad")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(pharmacy.getPharmID());
        assertTrue(success);
        System.out.println("Deleted:" + true);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}
