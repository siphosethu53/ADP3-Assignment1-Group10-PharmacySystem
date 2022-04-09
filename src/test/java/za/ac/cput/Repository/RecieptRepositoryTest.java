package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Reciept;
import za.ac.cput.Factory.RecieptFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
/* RecieptRepositoryTest.java
 * Repository Test for the Reciept
 * Thabiso Matsaba 220296006
 * 08 April 2022
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
class RecieptRepositoryTest {
    private static RecieptRepository repository = RecieptRepository.getRepository();
    private static Reciept reciept = RecieptFactory.createReciept("1234", "1234", new Date()) ;

    @Test
    void a_create() {
        Reciept created = repository.create(reciept);
        assertEquals(reciept.getRecieptID(), created.getRecieptID());
        System.out.println("Created: " + reciept);
    }

    @Test
    void b_read() {
        Reciept scan = repository.read(reciept.getRecieptID());
        assertNotNull(scan);
        System.out.println("Read: " + scan);

    }

    @Test
    void c_update() {
        Reciept updated = new Reciept.Builder().copy(reciept)
                                     .setRecieptID("1267")
                                     .setPrescriptionID("5443")
                                     .setRecieptDate(new Date())
                                     .build();
        assertNotNull(repository.update(updated));
        System.out.println("Upadted: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(reciept.getRecieptID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Reciepts: ");
        System.out.println(repository.getAll());
    }
}