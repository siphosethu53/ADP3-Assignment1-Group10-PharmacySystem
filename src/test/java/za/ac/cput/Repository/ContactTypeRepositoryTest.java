package za.ac.cput.Repository;

/**ContactTypeRepositoryTest.java
 * Test for ContactTypeRepository
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import za.ac.cput.Entity.ContactType;
import za.ac.cput.Factory.ContactTypeFactory;
import za.ac.cput.Repository.ContactTypeRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ContactTypeRepositoryTest {
    private static ContactTypeRepository repository = ContactTypeRepository.getRepository();
    private static ContactType contactType = ContactTypeFactory.createContactType("Telephone Number", "Secondary contact");


    @Test
    void A_create() {
        ContactType created = repository.create(contactType);
        assertEquals(contactType.getContactTypeId(), created.getContactTypeId());
        System.out.println("Created: " + created);
    }

    @Test
    void B_read() {
        ContactType read = repository.read(contactType.getContactTypeId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void C_update() {
        ContactType updated = new ContactType.Builder().copy(contactType).contactName("Telephone number")
                .contactDescription("Secondary contact")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void D_delete() {
        boolean success = repository.delete(contactType.getContactTypeId());
        assertTrue(success);
        System.out.println("Deleted: " + true);
    }

    @Test
    void E_getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
        {
        }

    }
}
