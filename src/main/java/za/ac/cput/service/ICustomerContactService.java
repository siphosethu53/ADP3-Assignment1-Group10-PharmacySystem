/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  *  Group: 10
 * ICustomerContactService.java
 */

package za.ac.cput.service;
import java.util.List;
import za.ac.cput.domain.CustomerContact;

public interface ICustomerContactService extends IService<CustomerContact, Long> {
    List <CustomerContact> getAll();
}
