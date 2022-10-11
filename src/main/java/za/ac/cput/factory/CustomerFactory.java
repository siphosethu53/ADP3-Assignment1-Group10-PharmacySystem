package factory;
import domain.Customer;
import domain.Name;
import java.util.UUID;
/*CustomerFactory.java
 * Factory for the Customer
 * Thabiso Matsaba 220296006
 * 10 August 202222
 */
public class CustomerFactory {

    public static Customer build(String customerId, Name name){

        String  generateId = UUID.randomUUID().toString();

        return new  Customer.Builder().customerId(generateId).name(name).build();
    }
}
