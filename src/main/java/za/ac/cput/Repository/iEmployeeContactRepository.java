package za.ac.cput.Repository;

/**iEmployeeContactRepository.java
 * Interface for EmployeeContactRepository
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import za.ac.cput.Entity.EmployeeContact;
import java.util.Set;

public interface iEmployeeContactRepository extends IRepository<EmployeeContact, Integer> {
    public Set<EmployeeContact> getAll();
}
