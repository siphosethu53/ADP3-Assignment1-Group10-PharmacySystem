package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
//@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeServiceImplTest {


    private static Employee employee1 = EmployeeFactory.createEmployee("001", "male", "Zaeem", "","Petersen" );
    private static Employee employee2 = EmployeeFactory.createEmployee("002", "male", "Waseem", "","Dollie" );

    @Autowired
    private EmployeeService empService;

    @Test
    void save() {
        Employee create1 = empService.save(this.employee1);
        Employee create2 = empService.save(this.employee2);
        assertEquals(this.employee1,create1);
        //assertEquals(this.employee2,create2);
        System.out.println(create1);
        //System.out.println(create2);
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}