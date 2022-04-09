package Repository;

/**iContactTypeRepository.java
 * Interface for ContactTypeRepository
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import Entity.ContactType;
import java.util.Set;

public interface iContactTypeRepository extends IRepository<ContactType, String> {
    public Set<ContactType> getAll();
}
