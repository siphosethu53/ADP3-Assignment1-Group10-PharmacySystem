package Repository;

/**ContactTypeRepository.java
 * Repository for ContactType
 * Author: Daniella Burgess (219446482)
 * Date: 08 April 2022
 */

import Entity.ContactType;
import java.util.HashSet;
import java.util.Set;


public class ContactTypeRepository {

    private static  ContactTypeRepository repository = null;
    private Set<ContactType> contactTypeDB = null;

    //Make it private so that the method cannot b access from external classes
    private ContactTypeRepository() {
        contactTypeDB = new HashSet<ContactType>();
    }

    public static ContactTypeRepository getRepository() {
        if (repository == null) {
            repository = new ContactTypeRepository();
        }
        return repository;
    }

    public ContactType create(ContactType contactType) {
        boolean success = contactTypeDB.add(contactType);
        if (!success)
            return null;
        return contactType;
    }

    public ContactType read(String contactTypeId) {
        // reading employeeContact object
        ContactType contactType = contactTypeDB.stream()
                .filter(e -> e.getContactTypeId().equals(contactTypeId))
                .findAny()
                .orElse(null);
        return contactType;
    }

    public ContactType update(ContactType contactType) {
    ContactType oldContactType = read(contactType.getContactTypeId());
    if (oldContactType != null) {
        contactTypeDB.remove(oldContactType);
        contactTypeDB.add(contactType);
        return contactType;
    }
    return null;
    }

    public boolean delete(String contactTypeId) {
        ContactType contactTypeToDelete = read(contactTypeId);
        if (contactTypeToDelete == null)
            return false;
        contactTypeDB.remove(contactTypeToDelete);
        return true;
    }

    public Set<ContactType> getAll() {
        return contactTypeDB;
    }
}
