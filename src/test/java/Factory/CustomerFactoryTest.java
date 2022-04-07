package Factory;

import Entity.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    public void test(){
        Customer customer = CustomerFactory.createCustomer(1,1,"Zaeem","Male", "0789456123");
        assertNotNull(customer);
    }

}