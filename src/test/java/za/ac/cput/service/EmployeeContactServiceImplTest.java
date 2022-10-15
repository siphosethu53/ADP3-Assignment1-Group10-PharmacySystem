/*EmployeeContactServiceImplTest.java
 *EmployeeContactServiceImplTest class for EmployeeContactServiceImpl
 * Author: Daniella Burgess 219446482
 * Date: 13 October 2022
 */

package za.ac.cput.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.core.annotation.Order;
import za.ac.cput.domain.EmployeeContact;
import za.ac.cput.factory.EmployeeContactFactory;
import za.ac.cput.repository.EmployeeContactRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EmployeeContactServiceImplTest {
    private EmployeeContactServiceImpl employeeContactService;

    private static EmployeeContact employeeContact = EmployeeContactFactory.build("01", "0672664466","burgessdanilla@gmail.com");


    @Mock
    EmployeeContactRepository employeeContactRepository;
    @BeforeEach
    void setUp(){
        employeeContactService = new EmployeeContactServiceImpl(employeeContactRepository);
    }

    @Test
    @Order(1)
    void save(){
        employeeContactService.save(employeeContact);
        ArgumentCaptor<EmployeeContact> argumentCaptor = ArgumentCaptor.forClass(EmployeeContact.class);
        verify(employeeContactRepository).save(argumentCaptor.capture());
        EmployeeContact capturedEmployeeContact = argumentCaptor.getValue();
        assertThat(capturedEmployeeContact).isEqualTo(employeeContact);
        System.out.println(employeeContact);
    }

    @Test
    @Order(2)
    void read(){
        employeeContactService.read("01");
        verify(employeeContactRepository).findById(employeeContact.getStaffId());
        assertNotNull(employeeContact.getStaffId());
        System.out.println(employeeContact);
    }

    @Test
    @Order(4)
    void delete(){
        employeeContactService.delete("01");
        verify(employeeContactRepository).existsById(employeeContact.getStaffId());
        System.out.println("Id " + employeeContact.getStaffId() +" has been deleted successfully");
    }

    @Test
    @Order(3)
    void getAll(){
        employeeContactService.getAll();
        verify(employeeContactRepository).findAll();
        System.out.println(employeeContact);
    }
}
