package za.ac.cput.service;
import za.ac.cput.domain.Customer;
import java.util.List;
import java.util.Optional;

/* ICustomerService.java
 * @Author: Thabiso Matsaba (220296006)
 * Date: 11 August 2022
 */
public interface ICustomerService extends IService<Customer, String> {

    List<Customer> findAll();

    void deleteById(String id);

}
