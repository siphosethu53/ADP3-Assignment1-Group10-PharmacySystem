package za.ac.cput.Factory;

/* EmployeesFactoryTest.java
   Test for the EmployeesFactoryTest
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import za.ac.cput.Entity.Employees;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesFactoryTest {

    @Test
    public void createEmployee() {
        Employees employees = EmployeesFactory.createEmployee
                ("Waseem", "0796426362", 1, 1, 1);
        System.out.println(employees);
        assertNotNull(employees);
    }
}