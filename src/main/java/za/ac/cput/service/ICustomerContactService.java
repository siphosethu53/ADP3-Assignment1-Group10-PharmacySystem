/**
 * Author: Siphosethu Feni
 * Student Number: 217237614
 *  * Project Group: 10
 * ICustomerContactService.java
 */

package za.ac.cput.service;

import za.ac.cput.domain.CustomerContact;

import java.util.List;

public interface ICustomerContactService extends IService<CustomerContact, Long> {
    List <CustomerContact> getAll();
}
