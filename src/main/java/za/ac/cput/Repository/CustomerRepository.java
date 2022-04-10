/* CustomerRepository.java
 Customer Repository class
 Author: Zaeem Petersen (219010145)
 Date: 07 April 2022
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository {

    private static CustomerRepository repository = null;
    private Set<Customer> customerData = null;

    private CustomerRepository(){
        customerData = new HashSet<Customer>();
    }

    //singleton
    public static CustomerRepository getRepository(){
        if(repository == null){
            repository = new CustomerRepository();
        }
        return repository;
    }


    @Override
    public Customer create(Customer customer) {
        boolean success = customerData.add(customer);

        if(!success){
            return null;
        }
        else
        return customer;
    }

    @Override
    public Customer read(Integer customerId) {

        for(Customer cus : customerData) {
            if (cus.getCustomerID() == customerId)
                return cus;
        }
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getCustomerID());
        if (oldCustomer !=null){

            customerData.remove(oldCustomer);
            customerData.add(customer);
            return customer;
        }
        else
        return null;
    }

    @Override
    public boolean delete(Integer customerId) {
        Customer customerDelete = read(customerId);
        if(customerDelete == null){
            return false;
        }
        else
        customerData.remove(customerDelete);
        return true;
    }

    @Override
    public Set<Customer> getAll() {
        return customerData;
    }

}
