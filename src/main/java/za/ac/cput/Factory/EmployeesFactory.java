package za.ac.cput.Factory;

/* EmployeesFactory.java
   Factory for the EmployeesFactory
   Author: Waseem Dollie (216040566)
   Date: 7 April 2022
*/

import za.ac.cput.Entity.Employees;
import za.ac.cput.Util.WaseemHelper;

public class EmployeesFactory {
    public static Employees createEmployee(String employeeName, String employeeContactNumber, int doctorID, int cashierID, int secretaryID)
    {
        String employeeID= WaseemHelper.employeeNumber();
        Employees employees=new Employees.Builder().setEmployeeNumber(employeeID)
                .setDoctorId (doctorID)
                .setSecretaryID(secretaryID)
                .setCashierID(cashierID)
                .setEmployeeName(employeeName)
                .setEmployeeContactNumber(employeeContactNumber)
                .build();
        return employees;
    }
}

