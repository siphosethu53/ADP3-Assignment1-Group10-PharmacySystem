package za.ac.cput.service;
/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  * Project Group: 10
 * CustomerContactServiceImpl.java
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.CustomerContact;
import za.ac.cput.repository.ICustomerContactRepository;

import java.util.List;

@Service
public class CustomerContactServiceImpl implements ICustomerContactService{
    private final ICustomerContactRepository repository;
    @Autowired
    public CustomerContactServiceImpl(ICustomerContactRepository repository){
        this.repository = repository;
    }

    @Override
    public CustomerContact save(CustomerContact customerContact) {
        return repository.save(customerContact);
    }

    @Override
    public CustomerContact read(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public boolean delete(Long aLong) {
        if (this.repository.existsById(aLong)) {
            this.repository.deleteById(aLong);
            return true;
        }
        return false;
    }



    @Override
    public List<CustomerContact> getAll() {
        return this.repository.findAll();
    }



}
