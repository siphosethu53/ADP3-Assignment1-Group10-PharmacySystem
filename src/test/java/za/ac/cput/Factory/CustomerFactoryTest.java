/* CustomerFactoryTest.java
 Test class for the Customer Factory class
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package za.ac.cput.Factory;

import za.ac.cput.Entity.Customer;
import org.junit.jupiter.api.Test;
import za.ac.cput.Factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    public void test(){
        Customer customer = CustomerFactory.createCustomer(1,1,"Zaeem","Male", "0789456123");
        assertNotNull(customer);
    }

}