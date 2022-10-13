package za.ac.cput.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.repository.CustomerRepository;
import za.ac.cput.service.ICustomerService;
import java.util.List;
import java.util.Optional;
/* CustomerServiceImpl.java
 * @Author: Thabiso Matsaba (220296006)
 * Date: 11 August 2022
 */
@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
}

    @Override
    public Customer create(Customer customer) {
        Customer validateCustomer;
        validateCustomer = CustomerFactory.build(customer.getCustomerId(), customer.getName());
        return customerRepository.save(validateCustomer);
    }

    @Override
    public Optional<Customer> read(String s) {
        return customerRepository.findById(s);
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
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        customerRepository.deleteById(id);
        Optional<Customer> customer = read(id);
        customer.ifPresent(this::delete);
    }
    }


