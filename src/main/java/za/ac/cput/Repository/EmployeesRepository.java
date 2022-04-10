package za.ac.cput.Repository;

/* EmployeesRepository.java
   Repository for the EmployeesRepository
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Employees;

import java.util.HashSet;
import java.util.Set;

public class EmployeesRepository implements IEmployeesRepository{
    private static EmployeesRepository repository = null;
    private Set<Employees> employeesDB = null;

    private EmployeesRepository() {
        employeesDB = new HashSet<Employees>();
    }

    public static EmployeesRepository getRepository() {
        if (repository == null) {
            repository = new EmployeesRepository();
        }
        return repository;
    }

    @Override
    public Employees create(Employees employees) {
        boolean success = employeesDB.add(employees);
        if (!success)
        return null;
        return employees;
    }

    @Override
    public Employees read(String employeeNumber) {
        for (Employees e : employeesDB) {
            if (e.getEmployeeNumber().equals(employeeNumber))
                return e;
        }
        return null;
    }

    @Override
    public Employees update(Employees employees) {
        Employees oldEmployees = read(employees.getEmployeeNumber());
        if (oldEmployees != null){
            employeesDB.remove(oldEmployees);
            employeesDB.add(employees);
            return employees;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeNumber) {
        Employees employeesToDelete = read(employeeNumber);
        if (employeesToDelete == null)
        return false;
        employeesDB.remove(employeesToDelete);
        return true;
    }

    @Override
    public Set<Employees> getAll() {
        return employeesDB;
    }
}
