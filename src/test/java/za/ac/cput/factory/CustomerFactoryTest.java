package factory;
import domain.Customer;
import domain.Name;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {
    Name name = NameFactory.build("Thabiso","Patrick", "Matsaba") ;

    @Test
    public void testCustomerWithSuccess() {
        Customer customer = CustomerFactory.build("CUS101", name);
        System.out.println(customer);
        assertNotNull(customer);
    }

    @Test
    public void testCustomerWithNullId(){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> CustomerFactory.build("", name));
        String exceptionMessage = exception.getMessage();
        System.out.println(exceptionMessage);
        assertSame("Customer is null", exceptionMessage);
    }
}