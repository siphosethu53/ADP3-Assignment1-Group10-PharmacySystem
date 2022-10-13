package za.ac.cput.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.domain.SupplierContact;
import za.ac.cput.factory.SupplierContactFactory;
import za.ac.cput.repository.SupplierContactRepository;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SupplierContactServiceImplTest {
    private SupplierContactServiceImpl supplierContactService;
    private static SupplierContact supplierContact = SupplierContactFactory
            .createSupplierContact("7","0846541234","219466424@mycput.ac.za");
    @Mock
    SupplierContactRepository supplierContactRepository;

    @BeforeEach
    void setUp(){
       supplierContactService = new SupplierContactServiceImpl(supplierContactRepository);
    }

    @Test
    void save() {
        supplierContactService.save(supplierContact);
        ArgumentCaptor<SupplierContact> argumentCaptor = ArgumentCaptor.forClass(SupplierContact.class);
        verify(supplierContactRepository).save(argumentCaptor.capture());
        SupplierContact capturedSupplierContact = argumentCaptor.getValue();
        assertThat(capturedSupplierContact).isEqualTo(supplierContact);
        System.out.println(supplierContact);
        }

    @Test
    void read() {
        supplierContactService.read("7");
        verify(supplierContactRepository).findById(supplierContact.getSuppId());
        assertNotNull(supplierContact.getSuppId());
        System.out.println(supplierContact);
    }

    @Test
    void delete() {
        supplierContactService.delete("7");
        verify(supplierContactRepository).existsById(supplierContact.getSuppId());
        System.out.println("ID " + supplierContact.getSuppId() +" has been deleted");
    }

    @Test
    void getAll() {
        supplierContactService.getAll();
        verify(supplierContactRepository).findAll();
        System.out.println(supplierContact);
    }
}