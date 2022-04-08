package Factory;

import Entity.EmployeeContact;
import Util.DaniellaHelper;

/**
 * @author Daniella Burgess 219446482
 * This is EmployeeContactFactory.java
 * Date 05 April 2022
 */

public class EmployeeContactFactory {

    public static EmployeeContact createEmployeeContact(int typeId, String empContact, String conDescription) {

        int employeeContactId = DaniellaHelper.EmployeeContactId();
         EmployeeContact employeeContact = new EmployeeContact.Builder().employeeContactId(employeeContactId)
                .typeId(typeId)
                .empContact(empContact)
                .conDescription(conDescription)
                .build();

         return employeeContact;
    }


}

