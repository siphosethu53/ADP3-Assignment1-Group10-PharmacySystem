package Factory;

import Entity.ContactType;
import Util.DaniellaHelper;

/**
 * @author Daniella Burgess 219446482
 * This is ContactTypeFactory.java
 * Date 05 April 2022
 */

public class ContactTypeFactory {

    public static ContactType createContactType(String contactName, String contactDescription) {

        int contactTypeId = DaniellaHelper.ContactTypeId();
         ContactType contactType = new ContactType.Builder().contactTypeId(contactTypeId)
                .contactName(contactName)
                .contactDescription(contactDescription)
                .build();
         return contactType;
    }
}
