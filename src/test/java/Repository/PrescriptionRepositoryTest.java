/* PrescriptionRepositoryTest.java
 Test class for the Prescription Repository class
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package Repository;

import Entity.Prescription;
import Factory.PrescriptionFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class PrescriptionRepositoryTest {
    private static PrescriptionRepository repository = PrescriptionRepository.getRepository();

    private static Prescription prescription = PrescriptionFactory.createPrescription(1,1,"Pre-compounding prescription", 5);

    @Test
    void a_create() {
        Prescription generate = repository.create(prescription);
        assertNotNull(generate);
        System.out.println("Created: " + generate);
    }

    @Test
    void b_read() {
        Prescription view = repository.read(prescription.getPrescID());
        assertNotNull(view);
        System.out.println("Read: " + view);
    }

    @Test
    void c_update() {
        Prescription change = new Prescription.Builder().copy(prescription).setPrescID(1).setCustomerID(2).setPrescType("post compounded prescrip").setPrescDoses(5)
                .build();
        assertNotNull(change);
        System.out.println("updated to " + change);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(prescription.getPrescID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}