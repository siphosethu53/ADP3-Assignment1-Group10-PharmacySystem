package za.ac.cput.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.repository.CustomerRepository;
import za.ac.cput.service.CustomerService;
import java.util.List;
/* CustomerServiceImpl.java
 * @Author: Thabiso Matsaba (220296006)
 * Date: 11 August 2022
 */
@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {

        Customer validateCustomer;
        validateCustomer = CustomerFactory.build(customer.getCustomerId(), customer.getName());

        return customerRepository.save(validateCustomer);
    }

    @Override
    public Customer read(String s) {

        return customerRepository.findById(s).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        if (customerRepository.existsById(customer.getCustomerId())) {
            return customerRepository.save(customer);
        } else {
            return null;
        }
    }
    @Override
    public boolean delete(String id) {
        if (this.customerRepository.existsById(id)) {
            this.customerRepository.deleteById(id);
            return true;
        }
        return false;

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
       customerRepository.deleteById(id);
    }
}

