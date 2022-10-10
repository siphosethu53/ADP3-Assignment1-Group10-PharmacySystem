package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Name;
import za.ac.cput.util.Helper;
import za.ac.cput.util.StringHelper;

public class EmployeeFactory {
    public static Employee createEmployee(String staffId, String email, String firstName, String middleName, String lastName){

        //Checks if ID or email is empty
        if(StringHelper.isNullorEmpty(staffId) || StringHelper.isNullorEmpty(email))
            throw new IllegalArgumentException("Staff ID or Email is null or empty");

        //Checks if email is valid or not
        if (!Helper.isValidEmail(email))
            throw new IllegalArgumentException("Email is not valid");

        //checks if name is null or not
        Name name = NameFactory.createName(firstName, middleName, lastName);
        if (name == null)
            throw new IllegalArgumentException("Name is Null or empty");

        return new Employee.Builder().staffId(staffId)
                .email(email)
                .name(name)
                .build();

    }
}
