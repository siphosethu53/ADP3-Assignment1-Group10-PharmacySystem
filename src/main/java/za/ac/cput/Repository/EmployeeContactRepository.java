package za.ac.cput.Repository;

/** EmployeeContactRepository.java
 * Repository for the EmployeeContact
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import za.ac.cput.Entity.EmployeeContact;
import java.util.HashSet;
import java.util.Set;


public class EmployeeContactRepository {
    private static  EmployeeContactRepository repository = null;
    private Set<EmployeeContact> employeeContactDB = null;

    //Make it private so that the method cannot b access from external classes
    private EmployeeContactRepository() {
        employeeContactDB = new HashSet<EmployeeContact>();
    }

    public static EmployeeContactRepository getRepository() {
        if (repository == null) {
            repository = new EmployeeContactRepository();
        }
        return repository;
    }

    public EmployeeContact create(EmployeeContact employeeContact) {
        boolean success = employeeContactDB.add(employeeContact);
        if (!success)
            return null;
        return employeeContact;
    }

    public EmployeeContact read(String employeeContactId) {
        // reading employeeContact object
        EmployeeContact employeeContact = employeeContactDB.stream()
                .filter(e -> e.getEmployeeContactId().equals(employeeContactId))
                .findAny()
                .orElse(null);
        return employeeContact;
    }

    public EmployeeContact update(EmployeeContact employeeContact) {
        EmployeeContact oldEmployeeContact = read(employeeContact.getEmployeeContactId());
        if (oldEmployeeContact != null) {
            employeeContactDB.remove(oldEmployeeContact);
            employeeContactDB.add(employeeContact);
            return employeeContact;
        }
        return null;
    }

    public boolean delete(String employeeContactId) {
        EmployeeContact employeeContactToDelete = read(employeeContactId);
        if (employeeContactToDelete == null)
            return false;
        employeeContactDB.remove(employeeContactToDelete);
        return true;
    }

    public Set<EmployeeContact> getAll() {
        return employeeContactDB;
    }
}
