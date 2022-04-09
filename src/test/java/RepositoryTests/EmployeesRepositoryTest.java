package RepositoryTests;

/* EmployeesRepositoryTest.java
   Test for the EmployeesRepositoryTest
   Author: Waseem Dollie (216040566)
   Date: 9 April 2022
*/

import Entity.Employees;
import Factory.EmployeesFactory;
import Repository.EmployeesRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeesRepositoryTest {
    private static EmployeesRepository repository = EmployeesRepository.getRepository();
    private static Employees employees = EmployeesFactory.createEmployee
            ("Waseem", "0796426362",1 ,1, 1);


    @Test
    void a_create() {
        Employees created = repository.create(employees);
        assertEquals(employees.getEmployeeNumber(), created.getEmployeeNumber());
        System.out.println("Create:" + created);
    }

    @Test
    void b_read() {
        Employees read = repository.read(employees.getEmployeeNumber());
        assertNotNull(read);
        System.out.println("read:" + read);
    }

    @Test
    void c_update() {
        Employees updated = new Employees.Builder().copy(employees).setEmployeeName("Chad")
                .setEmployeeContactNumber("0834269956")
                .setDoctorId(2)
                .setCashierID(2)
                .setSecretaryID(2)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(employees.getEmployeeNumber());
        assertTrue(success);
        System.out.println("Deleted:" + true);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}