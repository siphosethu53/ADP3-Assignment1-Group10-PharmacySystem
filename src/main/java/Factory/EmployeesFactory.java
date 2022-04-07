package Factory;

import Entity.Employees;
import Util.WaseemHelper;

public class EmployeesFactory {
    public static Employees createEmployee(int doctorID, int secretaryID, int cashierID, String employeeName, String employeeContactNumber)
    {
        String employeeID= WaseemHelper.employeeNumber();
        Employees employees=new Employees.Builder().setEmployeeNumber(employeeID)
                .setDoctorId(doctorID)
                .setSecretaryID(secretaryID)
                .setCashierID(cashierID)
                .setEmployeeName(employeeName)
                .setEmployeeContactNumber(employeeContactNumber)
                .build();
        return employees;
    }
}

