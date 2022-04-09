package Factory;

/**EmployeeContactFactory.java
 * Factory for EmployeeContact
 * Author: Daniella Burgess (219446482)
 * Date: 07 April 2022
 */

import Entity.EmployeeContact;
import Util.DaniellaHelper;

public class EmployeeContactFactory {

    public static EmployeeContact createEmployeeContact(String typeId, String empContact, String conDescription) {

        String employeeContactId = DaniellaHelper.EmployeeContactId();
         EmployeeContact employeeContact = new EmployeeContact.Builder().employeeContactId(employeeContactId)
                .typeId(typeId)
                .empContact(empContact)
                .conDescription(conDescription)
                .build();

         return employeeContact;
    }


}

