package za.ac.cput.Repository;

/** EmployeeContactRepositoryTest.java
 * Test for the EmployeeContactRepository
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import za.ac.cput.Entity.EmployeeContact;
import za.ac.cput.Factory.EmployeeContactFactory;
import za.ac.cput.Repository.EmployeeContactRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeeContactRepositoryTest {
        private static EmployeeContactRepository repository = EmployeeContactRepository.getRepository();
        private static EmployeeContact employeeContact = EmployeeContactFactory.createEmployeeContact("2", "0654512346", "Phone number");

    @Test
    void A_create() {
        EmployeeContact created = repository.create(employeeContact);
        assertEquals(employeeContact.getEmployeeContactId(), created.getEmployeeContactId());
        System.out.println("Created: " + created);
    }

    @Test
    void B_read() {
        EmployeeContact read = repository.read(employeeContact.getEmployeeContactId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void C_update() {
        EmployeeContact updated = new EmployeeContact.Builder().copy(employeeContact).typeId("A")
                .employeeContactId("021445678")
                .conDescription("Telephone number")
                .build();
        EmployeeContact employeeContact = repository.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    void D_delete() {
        boolean success = repository.delete(employeeContact.getEmployeeContactId());
        assertTrue(success);
        System.out.println("Deleted: " + true);
    }

    @Test
    void E_getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}
