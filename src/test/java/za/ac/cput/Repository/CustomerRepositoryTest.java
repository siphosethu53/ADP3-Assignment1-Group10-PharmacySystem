/* CustomerRepositoryTest.java
 Test class for the Customer Repository class
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Customer;
import za.ac.cput.Factory.CustomerFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Repository.CustomerRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class CustomerRepositoryTest {
    private static CustomerRepository repository = CustomerRepository.getRepository();

    private static Customer customer = CustomerFactory.createCustomer(1,1,"Zaeem","Male","0154648754");
    @Test
    void a_create() {
        Customer generate = repository.create(customer);
        assertNotNull(generate);
        System.out.println("Created: " + generate);
    }

    @Test
    void b_read() {
        Customer view = repository.read(customer.getCustomerID());
        assertNotNull(view);
        System.out.println("Read: " + view );
    }

    @Test
    void c_update() {
        Customer change = new Customer.Builder().copy(customer).setCustomerID(1).setCusName("Waseem").setCusGender("Male").setContactNumber("7894561230")
                .build();
        assertNotNull(change);
        System.out.println("Updated to: " + change);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(customer.getCustomerID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}